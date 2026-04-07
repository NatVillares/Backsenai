public class CC extends Conta{
    public CC() {
    }

    public CC(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarafiaMensal() {
        setSaldo(getSaldo()-12);
        System.out.println();
        System.out.println("Houve desconto de tarifa mensal");
        exibirSaldo();

        }
    }