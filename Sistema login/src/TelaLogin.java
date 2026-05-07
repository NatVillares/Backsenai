import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {


    private JTextField txtEmail;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnLimpar;

    public TelaLogin() {

        setTitle("Sistema de Login");
        setSize(400,  250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEmail = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSenha = new JPasswordField();

        btnLogin = new JButton("Login");
        btnLimpar = new JButton("Apagar");


        add(lblEmail);
        add(txtEmail);
        add(lblSenha);
        add(txtSenha);
        add(btnLogin);
        add(btnLimpar);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });


        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
    }


    private void realizarLogin() {
        String email = txtEmail.getText();
        String senha = new String(txtSenha.getPassword());


        if (email.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos.",
                    "Campos Vazios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (email.equals("admin@senai.com") && senha.equals("123456")) {
            JOptionPane.showMessageDialog(this,
                    "Login realizado com sucesso!",
                    "Acesso Permitido",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "E-mail ou senha incorretos. Tente novamente.",
                    "Acesso Negado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


    private void limparCampos() {
        txtEmail.setText("");
        txtSenha.setText("");
        txtEmail.requestFocus();
    }
}