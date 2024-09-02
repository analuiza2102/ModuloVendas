package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class MovimentosDevolucao extends JFrame {
    // Componentes da tela de movimentos de devolução
    private JTextField codigoDevolucaoTextField, quantidadeDevolvidaTextField;
    private JComboBox<String> codigoCompraComboBox, codigoProdutoComboBox;
    private JFormattedTextField dataDevolucaoFormattedField;
    private JTextArea motivoTextArea, observacoesTextArea;
    private JButton salvarButton, cancelarButton;

    public MovimentosDevolucao() {
        // Configurações básicas da janela
        setTitle("Movimento de Devolução");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(200, 25); // Tamanho dos campos de texto

        codigoDevolucaoTextField = new JTextField();
        codigoDevolucaoTextField.setPreferredSize(fieldSize);

        codigoCompraComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Compra
        codigoCompraComboBox.setPreferredSize(fieldSize);

        codigoProdutoComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Produto
        codigoProdutoComboBox.setPreferredSize(fieldSize);

        quantidadeDevolvidaTextField = new JTextField();
        quantidadeDevolvidaTextField.setPreferredSize(fieldSize);

        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            dataDevolucaoFormattedField = new JFormattedTextField(dataFormatter);
            dataDevolucaoFormattedField.setPreferredSize(fieldSize);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        motivoTextArea = new JTextArea(3, 20);
        motivoTextArea.setLineWrap(true);
        motivoTextArea.setWrapStyleWord(true);
        JScrollPane motivoScrollPane = new JScrollPane(motivoTextArea);

        observacoesTextArea = new JTextArea(3, 20);
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
        panel.add(new JLabel("Código Devolução:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoDevolucaoTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Código Compra:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoCompraComboBox, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Código Produto:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(codigoProdutoComboBox, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Quantidade Devolvida:"), gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(quantidadeDevolvidaTextField, gbc);

        // Linha 5
        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Data de Devolução:"), gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(dataDevolucaoFormattedField, gbc);

        // Linha 6
        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(new JLabel("Motivo:"), gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(motivoScrollPane, gbc);
        gbc.gridwidth = 1;

        // Linha 7
        gbc.gridx = 0; gbc.gridy = 6;
        panel.add(new JLabel("Observações:"), gbc);
        gbc.gridx = 1; gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(observacoesScrollPane, gbc);
        gbc.gridwidth = 1;

        // Linha 8 - Botões
        gbc.gridx = 0; gbc.gridy = 7;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 7;
        panel.add(cancelarButton, gbc);

        // Adicionando o painel ao frame
        add(panel);

        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a tela de movimentos de devolução
        SwingUtilities.invokeLater(() -> new MovimentosDevolucao());
    }
}
