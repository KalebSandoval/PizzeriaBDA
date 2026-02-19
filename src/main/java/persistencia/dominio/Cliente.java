package persistencia.dominio;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que representa la entidad Cliente dentro del sistema.
 *
 * <p>
 * Un Cliente es un tipo de Usuario que posee información personal adicional
 * como nombres, apellidos, estado de residencia, fecha de nacimiento y
 * domicilio.</p>
 *
 * <p>
 * La clase implementa un atributo derivado llamado edad, el cual se calcula
 * dinámicamente a partir de la fecha de nacimiento utilizando la clase
 * {@link java.time.Period}.</p>
 *
 * <p>
 * Hereda los atributos y comportamientos básicos de autenticación y control de
 * acceso desde la clase {@code Usuario}.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Cliente extends Usuario {

    /**
     * Id del cliente
     */
    private int idCliente;

    /**
     * Nombres del cliente.
     */
    private String nombres;

    /**
     * Apellido paterno del cliente.
     */
    private String apellidoPaterno;

    /**
     * Apellido materno del cliente.
     */
    private String apellidoMaterno;

    /**
     * Estado de residencia del cliente.
     */
    private String estado;

    /**
     * Fecha de nacimiento del cliente. Se utiliza para calcular la edad de
     * manera dinámica.
     */
    private LocalDate fechaNacimiento;

    /**
     * Domicilio asociado al cliente. Representa una relación de composición.
     */
    private Domicilio domicilio;

    /**
     * Constructor por omisión.
     */
    public Cliente() {
    }

    /**
     * Constructor completo que incluye el identificador del usuario.
     *
     * @param nombres nombres del cliente
     * @param apellidoPaterno apellido paterno del cliente
     * @param apellidoMaterno apellido materno del cliente
     * @param estado estado de residencia
     * @param fechaNacimiento fecha de nacimiento
     * @param domicilio domicilio asociado
     * @param idUsuario identificador único del usuario
     * @param contraseniaUsuario contraseña del usuario
     * @param nombreUsuario nombre de usuario para autenticación
     * @param rolUsuario rol asignado dentro del sistema
     */
    public Cliente(String nombres, String apellidoPaterno, String apellidoMaterno,
            String estado, LocalDate fechaNacimiento, Domicilio domicilio,
            int idUsuario, String contraseniaUsuario,
            String nombreUsuario, String rolUsuario) {
        super(idUsuario, contraseniaUsuario, nombreUsuario, rolUsuario);
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

    /**
     * Constructor para registros nuevos (sin identificador).
     *
     * @param nombres nombres del cliente
     * @param apellidoPaterno apellido paterno
     * @param apellidoMaterno apellido materno
     * @param estado estado de residencia
     * @param fechaNacimiento fecha de nacimiento
     * @param domicilio domicilio asociado
     * @param contraseniaUsuario contraseña
     * @param nombreUsuario nombre de usuario
     * @param rolUsuario rol dentro del sistema
     */
    public Cliente(String nombres, String apellidoPaterno, String apellidoMaterno,
            String estado, LocalDate fechaNacimiento, Domicilio domicilio,
            String contraseniaUsuario, String nombreUsuario, String rolUsuario) {
        super(contraseniaUsuario, nombreUsuario, rolUsuario);
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el id del cliente
     * @return id del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Modifica el id original del cliente
     * @param idCliente nuevo idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtiene los nombres del cliente.
     *
     * @return nombres del cliente
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Modifica los nombres del cliente.
     *
     * @param nombres nuevos nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene el apellido paterno.
     *
     * @return apellido paterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Modifica el apellido paterno.
     *
     * @param apellidoPaterno nuevo apellido paterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno.
     *
     * @return apellido materno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Modifica el apellido materno.
     *
     * @param apellidoMaterno nuevo apellido materno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene el estado de residencia.
     *
     * @return estado del cliente
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Modifica el estado de residencia.
     *
     * @param estado nuevo estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la fecha de nacimiento.
     *
     * @return fecha de nacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Modifica la fecha de nacimiento.
     *
     * @param fechaNacimiento nueva fecha
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el domicilio asociado.
     *
     * @return domicilio del cliente
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Modifica el domicilio asociado.
     *
     * @param domicilio nuevo domicilio
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Calcula la edad actual del cliente.
     *
     * <p>
     * Este es un atributo derivado, ya que no se almacena directamente, sino
     * que se obtiene a partir de la fecha de nacimiento comparada con la fecha
     * actual del sistema.</p>
     *
     * @return edad en años cumplidos
     */
    public int getEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }

    /**
     * Devuelve una representación en cadena del cliente.
     *
     * @return información textual del cliente
     */
    @Override
    public String toString() {
        return "Cliente{"
                + "nombres=" + nombres
                + ", apellidoPaterno=" + apellidoPaterno
                + ", apellidoMaterno=" + apellidoMaterno
                + ", estado=" + estado
                + ", fechaNacimiento=" + fechaNacimiento
                + ", domicilio=" + domicilio
                + '}';
    }
}
