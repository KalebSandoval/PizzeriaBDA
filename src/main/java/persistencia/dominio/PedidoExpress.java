package persistencia.dominio;

import java.time.LocalDate;

/**
 * Clase que representa un Pedido Express.
 *
 * <p>
 * Un pedido express se caracteriza por contar con un PIN y un folio únicos,
 * permitiendo una identificación rápida del pedido sin necesidad de asociarlo
 * directamente a un cliente.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class PedidoExpress extends Pedido {

    /**
     * PIN de seguridad del pedido express.
     */
    private int pin;

    /**
     * Folio identificador del pedido express.
     */
    private String folio;

    /**
     * Constructor por omisión.
     */
    public PedidoExpress() {
    }

    /**
     * Constructor completo con identificador.
     *
     * @param pin PIN del pedido
     * @param folio folio del pedido
     * @param idPedido identificador del pedido
     * @param nota nota adicional
     * @param estadoActual estado actual
     * @param fechaHoraPedido fecha y hora del pedido
     * @param fechaHoraEntrega fecha y hora de entrega
     */
    public PedidoExpress(int pin, String folio, int idPedido, String nota,
            String estadoActual, LocalDate fechaHoraPedido,
            LocalDate fechaHoraEntrega) {
        super(idPedido, nota, estadoActual, fechaHoraPedido, fechaHoraEntrega);
        this.pin = pin;
        this.folio = folio;
    }

    /**
     * Constructor sin identificador.
     *
     * @param pin PIN del pedido
     * @param folio folio del pedido
     * @param nota nota adicional
     * @param estadoActual estado actual
     * @param fechaHoraPedido fecha y hora del pedido
     * @param fechaHoraEntrega fecha y hora de entrega
     */
    public PedidoExpress(int pin, String folio, String nota,
            String estadoActual, LocalDate fechaHoraPedido,
            LocalDate fechaHoraEntrega) {
        super(nota, estadoActual, fechaHoraPedido, fechaHoraEntrega);
        this.pin = pin;
        this.folio = folio;
    }

    /**
     * @return PIN del pedido
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin nuevo PIN
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return folio del pedido
     */
    public String getFolio() {
        return folio;
    }

    /**
     * @param folio nuevo folio
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "PedidoExpress{"
                + "pin=" + pin
                + ", folio=" + folio
                + '}';
    }
}
