package persistencia.dominio;

/**
 * Clase que representa el domicilio de un cliente dentro del sistema.
 *
 * <p>
 * Un Domicilio contiene la información necesaria para identificar la ubicación
 * física de un cliente, incluyendo número, calle, colonia y código postal.</p>
 *
 * <p>
 * Esta clase generalmente se utiliza como parte de una relación de composición
 * dentro de la clase {@code Cliente}, ya que un cliente posee un domicilio
 * asociado.</p>
 *
 * <p>
 * El domicilio es utilizado principalmente para la gestión de entregas a
 * domicilio en el sistema de pedidos.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Domicilio {

    /**
     * Identificador del domicilio
     */
    private int idDomicilio;

    /**
     * Número exterior o interior del domicilio.
     */
    private String numero;

    /**
     * Código postal correspondiente a la ubicación.
     */
    private String codigoPostal;

    /**
     * Nombre de la calle del domicilio.
     */
    private String calle;

    /**
     * Nombre de la colonia del domicilio.
     */
    private String colonia;

    /**
     * Constructor por omisión.
     */
    public Domicilio() {
    }

    /**
     * Constructor que inicializa todos los atributos del domicilio.
     *
     * @param numero número exterior o interior
     * @param codigoPostal código postal
     * @param calle nombre de la calle
     * @param colonia nombre de la colonia
     */
    public Domicilio(String numero, String codigoPostal, String calle, String colonia) {
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.colonia = colonia;
    }

    /**
     * Obtiene el id del domicilio guardado en la base de datos.
     *
     * @return el id del domicilio
     */
    public int getIdDomicilio() {
        return idDomicilio;
    }

    /**
     * Establece el id del domicilio.
     *
     * No se usara ya que es una para una PK, sin embargo puede funcionar para
     * pruebas.
     *
     * @param idDomicilio
     */
    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    /**
     * Obtiene el número del domicilio.
     *
     * @return número del domicilio
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número del domicilio.
     *
     * @param numero nuevo número
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el código postal.
     *
     * @return código postal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece el código postal.
     *
     * @param codigoPostal nuevo código postal
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return calle del domicilio
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     *
     * @param calle nueva calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la colonia.
     *
     * @return colonia del domicilio
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece el nombre de la colonia.
     *
     * @param colonia nueva colonia
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Devuelve una representación en cadena del domicilio.
     *
     * @return información textual del domicilio
     */
    @Override
    public String toString() {
        return "Domicilio{"
                + "numero=" + numero
                + ", codigoPostal=" + codigoPostal
                + ", calle=" + calle
                + ", colonia=" + colonia
                + '}';
    }
}
