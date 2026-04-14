public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Aguardando confirmação do pagamento"),
    PROCESSANDO("O pedido está sendo preparado"),
    ENVIADO("Pedido enviado para transporte"),
    ENTREGUE("Pedido entregue ao cliente"),
    CANCELADO("O pedido foi cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}