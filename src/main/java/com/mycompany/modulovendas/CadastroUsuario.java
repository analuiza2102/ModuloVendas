package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CadastroUsuario extends JFrame {
    // Componentes da tela de cadastro de usuário
    private JTextField codigoUsuarioTextField, nomeTextField, loginTextField;
    private JPasswordField senhaPasswordField;
    private JFormattedTextField dataCadastroFormattedField;
    private JCheckBox ativoCheckBox;
    private JButton salvarButton, cancelarButton;

    public CadastroUsuario() {
        // Configurações básicas da janela
        setTitle("Cadastro de Usuário");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(200, 25); // Tamanho dos campos de texto

        codigoUsuarioTextField = new JTextField();
        codigoUsuarioTextField.setPreferredSize(fieldSize);
        codigoUsuarioTextField.setBackground(new Color(60, 60, 60)); // Fundo escuro
        codigoUsuarioTextField.setForeground(Color.WHITE); // Texto branco

        nomeTextField = new JTextField();
        nomeTextField.setPreferredSize(fieldSize);
        nomeTextField.setBackground(new Color(60, 60, 60));
        nomeTextField.setForeground(Color.WHITE);

        loginTextField = new JTextField();
        loginTextField.setPreferredSize(fieldSize);
        loginTextField.setBackground(new Color(60, 60, 60));
        loginTextField.setForeground(Color.WHITE);

        senhaPasswordField = new JPasswordField();
        senhaPasswordField.setPreferredSize(fieldSize);
        senhaPasswordField.setBackground(new Color(60, 60, 60));
        senhaPasswordField.setForeground(Color.WHITE);

        try {
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            dataCadastroFormattedField = new JFormattedTextField(dateMask);
            dataCadastroFormattedField.setPreferredSize(fieldSize);
            dataCadastroFormattedField.setBackground(new Color(60, 60, 60));
            dataCadastroFormattedField.setForeground(Color.WHITE);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ativoCheckBox = new JCheckBox("Ativo");
        ativoCheckBox.setBackground(new Color(45, 45, 45)); // Fundo escuro do checkbox
        ativoCheckBox.setForeground(Color.WHITE); // Texto branco

        salvarButton = new JButton("Salvar");
        salvarButton.setBackground(new Color(70, 130, 180)); // Cor de fundo azul
        salvarButton.setForeground(Color.WHITE); // Texto branco

        cancelarButton = new JButton("Cancelar");
        cancelarButton.setBackground(new Color(255, 69, 0)); // Cor de fundo vermelho
        cancelarButton.setForeground(Color.WHITE); // Texto branco
        cancelarButton.addActionListener(e -> dispose()); // Fecha a janela atual

        // Configurando o layout com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(45, 45, 45)); // Fundo do painel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        JLabel labelCodigoUsuario = new JLabel("Código Usuário:");
        labelCodigoUsuario.setForeground(Color.WHITE);
        panel.add(labelCodigoUsuario, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoUsuarioTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setForeground(Color.WHITE);
        panel.add(labelNome, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(nomeTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        JLabel labelLogin = new JLabel("Login:");
        labelLogin.setForeground(Color.WHITE);
        panel.add(labelLogin, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(loginTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.WHITE);
        panel.add(labelSenha, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(senhaPasswordField, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        JLabel labelDataCadastro = new JLabel("Data de Cadastro:");
        labelDataCadastro.setForeground(Color.WHITE);
        panel.add(labelDataCadastro, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(dataCadastroFormattedField, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(ativoCheckBox, gbc);

        // Linha 6 - Botões
        gbc.gridx = 0; gbc.gridy = 6;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 6;
        panel.add(cancelarButton, gbc);

        // Adicionando o painel ao frame
        add(panel);

        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a tela de cadastro de usuário
        SwingUtilities.invokeLater(() -> new CadastroUsuario());
    }
}
