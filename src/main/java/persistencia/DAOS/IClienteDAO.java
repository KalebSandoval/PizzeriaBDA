/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package persistencia.DAOS;

import java.util.List;
import persistencia.dominio.Cliente;
import persistencia.dominio.Telefono;
import persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define las operaciones que se van a poder utilizar para la
 * entidad Cliente.
 * 
 * Proporciona los metodos que se tienen que implementar para interactuar con la 
 * base de datos
 * 

 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public interface IClienteDAO {

    /**
     * Registra un nuevo cliente en la base de datos.
     * 
     * El objeto Cliente debe de tener toda la informacion necesaria
     * para crear el registro
     * 
     * 
     * @param cliente objeto Cliente con los datos a almacenar
     * @return objeto Cliente registrado en la base de datos
     * @throws PersistenciaException si ocurre un error durante el registro.
     */
    Cliente agregarCliente(Cliente cliente) throws PersistenciaException;
    
    
    /**
     * Actualiza un cliente existente en la base de datos.
     * 
     * El objeto Tecnico debe de tener un identificador valido y
     * los nuevos valores a actualizar.
     * 
     * @param cliente objeto Cliente que se desea actualizar
     * @return objeto Cliente actualizado
     * @throws PersistenciaException si el cliente no existe u ocurre un error
     * al actualizarlo
     */
    Cliente actualizarCliente(Cliente cliente) throws PersistenciaException;
    
    /**
     * Buscar a un cliente especifico por id.
     * 
     * Se debe de ingresar un identificador(id) valido para la busqueda del cliente.
     * 
     * @param id del cliente a buscar.
     * @return cliente encontrado, o sea, registrado en la base de datos.
     * @throws PersistenciaException si el id es inválido o si ocurre algun error
     * en la busqueda.
     */
    Cliente buscarClientePorId(int id) throws PersistenciaException;
    
    /**
     * Consultar a todos los clientes registrados en la base de datos.
     * 
     * Se va obteniendo por registro en la base de datos cada cliente registrado
     * agregandolos en orden a la lista
     * 
     * @return la lista con los clientes registrados
     * @throws PersistenciaException si algo falla en la busqueda de
     * los clientes
     */
    List<Cliente> consultarClientes() throws PersistenciaException;
    
    /**
     * Obtener al cliente registrado a cierto telefono.
     * 
     * Se debe ingresar un telefono valido para la busqueda y en base a esto, se
     * encontrara al cliente asociado a ese telefono
     *
     * @param telefono
     * @return el cliente asociado al telefono
     * @throws PersistenciaException si el telefono es invalido o si ocurre
     * un error la realizar la busqueda.
     */
    Cliente obtenerClientePorTelefono(String telefono) throws PersistenciaException;
   
}

