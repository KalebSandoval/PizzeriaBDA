package persistencia.dominio;

/**
 * Clase que representa un número telefónico dentro del sistema.
 *
 * <p>
 * Un Teléfono está asociado a un {@code Usuario} y permite almacenar uno o
 * varios números de contacto para cada usuario.</p>
 *
 * <p>
 * El atributo {@code etiqueta} se utiliza para identificar el tipo de número
 * telefónico, por ejemplo: casa, móvil, trabajo, etc.</p>
 *
 * <p>
 * Esta clase permite modelar una relación uno a muchos, donde un usuario puede
 * tener múltiples teléfonos asociados.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Telefono {

    /**
     * Identificador único del teléfono.
     */
    private int idTelefono;

    /**
     * Número telefónico del usuario.
     */
    private String telefono;

    /**
     * Etiqueta descriptiva del teléfono (por ejemplo: casa, celular, trabajo).
     */
    private String etiqueta;

    /**
     * Usuario al que pertenece el teléfono.
     */
    private Usuario usuario;

    /**
     * Constructor por omisión.
     */
    public Telefono() {
    }

    /**
     * Constructor completo del teléfono.
     *
     * @param usuario usuario al que se asocia el teléfono
     * @param idTelefono identificador único del teléfono
     * @param telefono número telefónico
     * @param etiqueta tipo o descripción del teléfono
     */
    public Telefono(Usuario usuario, int idTelefono, String telefono, String etiqueta) {
        this.usuario = usuario;
        this.idTelefono = idTelefono;
        this.telefono = telefono;
        this.etiqueta = etiqueta;
    }

    /**
     * Obtiene el usuario asociado al teléfono.
     *
     * @return usuario propietario del teléfono
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario asociado al teléfono.
     *
     * @param usuario nuevo usuario propietario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el identificador del teléfono.
     *
     * @return identificador del teléfono
     */
    public int getIdTelefono() {
        return idTelefono;
    }

    /**
     * Establece el identificador del teléfono.
     *
     * @param idTelefono nuevo identificador
     */
    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    /**
     * Obtiene el número telefónico.
     *
     * @return número telefónico
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número telefónico.
     *
     * @param telefono nuevo número telefónico
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la etiqueta del teléfono.
     *
     * @return etiqueta descriptiva
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * Establece la etiqueta del teléfono.
     *
     * @param etiqueta nueva etiqueta
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * Devuelve una representación en cadena del teléfono.
     *
     * @return información textual del teléfono
     */
    @Override
    public String toString() {
        return "Telefono{"
                + "usuario=" + usuario
                + ", idTelefono=" + idTelefono
                + ", telefono=" + telefono
                + ", etiqueta=" + etiqueta
                + '}';
    }
}
