package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CadastroUsuario extends JFrame {
    // Componentes da tela de cadastro de usuário
    private JTextField codigoUsuarioTextField, nomeTextField, loginTextField, senhaTextField;
    private JFormattedTextField cadastroFormattedField;
    private JCheckBox ativoCheckBox;
    private JButton salvarButton, cancelarButton;

    public CadastroUsuario() {
        // Configurações básicas da janela
        setTitle("Cadastro de Usuário");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(150, 25); // Tamanho dos campos de texto

        codigoUsuarioTextField = new JTextField();
        codigoUsuarioTextField.setPreferredSize(fieldSize);

        nomeTextField = new JTextField();
        nomeTextField.setPreferredSize(fieldSize);

        loginTextField = new JTextField();
        loginTextField.setPreferredSize(fieldSize);

        senhaTextField = new JTextField();
        senhaTextField.setPreferredSize(fieldSize);

        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            cadastroFormattedField = new JFormattedTextField(dataFormatter);
            cadastroFormattedField.setPreferredSize(fieldSize);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ativoCheckBox = new JCheckBox("Ativo");

        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        // Configurando o layout com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Código Usuário:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoUsuarioTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(nomeTextField, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Login:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(loginTextField, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Senha:"), gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(senhaTextField, gbc);

        // Linha 5
        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Cadastro:"), gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(cadastroFormattedField, gbc);

        // Linha 6
        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(ativoCheckBox, gbc);

        // Linha 7 - Botões
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
