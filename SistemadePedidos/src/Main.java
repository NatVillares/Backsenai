public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido(1, "Cliente Exemplo");


        System.out.println("Pedido criado: " + p.getStatus());

        p.avancarStatus();
        System.out.println("Status atualizado: " + p.getStatus());

        p.avancarStatus();
        System.out.println("Status atualizado: " + p.getStatus());

        p.cancelarPedido();
        System.out.println("Pedido cancelado");

        System.out.println("Status final: " + p.getStatus());


        System.out.println("Descrição final: " + p.getStatus().getDescricao());
    }
}