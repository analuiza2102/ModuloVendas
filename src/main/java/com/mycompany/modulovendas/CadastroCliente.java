package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;

public class CadastroCliente extends JFrame {
    // Componentes da tela de cadastro de cliente
    private JTextField codigoClienteTextField, limiteCreditoTextField;
    private JComboBox<String> codigoPessoaComboBox;
    private JButton salvarButton, cancelarButton;

    public CadastroCliente() {
        // Configurações básicas da janela
        setTitle("Cadastro de Cliente");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        codigoClienteTextField = new JTextField();
        limiteCreditoTextField = new JTextField();
        codigoPessoaComboBox = new JComboBox<>(); // Deveria ser preenchido com dados da tabela Pessoa

        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        // Configurando o layout com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Código Cliente:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoClienteTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Código Pessoa:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(codigoPessoaComboBox, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Limite de Crédito:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(limiteCreditoTextField, gbc);

        // Linha 4 - Botões
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
        SwingUtilities.invokeLater(() -> new CadastroCliente());
    }
}
