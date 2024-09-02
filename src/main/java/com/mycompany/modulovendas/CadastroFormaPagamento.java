package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;

public class CadastroFormaPagamento extends JFrame {
    private JTextField codigoFormaPagamentoTextField, nomeTextField;
    private JCheckBox ativoCheckBox;
    private JButton salvarButton, cancelarButton;

    public CadastroFormaPagamento() {
        setTitle("Cadastro de Forma de Pagamento");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        codigoFormaPagamentoTextField = new JTextField();
        nomeTextField = new JTextField();
        ativoCheckBox = new JCheckBox("Ativo");

        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Código Forma de Pagamento:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(codigoFormaPagamentoTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(nomeTextField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(ativoCheckBox, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(salvarButton, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        panel.add(cancelarButton, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroFormaPagamento());
    }
}
