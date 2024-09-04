package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModuloVendas extends JFrame {
    public ModuloVendas() {
        // Configurações básicas do JFrame
        setTitle("Gerenciamento de Compra e Venda");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        
        // Definindo a cor de fundo do painel principal
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(45, 45, 45)); // Um tom de preto não muito escuro
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        // Criando a barra de menu
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(45, 45, 45)); // Cor de fundo da barra de menu
        menuBar.setBorder(BorderFactory.createEmptyBorder()); // Remove a borda da barra de menu
        
        // Menu "Cadastros"
        JMenu menuCadastros = new JMenu("Cadastros");
        menuCadastros.setForeground(Color.WHITE); // Cor da fonte no menu "Cadastros"
        menuCadastros.setBackground(new Color(45, 45, 45)); // Cor de fundo do menu "Cadastros"

        JMenuItem menuItemCliente = new JMenuItem("Cliente");
        JMenuItem menuItemFornecedor = new JMenuItem("Fornecedor");
        JMenuItem menuItemFormaPagamento = new JMenuItem("Forma de Pagamento");
        JMenuItem menuItemUsuario = new JMenuItem("Usuário");

        // Definindo a cor de fundo e da fonte dos itens de menu
        menuItemCliente.setBackground(new Color(45, 45, 45));
        menuItemCliente.setForeground(Color.WHITE);
        menuItemFornecedor.setBackground(new Color(45, 45, 45));
        menuItemFornecedor.setForeground(Color.WHITE);
        menuItemFormaPagamento.setBackground(new Color(45, 45, 45));
        menuItemFormaPagamento.setForeground(Color.WHITE);
        menuItemUsuario.setBackground(new Color(45, 45, 45));
        menuItemUsuario.setForeground(Color.WHITE);

        menuCadastros.add(menuItemCliente);
        menuCadastros.add(menuItemFornecedor);
        menuCadastros.add(menuItemFormaPagamento);
        menuCadastros.add(menuItemUsuario);

        // Menu "Movimentos"
        JMenu menuMovimentos = new JMenu("Movimentos");
        menuMovimentos.setForeground(Color.WHITE); // Cor da fonte no menu "Movimentos"
        menuMovimentos.setBackground(new Color(45, 45, 45)); // Cor de fundo do menu "Movimentos"

        JMenuItem menuItemVenda = new JMenuItem("Venda");
        JMenuItem menuItemCompra = new JMenuItem("Compra");
        JMenuItem menuItemDevolucao = new JMenuItem("Devolução");

        // Definindo a cor de fundo e da fonte dos itens de menu
        menuItemVenda.setBackground(new Color(45, 45, 45));
        menuItemVenda.setForeground(Color.WHITE);
        menuItemCompra.setBackground(new Color(45, 45, 45));
        menuItemCompra.setForeground(Color.WHITE);
        menuItemDevolucao.setBackground(new Color(45, 45, 45));
        menuItemDevolucao.setForeground(Color.WHITE);

        menuMovimentos.add(menuItemVenda);
        menuMovimentos.add(menuItemCompra);
        menuMovimentos.add(menuItemDevolucao);

        // Menu "Sair"
        JMenu menuSair = new JMenu("Sair");
        menuSair.setForeground(Color.WHITE); // Cor da fonte no menu "Sair"
        menuSair.setBackground(new Color(45, 45, 45)); // Cor de fundo do menu "Sair"

        // Adicionando menus à barra de menu
        menuBar.add(menuCadastros);
        menuBar.add(menuMovimentos);
        menuBar.add(menuSair);

        // Configurando a barra de menu no frame
        setJMenuBar(menuBar);

        // Adicionando os ActionListeners para os itens de menu "Cadastros"
        menuItemCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de cadastro de cliente
                new CadastroCliente().setVisible(true);
            }
        });

        menuItemFornecedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de cadastro de fornecedor
                new CadastroFornecedor().setVisible(true);
            }
        });

        menuItemFormaPagamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de cadastro de forma de pagamento
                new CadastroFormaPagamento().setVisible(true);
            }
        });

        menuItemUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de cadastro de usuário
                new CadastroUsuario().setVisible(true);
            }
        });

        // Adicionando os ActionListeners para os itens de menu "Movimentos"
        menuItemVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de movimento de venda
                new MovimentosVenda().setVisible(true);
            }
        });

        menuItemCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de movimento de compra
                new MovimentosCompra().setVisible(true);
            }
        });

        menuItemDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de movimento de devolução
                new MovimentosDevolucao().setVisible(true);
            }
        });

        // Tornando o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a tela de menu principal
        SwingUtilities.invokeLater(() -> new ModuloVendas());
    }
}
