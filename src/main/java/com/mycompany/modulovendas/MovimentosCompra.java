package com.mycompany.modulovendas;

import javax.swing.text.JTextComponent;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class MovimentosCompra extends JFrame {
    // Componentes da tela de movimentos de compra
    private JTextField codigoCompraTextField, valorTextField, descontoTextField, totalTextField;
    private JComboBox<String> codigoUsuarioComboBox, codigoFornecedorComboBox;
    private JFormattedTextField dataCompraFormattedField;
    private JTextArea observacoesTextArea;
    private JButton salvarButton, cancelarButton, adicionarProdutoButton, removerProdutoButton;
    private JTable produtosTable;
    private DefaultTableModel tableModel;

    public MovimentosCompra() {
        // Configurações básicas da janela
        setTitle("Movimento de Compra");
        setSize(1100, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(300, 30); // Tamanho dos campos de texto

        Color backgroundColor = new Color(45, 45, 45); // Cor de fundo padrão escura
        Color fieldBackgroundColor = new Color(60, 63, 65); // Cor de fundo dos campos de entrada
        Color fontColor = Color.WHITE; // Cor da fonte branca
        Font font = new Font("SansSerif", Font.PLAIN, 14); // Fonte padrão

        // Campos de texto
        codigoCompraTextField = new JTextField();
        configurarCampoTexto(codigoCompraTextField, fieldSize, fieldBackgroundColor, fontColor, font);

        valorTextField = new JTextField();
        configurarCampoTexto(valorTextField, fieldSize, fieldBackgroundColor, fontColor, font);

        descontoTextField = new JTextField();
        configurarCampoTexto(descontoTextField, fieldSize, fieldBackgroundColor, fontColor, font);

        totalTextField = new JTextField();
        configurarCampoTexto(totalTextField, fieldSize, fieldBackgroundColor, fontColor, font);

        // Comboboxes
        codigoUsuarioComboBox = new JComboBox<>(new String[]{"Usuário 1", "Usuário 2", "Usuário 3"});
        configurarComboBox(codigoUsuarioComboBox, fieldSize, fieldBackgroundColor, fontColor, font);

        codigoFornecedorComboBox = new JComboBox<>(new String[]{"Fornecedor 1", "Fornecedor 2", "Fornecedor 3"});
        configurarComboBox(codigoFornecedorComboBox, fieldSize, fieldBackgroundColor, fontColor, font);

        // Campo de data
        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            dataCompraFormattedField = new JFormattedTextField(dataFormatter);
            configurarCampoTexto(dataCompraFormattedField, fieldSize, fieldBackgroundColor, fontColor, font);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Área de texto para observações
        observacoesTextArea = new JTextArea(5, 20);
        observacoesTextArea.setLineWrap(true);
        observacoesTextArea.setWrapStyleWord(true);
        observacoesTextArea.setBackground(fieldBackgroundColor);
        observacoesTextArea.setForeground(fontColor);
        observacoesTextArea.setFont(font);
        JScrollPane observacoesScrollPane = new JScrollPane(observacoesTextArea);
        observacoesScrollPane.setPreferredSize(new Dimension(300, 100));
        observacoesScrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Configurando a tabela de produtos
        String[] colunas = {"Código Produto", "Nome Produto", "Quantidade", "Preço Unitário", "Desconto", "Total"};
        tableModel = new DefaultTableModel(colunas, 0);
        produtosTable = new JTable(tableModel);
        configurarTabela(produtosTable, font, fieldBackgroundColor, fontColor);
        JScrollPane tabelaScrollPane = new JScrollPane(produtosTable);
        tabelaScrollPane.setPreferredSize(new Dimension(1000, 300));
        tabelaScrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Botões
        adicionarProdutoButton = criarBotao("Adicionar Produto", new Color(46, 139, 87), fontColor, font);
        removerProdutoButton = criarBotao("Remover Produto", new Color(178, 34, 34), fontColor, font);
        salvarButton = criarBotao("Salvar", new Color(70, 130, 180), fontColor, font);
        cancelarButton = criarBotao("Cancelar", new Color(128, 128, 128), fontColor, font);

        // Ações dos botões
        adicionarProdutoButton.addActionListener(e -> adicionarProduto());
        removerProdutoButton.addActionListener(e -> removerProduto());
        cancelarButton.addActionListener(e -> dispose());

        // Configurando o layout com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(backgroundColor);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Linha 1 - Código Compra e Data Compra
        adicionarComponente(panel, criarLabel("Código Compra:", fontColor, font), gbc, 0, 0);
        adicionarComponente(panel, codigoCompraTextField, gbc, 1, 0);
        adicionarComponente(panel, criarLabel("Data da Compra:", fontColor, font), gbc, 2, 0);
        adicionarComponente(panel, dataCompraFormattedField, gbc, 3, 0);

        // Linha 2 - Código Usuário e Código Fornecedor
        adicionarComponente(panel, criarLabel("Código Usuário:", fontColor, font), gbc, 0, 1);
        adicionarComponente(panel, codigoUsuarioComboBox, gbc, 1, 1);
        adicionarComponente(panel, criarLabel("Código Fornecedor:", fontColor, font), gbc, 2, 1);
        adicionarComponente(panel, codigoFornecedorComboBox, gbc, 3, 1);

        // Linha 3 - Valor, Desconto e Total
        adicionarComponente(panel, criarLabel("Valor:", fontColor, font), gbc, 0, 2);
        adicionarComponente(panel, valorTextField, gbc, 1, 2);
        adicionarComponente(panel, criarLabel("Desconto:", fontColor, font), gbc, 2, 2);
        adicionarComponente(panel, descontoTextField, gbc, 3, 2);
        adicionarComponente(panel, criarLabel("Total:", fontColor, font), gbc, 0, 3);
        adicionarComponente(panel, totalTextField, gbc, 1, 3);

        // Linha 4 - Observações
        adicionarComponente(panel, criarLabel("Observações:", fontColor, font), gbc, 0, 4);
        gbc.gridwidth = 3;
        adicionarComponente(panel, observacoesScrollPane, gbc, 1, 4);
        gbc.gridwidth = 1;

        // Linha 5 - Tabela de Produtos
        gbc.gridwidth = 4;
        adicionarComponente(panel, tabelaScrollPane, gbc, 0, 5);
        gbc.gridwidth = 1;

        // Linha 6 - Botões de adicionar e remover produto
        adicionarComponente(panel, adicionarProdutoButton, gbc, 1, 6);
        adicionarComponente(panel, removerProdutoButton, gbc, 2, 6);

        // Linha 7 - Botões Salvar e Cancelar
        adicionarComponente(panel, salvarButton, gbc, 1, 7);
        adicionarComponente(panel, cancelarButton, gbc, 2, 7);

        // Adicionando o painel ao frame
        add(panel);

        // Tornando a janela visível
        setVisible(true);
    }

    private void configurarCampoTexto(JTextComponent campo, Dimension size, Color bgColor, Color fgColor, Font font) {
        campo.setPreferredSize(size);
        campo.setBackground(bgColor);
        campo.setForeground(fgColor);
        campo.setFont(font);
        campo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    private void configurarComboBox(JComboBox<String> comboBox, Dimension size, Color bgColor, Color fgColor, Font font) {
        comboBox.setPreferredSize(size);
        comboBox.setBackground(bgColor);
        comboBox.setForeground(fgColor);
        comboBox.setFont(font);
        comboBox.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    private JLabel criarLabel(String texto, Color fgColor, Font font) {
        JLabel label = new JLabel(texto);
        label.setForeground(fgColor);
        label.setFont(font);
        return label;
    }

    private JButton criarBotao(String texto, Color bgColor, Color fgColor, Font font) {
        JButton botao = new JButton(texto);
        botao.setBackground(bgColor);
        botao.setForeground(fgColor);
        botao.setFont(font);
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        return botao;
    }

    private void adicionarComponente(JPanel panel, JComponent componente, GridBagConstraints gbc, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(componente, gbc);
    }

    private void configurarTabela(JTable tabela, Font font, Color bgColor, Color fgColor) {
        tabela.setFont(font);
        tabela.setRowHeight(25);
        tabela.setBackground(bgColor);
        tabela.setForeground(fgColor);
        tabela.setSelectionBackground(new Color(70, 70, 70));
        tabela.setSelectionForeground(fgColor);

        // Configurando o header da tabela
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.getTableHeader().setBackground(new Color(30, 30, 30));
        tabela.getTableHeader().setForeground(fgColor);
        tabela.getTableHeader().setFont(font);

        // Centralizando o texto nas células
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void adicionarProduto() {
        // Exemplo simples de adicionar um produto com dados vazios
        tableModel.addRow(new Object[]{"", "", "", "", "", ""});
    }

    private void removerProduto() {
        int selectedRow = produtosTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para remover.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Executa a tela de movimentos de compra
        SwingUtilities.invokeLater(MovimentosCompra::new);
    }
}
