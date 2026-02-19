package persistencia.daos;

import Negocio.DTOs.PedidoDTO;
import persistencia.dominio.Pedido;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * Interfaz que define las operaciones de persistencia relacionadas con la
 * entidad Pedido.
 *
 * Establece el contrato que deben cumplir las clases encargadas de gestionar
 * pedidos en la base de datos.
 *
 * Permite desacoplar la lógica de acceso a datos de la implementación concreta.
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public interface IPedidoDAO {

    /**
     * Inserta un nuevo pedido en la base de datos.
     *
     * @param pedido objeto Pedido que contiene la información a guardar
     * @return el pedido con el ID generado
     * @throws PersistenciaException si ocurre un error durante la inserción
     */
    public Pedido agregarPedido(Pedido pedido) throws PersistenciaException;

    /**
     * Actualiza la información de un pedido existente.
     *
     * @param pedido objeto Pedido con los datos actualizados
     * @return el pedido actualizado
     * @throws PersistenciaException si ocurre un error durante la actualización
     */
    public Pedido actualizarPedido(Pedido pedido) throws PersistenciaException;

    /**
     * Busca un pedido utilizando su identificador.
     *
     * @param id identificador del pedido
     * @return objeto Pedido encontrado
     * @throws PersistenciaException si no se encuentra el pedido o ocurre un
     * error
     */
    public Pedido buscarPedidoPorId(int id) throws PersistenciaException;
}
