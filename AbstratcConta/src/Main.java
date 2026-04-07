//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    void main () {
    CC cc = new CC(172,21,1200,"Pablo");
    CP cp = new CP(673,34,7800,"Nathalia");
    PJ pj = new PJ(732,67,2500,"Anthony");



    System.out.println("================");
    System.out.println("Conta Corrente");
    cc.exibirSaldo();
    cc.depositar(200);
    cc.exibirSaldo();
    cc.sacar(100);
    cc.exibirSaldo();
    cc.calcularTarafiaMensal();

    System.out.println("================");
    System.out.println("Conta Poupaça");
    cp.exibirSaldo();
    cp.depositar(200);
    cp.exibirSaldo();
    cp.sacar(100);
    cp.exibirSaldo();
    cp.calcularTarafiaMensal();

    System.out.println("================");
    System.out.println("Conta Pesoa Jurídica");
    pj.exibirSaldo();
    pj.depositar(200);
    pj.exibirSaldo();
    pj.sacar(100);
    pj.exibirSaldo();
    pj.calcularTarafiaMensal();

}