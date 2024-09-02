package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.MaskFormatter;

public class MovimentosVenda extends JFrame {
    private JTextField codigoVendaTextField, codigoClienteTextField, codigoProdutoTextField;
    private JFormattedTextField dataVendaFormattedField, valorTotalTextField;
    private JButton salvarButton, cancelarButton;

    public MovimentosVenda() {
        setTitle("Movimento de Venda");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        codigoVendaTextField = new JTextField();
        codigoClienteTextField = new JTextField();
        codigoProdutoTextField = new JTextField();
        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            dataVendaFormattedField = new JFormattedTextField(dataFormatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        valorTotalTextField = new JFormattedTextField();

        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Código da Venda:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoVendaTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Código do Cliente:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoClienteTextField, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Código do Produto:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(codigoProdutoTextField, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Data da Venda:"), gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(dataVendaFormattedField, gbc);

        // Linha 5
        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Valor Total:"), gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(valorTotalTextField, gbc);

        // Linha 6 - Botões
        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        panel.add(cancelarButton, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MovimentosVenda());
    }
}
