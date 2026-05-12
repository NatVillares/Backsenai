import javax.swing.*;

void main() {

    JFrame janela = new JFrame("Cadastro de produto"); // criando o bloco principal
    janela.setSize(600, 400);
    janela.setLayout(null);

    JLabel labelProduto = new JLabel("Produto"); // nome de uma das caixas
    labelProduto.setBounds(20, 50, 150, 40);
    janela.add(labelProduto);

    JTextField nomeProduto = new JTextField(); // caixa que vai pedir o produto que usamos de exemplo
    nomeProduto.setBounds(20, 80, 150, 40);
    janela.add(nomeProduto);

    JLabel precoLabel = new JLabel("Preco");  //
    precoLabel.setBounds(20, 110, 150, 40); // definição dos tamanhos da caixa
    janela.add(precoLabel);

    JTextField preco = new JTextField(); // campo pedido
    preco.setBounds(20, 150, 150, 40);
    janela.add(preco);

    JLabel quantidadeLabel = new JLabel("Quantidade"); // campo pedido
    quantidadeLabel.setBounds(20, 190, 150, 40);
    janela.add(quantidadeLabel);

    JTextField quantidade = new JTextField();
    quantidade.setBounds(20, 220, 150, 40);
    janela.add(quantidade);

    JButton cadastrar = new JButton("Cadastrar"); // cria o butão que usaremos, neste caso com escrita cadastro
    cadastrar.setBounds(20, 270, 150, 40);
    janela.add(cadastrar);
    cadastrar.addActionListener(e -> {
        String nome = nomeProduto.getText();
        String preco1 = preco.getText();
        String quantidade1 = quantidade.getText();
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso " + nome +" Preco " +preco1 + " quantidade "+ quantidade1);
    });

    JButton limpar = new JButton("limpar"); // limpa as informacoes que escrevemos
    limpar.setBounds(180, 270, 150, 40);
    janela.add(limpar);
    limpar.addActionListener(e -> {
        nomeProduto.setText("");
        preco.setText("");
        quantidade.setText("");

    });

    janela.setVisible(true);
}