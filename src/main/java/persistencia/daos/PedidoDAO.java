package persistencia.daos;

import Negocio.DTOs.PedidoDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.conexion.IConexionBD;
import persistencia.dominio.Pedido;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * Clase que implementa las operaciones de persistencia relacionadas con la
 * entidad Pedido.
 *
 * Se encarga de insertar, actualizar y consultar pedidos en la base de datos.
 *
 * Forma parte de la capa de persistencia y utiliza una conexión inyectada para
 * reducir el acoplamiento.
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class PedidoDAO implements IPedidoDAO {

    /**
     * Componente encargado de crear conexiones con la base de datos.
     *
     * Se inyecta por constructor para reducir acoplamiento y facilitar pruebas.
     */
    private final IConexionBD conexionBD;

    /**
     * Logger para registrar información relevante durante operaciones de
     * persistencia.
     */
    private static final Logger LOG = Logger.getLogger(PedidoDAO.class.getName());

    /**
     * Constructor que inicializa la dependencia de conexión.
     *
     * @param conexionBD objeto que gestiona la creación de conexiones a la base
     * de datos
     */
    public PedidoDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Inserta un nuevo pedido en la base de datos.
     *
     * @param pedido objeto Pedido que contiene la información a guardar
     * @return el pedido con el ID generado por la base de datos
     * @throws PersistenciaException si ocurre un error durante la inserción
     */
    @Override
    public Pedido agregarPedido(Pedido pedido) throws PersistenciaException {
        String comandoSQL = """
                            INSERT INTO pedidos(
                                estadoActual, fechaHoraPedido, fechaHoraEntrega, nota
                            ) VALUES(
                               ?, ?, ?, ?
                            )
                            """;

        try (Connection conn = this.conexionBD.crearConexion(); PreparedStatement ps = conn.prepareStatement(comandoSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, pedido.getEstadoActual());
            ps.setDate(2, java.sql.Date.valueOf(pedido.getFechaHoraPedido()));
            ps.setDate(3, java.sql.Date.valueOf(pedido.getFechaHoraEntrega()));
            ps.setString(4, pedido.getNota());

            int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas == 0) {
                LOG.warning(() -> "No se pudo insertar el pedido: " + pedido.toString());
                throw new PersistenciaException("No se logró agregar el pedido.");
            }

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    pedido.setIdPedido(rs.getInt(1));
                } else {
                    throw new PersistenciaException("Error al obtener el ID generado del nuevo pedido.");
                }
            }

            LOG.info(() -> "Pedido insertado con éxito. ID: " + pedido.getIdPedido());
            return pedido;

        } catch (SQLException ex) {
            LOG.severe(() -> "Error SQL al insertar el pedido " + ex);
            throw new PersistenciaException("Error al insertar el pedido en la base de datos", ex);
        }
    }

    /**
     * Actualiza la información de un pedido existente en la base de datos.
     *
     * @param pedido objeto Pedido con los datos actualizados
     * @return el pedido actualizado
     * @throws PersistenciaException si ocurre un error durante la actualización
     */
    @Override
    public Pedido actualizarPedido(Pedido pedido) throws PersistenciaException {
        String comandoSQL = """
                            UPDATE pedidos
                            SET estadoActual = ?,
                                fechaHoraPedido = ?,
                                fechaHoraEntrega = ?,
                                nota = ?
                            WHERE idPedido = ?;
                            """;

        try (Connection conn = this.conexionBD.crearConexion(); PreparedStatement ps = conn.prepareStatement(comandoSQL)) {

            ps.setString(1, pedido.getEstadoActual());
            ps.setDate(2, java.sql.Date.valueOf(pedido.getFechaHoraPedido()));
            ps.setDate(3, java.sql.Date.valueOf(pedido.getFechaHoraEntrega()));
            ps.setString(4, pedido.getNota());
            ps.setInt(5, pedido.getIdPedido());

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas == 0) {
                LOG.warning(() -> "No se pudo actualizar el pedido: " + pedido.toString());
                throw new PersistenciaException("No se logró actualizar el pedido.");
            }

            LOG.info(() -> "Pedido actualizado con éxito. Descripción: " + pedido.toString());
            return pedido;

        } catch (SQLException ex) {
            LOG.severe(() -> "Error SQL al actualizar el pedido " + ex);
            throw new PersistenciaException("Error al actualizar el pedido en la base de datos", ex);
        }
    }

    /**
     * Busca un pedido en la base de datos utilizando su identificador.
     *
     * @param id identificador del pedido a buscar
     * @return objeto Pedido encontrado
     * @throws PersistenciaException si el pedido no existe o ocurre un error
     */
    @Override
    public Pedido buscarPedidoPorId(int id) throws PersistenciaException {
        String comandoSQL = """
                            SELECT 
                                idPedido, estadoActual, fechaHoraPedido, fechaHoraEntrega, nota
                            FROM pedidos
                            WHERE idPedido = ?
                            """;

        try (Connection conn = this.conexionBD.crearConexion(); PreparedStatement ps = conn.prepareStatement(comandoSQL)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (!rs.next()) {
                    LOG.log(Level.WARNING, "No se encontró el pedido con id {0}", id);
                    throw new PersistenciaException("No existe el pedido con el ID proporcionado.");
                }

                return extraerPedido(rs);
            }

        } catch (SQLException ex) {
            LOG.severe("Error SQL al buscar el pedido " + ex);
            throw new PersistenciaException("Error al buscar el pedido en la base de datos", ex);
        }
    }

    /**
     * Extrae la información de un ResultSet y construye un objeto Pedido con
     * los datos obtenidos.
     *
     * @param rs resultado de la consulta ejecutada
     * @return objeto Pedido con la información extraída
     * @throws PersistenciaException si ocurre un error al leer los datos
     */
    public Pedido extraerPedido(ResultSet rs) throws PersistenciaException {
        try {
            Pedido pedido = new Pedido();
            pedido.setIdPedido(rs.getInt("idPedido"));
            pedido.setEstadoActual(rs.getString("estadoActual"));

            Date fechaHoraPedido = rs.getDate("fechaHoraPedido");
            Date fechaHoraEntrega = rs.getDate("fechaHoraEntrega");

            pedido.setFechaHoraPedido(fechaHoraPedido.toLocalDate());
            pedido.setFechaHoraEntrega(fechaHoraEntrega.toLocalDate());
            pedido.setNota(rs.getString("nota"));

            return pedido;

        } catch (SQLException ex) {
            LOG.severe("Error al extraer el pedido " + ex);
            throw new PersistenciaException("Error al extraer el pedido.");
        }
    }
}
