package persistencia.dominio;

/**
 * Clase que representa a un Empleado del sistema.
 *
 * <p>
 * Un Empleado es un tipo de {@code Usuario} que cuenta con un puesto específico
 * dentro de la organización, el cual define sus responsabilidades y
 * permisos.</p>
 *
 * <p>
 * Esta clase hereda los atributos de autenticación desde {@code Usuario} y
 * agrega información propia del empleado.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Empleado extends Usuario {

    /**
     * Puesto que desempeña el empleado dentro de la organización (por ejemplo:
     * cajero, repartidor, administrador).
     */
    private String puestoEmpleado;

    /**
     * Constructor por omisión.
     */
    public Empleado() {
    }

    /**
     * Constructor completo que incluye identificador.
     *
     * @param idUsuario identificador del usuario
     * @param contraseniaUsuario contraseña del usuario
     * @param nombreUsuario nombre de usuario
     * @param rolUsuario rol asignado
     * @param puestoEmpleado puesto del empleado
     */
    public Empleado(int idUsuario, String contraseniaUsuario,
            String nombreUsuario, String rolUsuario,
            String puestoEmpleado) {
        super(idUsuario, contraseniaUsuario, nombreUsuario, rolUsuario);
        this.puestoEmpleado = puestoEmpleado;
    }

    /**
     * Constructor sin identificador. Útil para registrar nuevos empleados.
     *
     * @param puestoEmpleado puesto del empleado
     * @param contraseniaUsuario contraseña del usuario
     * @param nombreUsuario nombre de usuario
     * @param rolUsuario rol asignado
     */
    public Empleado(String puestoEmpleado, String contraseniaUsuario,
            String nombreUsuario, String rolUsuario) {
        super(contraseniaUsuario, nombreUsuario, rolUsuario);
        this.puestoEmpleado = puestoEmpleado;
    }

    /**
     * Obtiene el puesto del empleado.
     *
     * @return puesto del empleado
     */
    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    /**
     * Establece el puesto del empleado.
     *
     * @param puestoEmpleado nuevo puesto
     */
    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
}
