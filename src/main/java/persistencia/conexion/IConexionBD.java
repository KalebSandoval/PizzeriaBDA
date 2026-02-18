package persistencia.conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Interfaz que define el contrato para la creación de conexiones a la base de
 * datos.
 *
 * Las clases que implementen esta interfaz deberán proporcionar la lógica
 * necesaria para establecer y retornar una conexión activa hacia la base de
 * datos configurada.
 *
 * Esta abstracción permite desacoplar la lógica de conexión del resto del
 * sistema, facilitando el mantenimiento y pruebas.
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public interface IConexionBD {

    /**
     * Crea y retorna una conexión activa a la base de datos.
     *
     * @return objeto {@link Connection} que representa la conexión establecida.
     * @throws SQLException si ocurre un error al intentar establecer la
     * conexión.
     */
    Connection crearConexion() throws SQLException;
}
