package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CadastroFornecedor extends JFrame {
    // Componentes da tela de cadastro de fornecedor
    private JTextField codigoFornecedorTextField, codigoPessoaTextField, contatoTextField;
    private JButton salvarButton, cancelarButton;

    public CadastroFornecedor() {
        // Configurações básicas da janela
        setTitle("Cadastro de Fornecedor");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(200, 25); // Tamanho dos campos de texto

        codigoFornecedorTextField = new JTextField();
        codigoFornecedorTextField.setPreferredSize(fieldSize);
        codigoFornecedorTextField.setBackground(new Color(60, 60, 60)); // Fundo escuro
        codigoFornecedorTextField.setForeground(Color.WHITE); // Texto branco

        codigoPessoaTextField = new JTextField();
        codigoPessoaTextField.setPreferredSize(fieldSize);
        codigoPessoaTextField.setBackground(new Color(60, 60, 60));
        codigoPessoaTextField.setForeground(Color.WHITE);

        contatoTextField = new JTextField();
        contatoTextField.setPreferredSize(fieldSize);
        contatoTextField.setBackground(new Color(60, 60, 60));
        contatoTextField.setForeground(Color.WHITE);

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
        JLabel labelCodigoFornecedor = new JLabel("Código Fornecedor:");
        labelCodigoFornecedor.setForeground(Color.WHITE);
        panel.add(labelCodigoFornecedor, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoFornecedorTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        JLabel labelCodigoPessoa = new JLabel("Código Pessoa:");
        labelCodigoPessoa.setForeground(Color.WHITE);
        panel.add(labelCodigoPessoa, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoPessoaTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        JLabel labelContato = new JLabel("Contato:");
        labelContato.setForeground(Color.WHITE);
        panel.add(labelContato, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(contatoTextField, gbc);

        // Linha 3 - Botões
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(cancelarButton, gbc);

        // Adicionando o painel ao frame
        add(panel);

        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a tela de cadastro de fornecedor
        SwingUtilities.invokeLater(() -> new CadastroFornecedor());
    }
}
