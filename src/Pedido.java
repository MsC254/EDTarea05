public class Pedido {
    private Cliente cliente;

    public Pedido (Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total, boolean esVip) {
        double descuento =0;

        if (total > 100) {
            descuento= esVip ? total * 0.15 : total * 0.10;
        }

        double precioFinal = total - descuento;
        System.out.println("Pedido VIP aprobado.Total: " + precioFinal
    } else {
        System.out.println("Pedido aprobado. Total: " + precioFinal + "
    }
}
}