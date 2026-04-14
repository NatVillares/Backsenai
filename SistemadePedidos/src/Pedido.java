public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void avancarStatus() {
        if (this.status == StatusPedido.AGUARDANDO_PAGAMENTO) {
            this.status = StatusPedido.PROCESSANDO;
        } else if (this.status == StatusPedido.PROCESSANDO) {
            this.status = StatusPedido.ENVIADO;
        } else if (this.status == StatusPedido.ENVIADO) {
            this.status = StatusPedido.ENTREGUE;
        }
    }

    public void cancelarPedido() {
        if (this.status != StatusPedido.ENTREGUE) {
            this.status = StatusPedido.CANCELADO;
        }
    }

    public StatusPedido getStatus() { return status; }
}