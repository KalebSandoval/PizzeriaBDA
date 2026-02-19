package persistencia.dominio;

/**
 * Clase que representa a un Usuario del sistema.
 *
 * <p>
 * Un Usuario contiene la información básica necesaria para la autenticación y
 * autorización dentro del sistema, como nombre de usuario, contraseña y
 * rol.</p>
 *
 * <p>
 * Esta clase funciona como clase base para otros tipos de usuarios, como
 * {@code Cliente} y {@code Empleado}, permitiendo reutilizar atributos y
 * comportamientos comunes.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Usuario {

    /**
     * Identificador único del usuario.
     */
    private int idUsuario;

    /**
     * Contraseña del usuario para el acceso al sistema.
     */
    private String contraseniaUsuario;

    /**
     * Nombre de usuario utilizado para iniciar sesión.
     *
     * Username
     */
    private String nombreUsuario;

    /**
     * Rol asignado al usuario dentro del sistema (por ejemplo: CLIENTE,
     * EMPLEADO, ADMINISTRADOR).
     */
    private String rolUsuario;

    /**
     * Constructor por omisión.
     */
    public Usuario() {
    }

    /**
     * Constructor completo que incluye el identificador del usuario.
     *
     * @param idUsuario identificador único
     * @param contraseniaUsuario contraseña del usuario
     * @param nombreUsuario nombre de usuario
     * @param rolUsuario rol del usuario
     */
    public Usuario(int idUsuario, String contraseniaUsuario,
            String nombreUsuario, String rolUsuario) {
        this.idUsuario = idUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rolUsuario = rolUsuario;
    }

    /**
     * Constructor sin identificador. Útil para crear usuarios nuevos antes de
     * ser persistidos.
     *
     * @param contraseniaUsuario contraseña del usuario
     * @param nombreUsuario nombre de usuario
     * @param rolUsuario rol del usuario
     */
    public Usuario(String contraseniaUsuario,
            String nombreUsuario, String rolUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rolUsuario = rolUsuario;
    }

    /**
     * Obtiene el identificador del usuario.
     *
     * @return id del usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param idUsuario nuevo identificador
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return contraseña del usuario
     */
    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param contraseniaUsuario nueva contraseña
     */
    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return nombre de usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param nombreUsuario nuevo nombre de usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene el rol del usuario.
     *
     * @return rol del usuario
     */
    public String getRolUsuario() {
        return rolUsuario;
    }

    /**
     * Establece el rol del usuario.
     *
     * @param rolUsuario nuevo rol
     */
    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    /**
     * Devuelve una representación en cadena del usuario.
     *
     * @return información textual del usuario
     */
    @Override
    public String toString() {
        return "Usuario{"
                + "idUsuario=" + idUsuario
                + ", contraseniaUsuario=" + contraseniaUsuario
                + ", nombreUsuario=" + nombreUsuario
                + ", rolUsuario=" + rolUsuario
                + '}';
    }
}
