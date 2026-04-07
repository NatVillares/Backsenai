public class PJ extends Conta {
    public PJ() {
    }

    public PJ(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarafiaMensal() {
        setSaldo(getSaldo() - 20);
        System.out.println("Houve desconto de tarifa mensal");
        exibirSaldo();
    }
}