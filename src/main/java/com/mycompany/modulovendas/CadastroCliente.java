package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CadastroCliente extends JFrame {
    // Componentes da tela de cadastro de cliente
    private JTextField codigoClienteTextField, limiteCreditoTextField, nomeTextField, fantasiaTextField, cpfCnpjTextField, rgIeTextField,
            enderecoTextField, numeroTextField, complementoTextField, bairroTextField, cidadeTextField, estadoTextField, cepTextField,
            telefone1TextField, telefone2TextField, celularTextField, emailTextField, siteTextField, codigoPessoaTextField;
    private JCheckBox pessoaFisicaCheckBox, ativoCheckBox;
    private JFormattedTextField dataCadastroFormattedField;
    private JButton salvarButton, cancelarButton;

    public CadastroCliente() {
        // Configurações básicas da janela
        setTitle("Cadastro de Cliente");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela na tela

        // Inicializando os componentes
        Dimension fieldSize = new Dimension(200, 25); // Tamanho dos campos de texto

        codigoClienteTextField = new JTextField();
        codigoClienteTextField.setPreferredSize(fieldSize);
        codigoClienteTextField.setBackground(new Color(60, 60, 60)); // Fundo escuro
        codigoClienteTextField.setForeground(Color.WHITE); // Texto branco

        codigoPessoaTextField = new JTextField();
        codigoPessoaTextField.setPreferredSize(fieldSize);
        codigoPessoaTextField.setBackground(new Color(60, 60, 60));
        codigoPessoaTextField.setForeground(Color.WHITE);

        limiteCreditoTextField = new JTextField();
        limiteCreditoTextField.setPreferredSize(fieldSize);
        limiteCreditoTextField.setBackground(new Color(60, 60, 60));
        limiteCreditoTextField.setForeground(Color.WHITE);

        nomeTextField = new JTextField();
        nomeTextField.setPreferredSize(fieldSize);
        nomeTextField.setBackground(new Color(60, 60, 60));
        nomeTextField.setForeground(Color.WHITE);

        fantasiaTextField = new JTextField();
        fantasiaTextField.setPreferredSize(fieldSize);
        fantasiaTextField.setBackground(new Color(60, 60, 60));
        fantasiaTextField.setForeground(Color.WHITE);

        pessoaFisicaCheckBox = new JCheckBox("Pessoa Física");
        pessoaFisicaCheckBox.setBackground(new Color(45, 45, 45)); // Fundo escuro do checkbox
        pessoaFisicaCheckBox.setForeground(Color.WHITE); // Texto branco

        cpfCnpjTextField = new JTextField();
        cpfCnpjTextField.setPreferredSize(fieldSize);
        cpfCnpjTextField.setBackground(new Color(60, 60, 60));
        cpfCnpjTextField.setForeground(Color.WHITE);

        rgIeTextField = new JTextField();
        rgIeTextField.setPreferredSize(fieldSize);
        rgIeTextField.setBackground(new Color(60, 60, 60));
        rgIeTextField.setForeground(Color.WHITE);

        enderecoTextField = new JTextField();
        enderecoTextField.setPreferredSize(fieldSize);
        enderecoTextField.setBackground(new Color(60, 60, 60));
        enderecoTextField.setForeground(Color.WHITE);

        numeroTextField = new JTextField();
        numeroTextField.setPreferredSize(fieldSize);
        numeroTextField.setBackground(new Color(60, 60, 60));
        numeroTextField.setForeground(Color.WHITE);

        complementoTextField = new JTextField();
        complementoTextField.setPreferredSize(fieldSize);
        complementoTextField.setBackground(new Color(60, 60, 60));
        complementoTextField.setForeground(Color.WHITE);

        bairroTextField = new JTextField();
        bairroTextField.setPreferredSize(fieldSize);
        bairroTextField.setBackground(new Color(60, 60, 60));
        bairroTextField.setForeground(Color.WHITE);

        cidadeTextField = new JTextField();
        cidadeTextField.setPreferredSize(fieldSize);
        cidadeTextField.setBackground(new Color(60, 60, 60));
        cidadeTextField.setForeground(Color.WHITE);

        estadoTextField = new JTextField();
        estadoTextField.setPreferredSize(fieldSize);
        estadoTextField.setBackground(new Color(60, 60, 60));
        estadoTextField.setForeground(Color.WHITE);

        cepTextField = new JTextField();
        cepTextField.setPreferredSize(fieldSize);
        cepTextField.setBackground(new Color(60, 60, 60));
        cepTextField.setForeground(Color.WHITE);

        telefone1TextField = new JTextField();
        telefone1TextField.setPreferredSize(fieldSize);
        telefone1TextField.setBackground(new Color(60, 60, 60));
        telefone1TextField.setForeground(Color.WHITE);

        telefone2TextField = new JTextField();
        telefone2TextField.setPreferredSize(fieldSize);
        telefone2TextField.setBackground(new Color(60, 60, 60));
        telefone2TextField.setForeground(Color.WHITE);

        celularTextField = new JTextField();
        celularTextField.setPreferredSize(fieldSize);
        celularTextField.setBackground(new Color(60, 60, 60));
        celularTextField.setForeground(Color.WHITE);

        emailTextField = new JTextField();
        emailTextField.setPreferredSize(fieldSize);
        emailTextField.setBackground(new Color(60, 60, 60));
        emailTextField.setForeground(Color.WHITE);

        siteTextField = new JTextField();
        siteTextField.setPreferredSize(fieldSize);
        siteTextField.setBackground(new Color(60, 60, 60));
        siteTextField.setForeground(Color.WHITE);

        try {
            MaskFormatter dataFormatter = new MaskFormatter("##/##/####");
            dataCadastroFormattedField = new JFormattedTextField(dataFormatter);
            dataCadastroFormattedField.setPreferredSize(fieldSize);
            dataCadastroFormattedField.setBackground(new Color(60, 60, 60)); // Fundo escuro
            dataCadastroFormattedField.setForeground(Color.WHITE); // Texto branco
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
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
            }
        });

        // Configurando o layout com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(45, 45, 45)); // Fundo do painel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Adicionando os componentes ao painel
        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        JLabel labelCodigoCliente = new JLabel("Código Cliente:");
        labelCodigoCliente.setForeground(Color.WHITE);
        panel.add(labelCodigoCliente, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoClienteTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 0;
        JLabel labelCodigoPessoa = new JLabel("Código Pessoa:");
        labelCodigoPessoa.setForeground(Color.WHITE);
        panel.add(labelCodigoPessoa, gbc);
        gbc.gridx = 3; gbc.gridy = 0;
        panel.add(codigoPessoaTextField, gbc);

        gbc.gridx = 4; gbc.gridy = 0;
        JLabel labelLimiteCredito = new JLabel("Limite de Crédito:");
        labelLimiteCredito.setForeground(Color.WHITE);
        panel.add(labelLimiteCredito, gbc);
        gbc.gridx = 5; gbc.gridy = 0;
        panel.add(limiteCreditoTextField, gbc);

        // Linha 2
        gbc.gridx = 0; gbc.gridy = 1;
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setForeground(Color.WHITE);
        panel.add(labelNome, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(nomeTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 1;
        JLabel labelFantasia = new JLabel("Nome Fantasia:");
        labelFantasia.setForeground(Color.WHITE);
        panel.add(labelFantasia, gbc);
        gbc.gridx = 3; gbc.gridy = 1;
        panel.add(fantasiaTextField, gbc);

        gbc.gridx = 4; gbc.gridy = 1;
        panel.add(pessoaFisicaCheckBox, gbc);

        // Linha 3
        gbc.gridx = 0; gbc.gridy = 2;
        JLabel labelCpfCnpj = new JLabel("CPF/CNPJ:");
        labelCpfCnpj.setForeground(Color.WHITE);
        panel.add(labelCpfCnpj, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(cpfCnpjTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 2;
        JLabel labelRgIe = new JLabel("RG/IE:");
        labelRgIe.setForeground(Color.WHITE);
        panel.add(labelRgIe, gbc);
        gbc.gridx = 3; gbc.gridy = 2;
        panel.add(rgIeTextField, gbc);

        gbc.gridx = 4; gbc.gridy = 2;
        JLabel labelDataCadastro = new JLabel("Data de Cadastro:");
        labelDataCadastro.setForeground(Color.WHITE);
        panel.add(labelDataCadastro, gbc);
        gbc.gridx = 5; gbc.gridy = 2;
        panel.add(dataCadastroFormattedField, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy = 3;
        JLabel labelEndereco = new JLabel("Endereço:");
        labelEndereco.setForeground(Color.WHITE);
        panel.add(labelEndereco, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(enderecoTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 3;
        JLabel labelNumero = new JLabel("Número:");
        labelNumero.setForeground(Color.WHITE);
        panel.add(labelNumero, gbc);
        gbc.gridx = 3; gbc.gridy = 3;
        panel.add(numeroTextField, gbc);

        gbc.gridx = 4; gbc.gridy = 3;
        JLabel labelComplemento = new JLabel("Complemento:");
        labelComplemento.setForeground(Color.WHITE);
        panel.add(labelComplemento, gbc);
        gbc.gridx = 5; gbc.gridy = 3;
        panel.add(complementoTextField, gbc);

        // Linha 5
        gbc.gridx = 0; gbc.gridy = 4;
        JLabel labelBairro = new JLabel("Bairro:");
        labelBairro.setForeground(Color.WHITE);
        panel.add(labelBairro, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        panel.add(bairroTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 4;
        JLabel labelCidade = new JLabel("Cidade:");
        labelCidade.setForeground(Color.WHITE);
        panel.add(labelCidade, gbc);
        gbc.gridx = 3; gbc.gridy = 4;
        panel.add(cidadeTextField, gbc);

        gbc.gridx = 4; gbc.gridy = 4;
        JLabel labelEstado = new JLabel("Estado:");
        labelEstado.setForeground(Color.WHITE);
        panel.add(labelEstado, gbc);
        gbc.gridx = 5; gbc.gridy = 4;
        panel.add(estadoTextField, gbc);

        // Linha 6
        gbc.gridx = 0; gbc.gridy = 5;
        JLabel labelCep = new JLabel("CEP:");
        labelCep.setForeground(Color.WHITE);
        panel.add(labelCep, gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        panel.add(cepTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 5;
        JLabel labelTelefone1 = new JLabel("Telefone 1:");
        labelTelefone1.setForeground(Color.WHITE);
        panel.add(labelTelefone1, gbc);
        gbc.gridx = 3; gbc.gridy = 5;
        panel.add(telefone1TextField, gbc);

        gbc.gridx = 4; gbc.gridy = 5;
        JLabel labelTelefone2 = new JLabel("Telefone 2:");
        labelTelefone2.setForeground(Color.WHITE);
        panel.add(labelTelefone2, gbc);
        gbc.gridx = 5; gbc.gridy = 5;
        panel.add(telefone2TextField, gbc);

        // Linha 7
        gbc.gridx = 0; gbc.gridy = 6;
        JLabel labelCelular = new JLabel("Celular:");
        labelCelular.setForeground(Color.WHITE);
        panel.add(labelCelular, gbc);
        gbc.gridx = 1; gbc.gridy = 6;
        panel.add(celularTextField, gbc);

        gbc.gridx = 2; gbc.gridy = 6;
        JLabel labelEmail = new JLabel("E-mail:");
        labelEmail.setForeground(Color.WHITE);
        panel.add(labelEmail, gbc);
        gbc.gridx = 3; gbc.gridy = 6;
        panel.add(emailTextField, gbc);

        gbc.gridx = 4; gbc.gridy = 6;
        JLabel labelSite = new JLabel("Site:");
        labelSite.setForeground(Color.WHITE);
        panel.add(labelSite, gbc);
        gbc.gridx = 5; gbc.gridy = 6;
        panel.add(siteTextField, gbc);

        // Linha 8
        gbc.gridx = 0; gbc.gridy = 7;
        panel.add(ativoCheckBox, gbc);

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
        // Executa a tela de cadastro de cliente
        SwingUtilities.invokeLater(() -> new CadastroCliente());
    }
}
