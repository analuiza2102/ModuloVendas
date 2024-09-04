package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class MovimentosDevolucao extends JFrame {
    // Componentes da tela de movimentos de devolução
    private JTextField codigoDevolucaoTextField, valorTextField, descontoTextField, totalTextField;
    private JComboBox<String> codigoUsuarioComboBox, codigoClienteComboBox;
    private JFormattedTextField dataEmissaoFormattedField;
    private JTextArea observacoesTextArea;
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
        codigoDevolucaoTextField.setBackground(new Color(60, 60, 60)); // Fundo escuro
        codigoDevolucaoTextField.setForeground(Color.WHITE); // Texto branco

        codigoUsuarioComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Usuário
        codigoUsuarioComboBox.setPreferredSize(fieldSize);
        codigoUsuarioComboBox.setBackground(new Color(60, 60, 60));
        codigoUsuarioComboBox.setForeground(Color.WHITE);

        codigoClienteComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Cliente
        codigoClienteComboBox.setPreferredSize(fieldSize);
        codigoClienteComboBox.setBackground(new Color(60, 60, 60));
        codigoClienteComboBox.setForeground(Color.WHITE);

        valorTextField = new JTextField();
        valorTextField.setPreferredSize(fieldSize);
        valorTextField.setBackground(new Color(60, 60, 60));
        valorTextField.setForeground(Color.WHITE);

        descontoTextField = new JTextField();
        descontoTextField.setPreferredSize(fieldSize);
        descontoTextField.setBackground(new Color(60, 60, 60));
        descontoTextField.setForeground(Color.WHITE);

        totalTextField = new JTextField();
        totalTextField.setPreferredSize(fieldSize);
        totalTextField.setBackground(new Color(60, 60, 60));
        totalTextField.setForeground(Color.WHITE);

        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            dataEmissaoFormattedField = new JFormattedTextField(dataFormatter);
            dataEmissaoFormattedField.setPreferredSize(fieldSize);
            dataEmissaoFormattedField.setBackground(new Color(60, 60, 60));
            dataEmissaoFormattedField.setForeground(Color.WHITE);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        observacoesTextArea = new JTextArea(5, 20);
        observacoesTextArea.setLineWrap(true);
        observacoesTextArea.setWrapStyleWord(true);
        observacoesTextArea.setBackground(new Color(60, 60, 60));
        observacoesTextArea.setForeground(Color.WHITE);
        JScrollPane observacoesScrollPane = new JScrollPane(observacoesTextArea);

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
        JLabel labelCodigoDevolucao = new JLabel("Código Devolução:");
        labelCodigoDevolucao.setForeground(Color.WHITE);
        panel.add(labelCodigoDevolucao, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoDevolucaoTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        JLabel labelCodigoUsuario = new JLabel("Código Usuário:");
        labelCodigoUsuario.setForeground(Color.WHITE);
        panel.add(labelCodigoUsuario, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoUsuarioComboBox, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        JLabel labelCodigoCliente = new JLabel("Código Cliente:");
        labelCodigoCliente.setForeground(Color.WHITE);
        panel.add(labelCodigoCliente, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(codigoClienteComboBox, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy = 3;
        JLabel labelValor = new JLabel("Valor:");
        labelValor.setForeground(Color.WHITE);
        panel.add(labelValor, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(valorTextField, gbc);

        // Linha 5
        gbc.gridx = 0; gbc.gridy = 4;
        JLabel labelDesconto = new JLabel("Desconto:");
        labelDesconto.setForeground(Color.WHITE);
        panel.add(labelDesconto, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(descontoTextField, gbc);

        // Linha 6
        gbc.gridx = 0; gbc.gridy = 5;
        JLabel labelTotal = new JLabel("Total:");
        labelTotal.setForeground(Color.WHITE);
        panel.add(labelTotal, gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        panel.add(totalTextField, gbc);

        // Linha 7
        gbc.gridx = 0; gbc.gridy = 6;
        JLabel labelDataEmissao = new JLabel("Data de Emissão:");
        labelDataEmissao.setForeground(Color.WHITE);
        panel.add(labelDataEmissao, gbc);
        gbc.gridx = 1; gbc.gridy = 6;
        panel.add(dataEmissaoFormattedField, gbc);

        // Linha 8
        gbc.gridx = 0; gbc.gridy = 7;
        JLabel labelObservacoes = new JLabel("Observações:");
        labelObservacoes.setForeground(Color.WHITE);
        panel.add(labelObservacoes, gbc);
        gbc.gridx = 1; gbc.gridy = 7;
        gbc.gridwidth = 2;
        panel.add(observacoesScrollPane, gbc);
        gbc.gridwidth = 1;

        // Linha 9 - Botões
        gbc.gridx = 0; gbc.gridy = 8;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 8;
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
