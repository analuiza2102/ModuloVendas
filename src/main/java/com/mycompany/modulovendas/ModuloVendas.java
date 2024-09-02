package com.mycompany.modulovendas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModuloVendas extends JFrame {
    public ModuloVendas() {
        // Configurações básicas do JFrame
        setTitle("EMPRESA X - Gerenciamento de Compra e Venda");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criando a barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Menu "Cadastros"
        JMenu menuCadastros = new JMenu("Cadastros");
        JMenuItem menuItemCliente = new JMenuItem("Cliente");
        JMenuItem menuItemFornecedor = new JMenuItem("Fornecedor");
        JMenuItem menuItemFormaPagamento = new JMenuItem("Forma de Pagamento");
        JMenuItem menuItemUsuario = new JMenuItem("Usuário");
        menuCadastros.add(menuItemCliente);
        menuCadastros.add(menuItemFornecedor);
        menuCadastros.add(menuItemFormaPagamento);
        menuCadastros.add(menuItemUsuario);

        // Menu "Movimentos"
        JMenu menuMovimentos = new JMenu("Movimentos");
        JMenuItem menuItemVenda = new JMenuItem("Venda");
        JMenuItem menuItemCompra = new JMenuItem("Compra");
        JMenuItem menuItemDevolucao = new JMenuItem("Devolução");
        menuMovimentos.add(menuItemVenda);
        menuMovimentos.add(menuItemCompra);
        menuMovimentos.add(menuItemDevolucao);

        // Menu "Sair"
        JMenu menuSair = new JMenu("Sair");

        // Adicionando menus à barra de menu
        menuBar.add(menuCadastros);
        menuBar.add(menuMovimentos);
        menuBar.add(menuSair);

        // ActionListeners para os itens de menu "Movimentos"
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

        // ActionListeners para os itens de menu "Cadastros" (já existentes)
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

        // Configurando a barra de menu no frame
        setJMenuBar(menuBar);

        // Tornando o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a tela de menu principal
        SwingUtilities.invokeLater(() -> new ModuloVendas());
    }
}
