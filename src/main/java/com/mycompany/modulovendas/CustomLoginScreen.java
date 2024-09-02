package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomLoginScreen extends JFrame {
    // Componentes da tela de login
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel forgotPasswordLabel;
    private JLabel signUpLabel;

    public CustomLoginScreen() {
        // Configurações básicas da janela
        setTitle("Login - Empresa X");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Painel principal com layout nulo para posicionamento personalizado
        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(25, 25, 25)); // Cor de fundo escura
        panel.setBorder(BorderFactory.createLineBorder(new Color(45, 45, 45), 5));

        // Label "Faça o seu login"
        JLabel titleLabel = new JLabel("Faça o seu login");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(30, 20, 200, 30);

        // Label "Email"
        JLabel emailLabel = new JLabel("email");
        emailLabel.setForeground(Color.LIGHT_GRAY);
        emailLabel.setBounds(30, 70, 200, 20);

        // Campo de texto para o email
        emailTextField = new JTextField();
        emailTextField.setBounds(30, 95, 200, 30);
        emailTextField.setBackground(new Color(45, 45, 45));
        emailTextField.setForeground(Color.WHITE);
        emailTextField.setBorder(BorderFactory.createLineBorder(new Color(75, 75, 75)));

        // Label "Senha"
        JLabel passwordLabel = new JLabel("senha");
        passwordLabel.setForeground(Color.LIGHT_GRAY);
        passwordLabel.setBounds(30, 135, 200, 20);

        // Campo de texto para a senha
        passwordField = new JPasswordField();
        passwordField.setBounds(30, 160, 200, 30);
        passwordField.setBackground(new Color(45, 45, 45));
        passwordField.setForeground(Color.WHITE);
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(75, 75, 75)));

        // Label "Esqueci minha senha"
        forgotPasswordLabel = new JLabel("esqueci minha senha");
        forgotPasswordLabel.setForeground(new Color(150, 150, 250));
        forgotPasswordLabel.setBounds(30, 200, 200, 20);
        forgotPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        forgotPasswordLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Botão de login personalizado
        loginButton = new JButton("Entrar");
        loginButton.setBounds(30, 230, 200, 35);
        loginButton.setBackground(new Color(255, 105, 180));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quando o botão de login é clicado, abre a tela do menu e fecha a tela de login
                new ModuloVendas(); // Abre a tela de menu
                dispose(); // Fecha a tela de login
            }
        });

        // Label "Ainda não tenho uma conta"
        signUpLabel = new JLabel("ainda não tenho uma conta");
        signUpLabel.setForeground(new Color(150, 150, 250));
        signUpLabel.setBounds(30, 270, 200, 20);
        signUpLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        signUpLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Adicionando os componentes ao painel
        panel.add(titleLabel);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(forgotPasswordLabel);
        panel.add(loginButton);
        panel.add(signUpLabel);

        // Adicionando o painel ao frame
        add(panel);

        // Tornando a janela visível
        setVisible(true);
    }

    // Método main para executar a aplicação
    public static void main(String[] args) {
        // Executa a tela de login personalizada
        SwingUtilities.invokeLater(() -> new CustomLoginScreen());
    }
}
