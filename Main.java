import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    JFrame tela = new JFrame("Tela de Cadastro");
    tela.setSize(900, 500);
    tela.setLayout(null);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 20, 250, 25);
    tela.add(labelNome);

    JTextField nome = new JTextField();
    nome.setBounds(20, 45, 250, 30);
    tela.add(nome);

    JLabel labelIdade = new JLabel("Idade");
    labelIdade.setBounds(20, 80, 150, 25);
    tela.add(labelIdade);

    JTextField Idade = new JTextField();
    Idade.setBounds(20, 105, 150, 30);
    tela.add(Idade);

    JLabel labelRaca = new JLabel("Raça");
    labelRaca.setBounds(20, 140, 150, 25);
    tela.add(labelRaca);

    JTextField Raca = new JTextField();
    Raca.setBounds(20, 165, 250, 30);
    tela.add(Raca);

    JLabel labelEspecie = new JLabel("Espécie");
    labelEspecie.setBounds(20, 200, 150, 25);
    tela.add(labelEspecie);

    String[] especies = {"Cachorro", "Gato", "Pássaro", "Outro"};
    JComboBox<String> campoEspecie = new JComboBox<>(especies);
    campoEspecie.setBounds(20, 225, 250, 30);
    tela.add(campoEspecie);

    JLabel labelEndereco = new JLabel("Endereço");
    labelEndereco.setBounds(20, 260, 280, 25);
    tela.add(labelEndereco);

    JTextField Endereco = new JTextField();
    Endereco.setBounds(20, 285, 260, 30);
    tela.add(Endereco);

    JLabel labelTelefone = new JLabel("Telefone");
    labelTelefone.setBounds(20, 320, 280, 25);
    tela.add(labelTelefone);

    JTextField Telefone = new JTextField();
    Telefone.setBounds(20, 345, 260, 30);
    tela.add(Telefone);

    JButton enviar = new JButton("Enviar");
    enviar.setBounds(20, 400, 140, 40);
    tela.add(enviar);

    enviar.addActionListener(e -> {
        String sql = "INSERT INTO Tipo(nome, especie, idade, raca, endereco, telefone) VALUES(?,?,?,?,?,?)";

        try {
            Connection conexao = Conexao.conectar();

            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, nome.getText());
            ps.setString(2, (String) campoEspecie.getSelectedItem());
            ps.setString(3, Idade.getText());
            ps.setString(4, Raca.getText());
            ps.setString(5, Endereco.getText());
            ps.setString(6, Telefone.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(tela, "Animal cadastrado com sucesso!");

            nome.setText("");
            Idade.setText("");
            Raca.setText("");
            Endereco.setText("");
            Telefone.setText("");
            campoEspecie.setSelectedIndex(0);

            ps.close();
            conexao.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(tela, "Erro ao salvar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    });

    tela.setLocationRelativeTo(null);
    tela.setVisible(true);
}