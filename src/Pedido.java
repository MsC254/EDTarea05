public class Pedido {
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
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
}