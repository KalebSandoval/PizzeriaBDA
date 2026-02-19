package persistencia.dominio;

/**
 * Clase que representa el detalle de un Pedido dentro del sistema.
 *
 * <p>
 * Un DetallePedido corresponde a una línea específica dentro de un pedido,
 * indicando qué pizza se solicitó, en qué cantidad, el precio aplicado y
 * cualquier nota adicional.</p>
 *
 * <p>
 * Esta clase funciona como una entidad intermedia entre {@code Pedido} y
 * {@code Pizza}, permitiendo que un pedido contenga múltiples pizzas y que una
 * misma pizza pueda aparecer en distintos pedidos.</p>
 *
 * <p>
 * También incluye el cálculo del subtotal basado en la cantidad solicitada y el
 * precio de la pizza.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class DetallePedido {

    /**
     * Identificador único del detalle del pedido.
     */
    private int idDetallePedido;

    /**
     * Precio unitario aplicado a la pizza dentro del pedido.
     */
    private double precio;

    /**
     * Nota adicional asociada al detalle del pedido (por ejemplo: sin cebolla,
     * extra queso, etc.).
     */
    private String nota;

    /**
     * Cantidad de pizzas solicitadas en este detalle.
     */
    private int cantidad;

    /**
     * Pedido al que pertenece este detalle.
     */
    private Pedido pedido;

    /**
     * Pizza asociada a este detalle.
     */
    private Pizza pizza;

    /**
     * Constructor por omisión.
     */
    public DetallePedido() {
    }

    /**
     * Constructor completo que incluye identificador.
     *
     * @param idDetallePedido identificador del detalle
     * @param precio precio unitario aplicado
     * @param nota nota adicional
     * @param cantidad cantidad solicitada
     * @param pedido pedido al que pertenece
     * @param pizza pizza solicitada
     */
    public DetallePedido(int idDetallePedido, double precio, String nota,
            int cantidad, Pedido pedido, Pizza pizza) {
        this.idDetallePedido = idDetallePedido;
        this.precio = precio;
        this.nota = nota;
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.pizza = pizza;
    }

    /**
     * Constructor sin identificador. Útil para registros nuevos antes de
     * persistencia.
     *
     * @param precio precio unitario aplicado
     * @param nota nota adicional
     * @param cantidad cantidad solicitada
     * @param pedido pedido al que pertenece
     * @param pizza pizza solicitada
     */
    public DetallePedido(double precio, String nota,
            int cantidad, Pedido pedido, Pizza pizza) {
        this.precio = precio;
        this.nota = nota;
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.pizza = pizza;
    }

    /**
     * Obtiene el identificador del detalle.
     *
     * @return id del detalle
     */
    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    /**
     * Establece el identificador del detalle.
     *
     * @param idDetallePedido nuevo identificador
     */
    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    /**
     * Obtiene el precio unitario.
     *
     * @return precio unitario
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio unitario.
     *
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la nota adicional.
     *
     * @return nota del detalle
     */
    public String getNota() {
        return nota;
    }

    /**
     * Establece una nota adicional.
     *
     * @param nota nueva nota
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * Obtiene la cantidad solicitada.
     *
     * @return cantidad de pizzas
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad solicitada.
     *
     * @param cantidad nueva cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el pedido asociado.
     *
     * @return pedido al que pertenece el detalle
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Establece el pedido asociado.
     *
     * @param pedido nuevo pedido
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * Obtiene la pizza asociada.
     *
     * @return pizza del detalle
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * Establece la pizza asociada.
     *
     * @param pizza nueva pizza
     */
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Calcula el subtotal del detalle del pedido.
     *
     * <p>
     * El subtotal se obtiene multiplicando el precio unitario de la pizza por
     * la cantidad solicitada.</p>
     *
     * @return subtotal del detalle
     */
    public double getSubtotal() {
        return precio * cantidad;
    }

    /**
     * Devuelve una representación en cadena del detalle del pedido.
     *
     * @return información textual del detalle
     */
    @Override
    public String toString() {
        return "DetallePedido{"
                + "idDetallePedido=" + idDetallePedido
                + ", precio=" + precio
                + ", nota=" + nota
                + ", cantidad=" + cantidad
                + ", pedido=" + pedido
                + '}';
    }
}
