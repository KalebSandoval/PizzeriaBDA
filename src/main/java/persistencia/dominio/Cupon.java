package persistencia.dominio;

import java.time.LocalDate;

/**
 * Clase que representa un Cupón de descuento dentro del sistema.
 *
 * <p>
 * Un cupón permite aplicar un porcentaje de descuento a una compra siempre y
 * cuando se encuentre dentro de su periodo de vigencia.</p>
 *
 * <p>
 * La clase controla la información básica del cupón, como su identificador,
 * porcentaje de descuento, fecha de vigencia y la cantidad de usos
 * permitidos.</p>
 *
 * <p>
 * El atributo {@code cantidadUsos} es estático, lo que significa que su valor
 * es compartido por todos los cupones creados en el sistema.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Cupon {

    /**
     * Identificador único del cupón.
     */
    private int idCupon;

    /**
     * Cantidad de usos permitidos o registrados para los cupones. Este atributo
     * es compartido por todas las instancias de la clase.
     */
    private static int cantidadUsos;

    /**
     * Porcentaje de descuento que aplica el cupón. Se expresa como un valor
     * decimal (por ejemplo, 15.0 representa 15%).
     */
    private double porcentajeDescuento;

    /**
     * Fecha de vigencia del cupón. Indica hasta qué fecha el cupón puede ser
     * utilizado.
     */
    private LocalDate vigencia;
    
    /**
     * Constructor por omisión.
     */
    public Cupon() {
    }
    
    /**
     * Constructor que crea un cupón con identificador.
     *
     * @param idCupon identificador único del cupón
     * @param porcentajeDescuento porcentaje de descuento aplicado
     * @param vigencia fecha límite de uso del cupón
     */
    public Cupon(int idCupon, double porcentajeDescuento, LocalDate vigencia) {
        this.idCupon = idCupon;
        this.porcentajeDescuento = porcentajeDescuento;
        this.vigencia = vigencia;
    }

    /**
     * Constructor que crea un cupón sin identificador. Útil para registros
     * nuevos antes de ser persistidos.
     *
     * @param porcentajeDescuento porcentaje de descuento aplicado
     * @param vigencia fecha límite de uso del cupón
     */
    public Cupon(double porcentajeDescuento, LocalDate vigencia) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.vigencia = vigencia;
    }

    /**
     * Obtiene el identificador del cupón.
     *
     * @return identificador del cupón
     */
    public int getIdCupon() {
        return idCupon;
    }

    /**
     * Establece el identificador del cupón.
     *
     * @param idCupon nuevo identificador
     */
    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
    }

    /**
     * Obtiene la cantidad de usos del cupón.
     *
     * @return cantidad de usos
     */
    public static int getCantidadUsos() {
        return cantidadUsos;
    }

    /**
     * Establece la cantidad de usos del cupón.
     *
     * @param cantidadUsos nueva cantidad de usos
     */
    public static void setCantidadUsos(int cantidadUsos) {
        Cupon.cantidadUsos = cantidadUsos;
    }

    /**
     * Obtiene el porcentaje de descuento del cupón.
     *
     * @return porcentaje de descuento
     */
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Establece el porcentaje de descuento del cupón.
     *
     * @param porcentajeDescuento nuevo porcentaje de descuento
     */
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    /**
     * Obtiene la fecha de vigencia del cupón.
     *
     * @return fecha de vigencia
     */
    public LocalDate getVigencia() {
        return vigencia;
    }

    /**
     * Establece la fecha de vigencia del cupón.
     *
     * @param vigencia nueva fecha de vigencia
     */
    public void setVigencia(LocalDate vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Devuelve una representación en cadena del cupón.
     *
     * @return información textual del cupón
     */
    @Override
    public String toString() {
        return "Cupon{"
                + "idCupon=" + idCupon
                + ", porcentajeDescuento=" + porcentajeDescuento
                + ", vigencia=" + vigencia
                + '}';
    }
}
