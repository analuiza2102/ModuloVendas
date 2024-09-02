package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;

public class CadastroFornecedor extends JFrame {
    private JTextField codigoFornecedorTextField, contatoTextField;
    private JComboBox<String> codigoPessoaComboBox;
    private JButton salvarButton, cancelarButton;

    public CadastroFornecedor() {
        setTitle("Cadastro de Fornecedor");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        codigoFornecedorTextField = new JTextField();
        codigoPessoaComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Pessoa
        contatoTextField = new JTextField();

        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Código Fornecedor:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoFornecedorTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Código Pessoa:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoPessoaComboBox, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Contato:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(contatoTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(cancelarButton, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroFornecedor());
    }
}
