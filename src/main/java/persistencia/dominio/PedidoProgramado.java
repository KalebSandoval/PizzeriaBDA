package persistencia.dominio;

import java.time.LocalDate;

/**
 * Clase que representa un Pedido Programado.
 *
 * <p>
 * Un pedido programado se asocia a un cliente específico y puede contar con un
 * cupón de descuento. Este tipo de pedido permite planificar entregas para una
 * fecha determinada.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class PedidoProgramado extends Pedido {

    /**
     * Número interno del pedido programado.
     */
    private int numPedido;

    /**
     * Cliente asociado al pedido.
     */
    private Cliente cliente;

    /**
     * Cupón aplicado al pedido (opcional).
     */
    private Cupon cupon;

    /**
     * Constructor por omisión.
     */
    public PedidoProgramado() {
    }

    /**
     * Constructor completo con identificador.
     *
     * @param numPedido número del pedido
     * @param cliente cliente asociado
     * @param cupon cupón aplicado
     * @param idPedido identificador del pedido
     * @param nota nota adicional
     * @param estadoActual estado actual
     * @param fechaHoraPedido fecha y hora del pedido
     * @param fechaHoraEntrega fecha y hora de entrega
     */
    public PedidoProgramado(int numPedido, Cliente cliente, Cupon cupon,
            int idPedido, String nota, String estadoActual,
            LocalDate fechaHoraPedido, LocalDate fechaHoraEntrega) {
        super(idPedido, nota, estadoActual, fechaHoraPedido, fechaHoraEntrega);
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.cupon = cupon;
    }

    /**
     * Constructor sin identificador.
     *
     * @param numPedido número del pedido
     * @param cliente cliente asociado
     * @param cupon cupón aplicado
     * @param nota nota adicional
     * @param estadoActual estado actual
     * @param fechaHoraPedido fecha y hora del pedido
     * @param fechaHoraEntrega fecha y hora de entrega
     */
    public PedidoProgramado(int numPedido, Cliente cliente, Cupon cupon,
            String nota, String estadoActual,
            LocalDate fechaHoraPedido, LocalDate fechaHoraEntrega) {
        super(nota, estadoActual, fechaHoraPedido, fechaHoraEntrega);
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.cupon = cupon;
    }

    /**
     * @return número del pedido
     */
    public int getNumPedido() {
        return numPedido;
    }

    /**
     * @param numPedido nuevo número
     */
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    /**
     * @return cliente asociado
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente nuevo cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return cupón aplicado
     */
    public Cupon getCupon() {
        return cupon;
    }

    /**
     * @param cupon nuevo cupón
     */
    public void setCupon(Cupon cupon) {
        this.cupon = cupon;
    }
}
