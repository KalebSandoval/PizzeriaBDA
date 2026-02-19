package persistencia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que implementa la interfaz {@link IConexionBD} y se encarga de
 * establecer la conexión con la base de datos.
 *
 * <p>
 * Esta clase utiliza {@link DriverManager} para crear una conexión a una base
 * de datos MySQL a partir de una cadena de conexión, un usuario y una
 * contraseña definidos como constantes.</p>
 *
 * <p>
 * Forma parte de la capa de persistencia y centraliza la lógica de conexión,
 * facilitando el mantenimiento y posibles cambios en la configuración de la
 * base de datos.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class ConexionBD implements IConexionBD {

    /**
     * Cadena de conexión a la base de datos. Incluye el protocolo JDBC, el
     * motor, la ubicación y el nombre de la base de datos.
     */
    private final String CADENA_CONEXION = "jdbc:mysql://localhost:3306/Pizzeria";

    /**
     * Usuario utilizado para autenticarse en la base de datos.
     */
    private final String USUARIO = "Papizza";

    /**
     * Contraseña utilizada para autenticarse en la base de datos.
     */
    private final String CONTRASENIA = "Papizza";

    /**
     * Crea y retorna una conexión activa a la base de datos.
     *
     * <p>
     * Utiliza el {@link DriverManager} para establecer la conexión con base en
     * la cadena de conexión, usuario y contraseña configurados.</p>
     *
     * @return objeto {@link Connection} que representa la conexión establecida.
     * @throws SQLException si ocurre un error al intentar conectarse a la base
     * de datos.
     */
    @Override
    public Connection crearConexion() throws SQLException {
        return DriverManager.getConnection(CADENA_CONEXION, USUARIO, CONTRASENIA);
    }
}
