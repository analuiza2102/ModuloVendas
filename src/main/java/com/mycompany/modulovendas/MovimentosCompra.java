package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class MovimentosCompra extends JFrame {
    // Componentes da tela de movimentos de compra
    private JTextField codigoCompraTextField, quantidadeTextField, valorTextField, descontoTextField, totalTextField;
    private JComboBox<String> codigoUsuarioComboBox, codigoFornecedorComboBox, codigoProdutoComboBox;
    private JFormattedTextField dataEmissaoFormattedField;
    private JTextArea observacoesTextArea;
    private JButton salvarButton, cancelarButton;

    public MovimentosCompra() {
        // Configurações básicas da janela
        setTitle("Movimento de Compra");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(200, 25); // Tamanho dos campos de texto

        codigoCompraTextField = new JTextField();
        codigoCompraTextField.setPreferredSize(fieldSize);

        codigoUsuarioComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Usuário
        codigoUsuarioComboBox.setPreferredSize(fieldSize);

        codigoFornecedorComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Fornecedor
        codigoFornecedorComboBox.setPreferredSize(fieldSize);

        codigoProdutoComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Produto
        codigoProdutoComboBox.setPreferredSize(fieldSize);

        quantidadeTextField = new JTextField();
        quantidadeTextField.setPreferredSize(fieldSize);

        valorTextField = new JTextField();
        valorTextField.setPreferredSize(fieldSize);

        descontoTextField = new JTextField();
        descontoTextField.setPreferredSize(fieldSize);

        totalTextField = new JTextField();
        totalTextField.setPreferredSize(fieldSize);

        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            dataEmissaoFormattedField = new JFormattedTextField(dataFormatter);
            dataEmissaoFormattedField.setPreferredSize(fieldSize);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        observacoesTextArea = new JTextArea(5, 20);
        observacoesTextArea.setLineWrap(true);
        observacoesTextArea.setWrapStyleWord(true);
        JScrollPane observacoesScrollPane = new JScrollPane(observacoesTextArea);

        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        // Configurando o layout com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Código Compra:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoCompraTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Código Usuário:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoUsuarioComboBox, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Código Fornecedor:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(codigoFornecedorComboBox, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Código Produto:"), gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(codigoProdutoComboBox, gbc);

        // Linha 5
        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Quantidade:"), gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(quantidadeTextField, gbc);

        // Linha 6
        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(new JLabel("Valor:"), gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        panel.add(valorTextField, gbc);

        // Linha 7
        gbc.gridx = 0; gbc.gridy = 6;
        panel.add(new JLabel("Desconto:"), gbc);
        gbc.gridx = 1; gbc.gridy = 6;
        panel.add(descontoTextField, gbc);

        // Linha 8
        gbc.gridx = 0; gbc.gridy = 7;
        panel.add(new JLabel("Total:"), gbc);
        gbc.gridx = 1; gbc.gridy = 7;
        panel.add(totalTextField, gbc);

        // Linha 9
        gbc.gridx = 0; gbc.gridy = 8;
        panel.add(new JLabel("Data de Emissão:"), gbc);
        gbc.gridx = 1; gbc.gridy = 8;
        panel.add(dataEmissaoFormattedField, gbc);

        // Linha 10
        gbc.gridx = 0; gbc.gridy = 9;
        panel.add(new JLabel("Observações:"), gbc);
        gbc.gridx = 1; gbc.gridy = 9;
        gbc.gridwidth = 2;
        panel.add(observacoesScrollPane, gbc);
        gbc.gridwidth = 1;

        // Linha 11 - Botões
        gbc.gridx = 0; gbc.gridy = 10;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 10;
        panel.add(cancelarButton, gbc);

        // Adicionando o painel ao frame
        add(panel);

        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a tela de movimentos de compra
        SwingUtilities.invokeLater(() -> new MovimentosCompra());
    }
}
