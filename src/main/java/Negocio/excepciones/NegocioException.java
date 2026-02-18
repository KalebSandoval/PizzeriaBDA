package Negocio.excepciones;

/**
 * Excepción personalizada para la capa de negocio.
 *
 * <p>
 * Esta excepción representa errores relacionados con las reglas de negocio del
 * sistema, como validaciones incorrectas, operaciones no permitidas o estados
 * inválidos.</p>
 *
 * <p>
 * Se utiliza para separar claramente los errores de lógica de negocio de los
 * errores técnicos de persistencia o infraestructura.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class NegocioException extends Exception {

    /**
     * Constructor que crea una excepción con un mensaje descriptivo.
     *
     * @param message mensaje que describe la regla de negocio violada.
     */
    public NegocioException(String message) {
        super(message);
    }

    /**
     * Constructor que crea una excepción a partir de una causa.
     *
     * @param cause excepción original que provocó el error.
     */
    public NegocioException(Throwable cause) {
        super(cause);
    }
}
