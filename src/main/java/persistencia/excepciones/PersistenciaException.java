package persistencia.excepciones;

/**
 * Excepción personalizada para la capa de persistencia.
 *
 * <p>
 * Esta excepción se utiliza para representar errores que ocurren durante
 * operaciones relacionadas con el acceso a datos, como fallos en consultas SQL,
 * problemas de conexión o errores al interactuar con la base de datos.</p>
 *
 * <p>
 * Permite encapsular excepciones de bajo nivel y propagar información clara
 * hacia capas superiores del sistema.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class PersistenciaException extends Exception {

    /**
     * Constructor que crea una excepción con un mensaje descriptivo.
     *
     * @param message mensaje que describe el error ocurrido
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * Constructor que crea una excepción con un mensaje descriptivo y la causa
     * original del error.
     *
     * @param message mensaje que describe el error ocurrido
     * @param cause excepción original que provocó el error
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }
}
