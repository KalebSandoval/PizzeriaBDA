/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package persistencia.DAOS;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.conexion.IConexionBD;
import persistencia.dominio.Cliente;
import persistencia.excepciones.PersistenciaException;

/**
 * Implementación del DAO para la entidad Cliente
 * 
 * <p>
 * Esta clase se encarga de toda la comunicación con la base de datos para la
 * entidad Cliente.</p>
 * 
 * <p>
 * Incluye las operaciones basicas CRUD(Create, Read, Update, Delete) que toma
 * de la tabla Clientes de la BD</p>
 * 
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */


public class ClienteDAO implements IClienteDAO{
    
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
    private static final Logger LOG = Logger.getLogger(ClienteDAO.class.getName());

    /**
     * Constructor que inicializa la dependencia de conexión.
     *
     * @param conexionBD objeto que gestiona la creación de conexiones a la base
     * de datos
     */
    public ClienteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException {
        String comandoSQL = """
                            INSERT INTO clientes
                            	(nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, idDomicilioCliente)
                            VALUES
                            	(?, ?, ?, ?, ?);
                            """;
        try (Connection conn = this.conexionBD.crearConexion(); PreparedStatement ps = conn.prepareStatement(comandoSQL)){
        
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidoPaterno());
            
            if(cliente.getApellidoMaterno() != null){
                ps.setString(3, cliente.getApellidoMaterno());
            } else {
                ps.setNull(3, Types.VARCHAR);
            }
            
            ps.setDate(4, Date.valueOf(cliente.getFechaNacimiento()));
            ps.setInt(5, cliente.getDomicilio().getIdDomicilio());
            
            int filasInsertadas = ps.executeUpdate();
            if(filasInsertadas == 0){
                LOG.warning("No se pudo insertar al cliente: "+cliente);
                throw new PersistenciaException("No se logró agregar al cliente.");
            }
            
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    cliente.setIdCliente(rs.getInt(1));
                } else {
                    throw new PersistenciaException("Error al obtener el ID generado del nuevo cliente.");
                }
            }

            LOG.info("Cliente insertado con éxito. ID: "+ cliente.getIdCliente());
            return cliente;
            
        } catch (SQLException ex) {
            LOG.severe("Error SQL al insertar al cliente"+ ex);
            throw new PersistenciaException("Error al insertar al cliente en la base de datos", ex);
        }
    }   

    @Override
    public Cliente actualizarCliente(Cliente cliente) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente buscarClientePorId(int id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> consultarClientes() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente obtenerClientePorTelefono(String telefono) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
