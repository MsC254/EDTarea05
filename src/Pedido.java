/**
 * Representa un pedido de un cliente, procesando el total con descuentos según el tipo de cliente (VIP o normal).
 */
public class Pedido {
    private Cliente cliente;

    /**
     * Constructor para crear un pedido para un cliente específico.
     *
     * @param cliente El cliente que realiza el pedido.
     */
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Procesa el pedido aplicando un descuento dependiendo de si el cliente es VIP o no.
     *
     * @param total El total del pedido antes de aplicar el descuento.
     * @param esVIP Indica si el cliente es VIP.
     */
    public void procesarPedido(double total, boolean esVIP) {
        double descuento = 0;

        if (total > 100) {
            descuento = esVIP ? total * 0.15 : total * 0.10;
        }

        double precioFinal = total - descuento;

        if (esVIP) {
            System.out.println("Pedido VIP aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println("Pedido aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
        }
    }

    /**
     * Obtiene el cliente asociado a este pedido.
     *
     * @return El cliente asociado al pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }
}
