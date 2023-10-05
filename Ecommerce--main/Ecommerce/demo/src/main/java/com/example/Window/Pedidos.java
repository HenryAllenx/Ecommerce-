package com.example.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.example.Json.Product;

public class Pedidos implements ActionListener {
    final JFrame framePedidos = new JFrame("O que desejas fazer");
    JButton adicionarPedidos = new JButton("Fazer pedido");
    JButton pedidos = new JButton("Ver pedidos");
    JButton remove = new JButton("Remover pedido");
    JButton Voltar = new JButton("Voltar para a página inicial");
    
    public void openOrder(){
        framePedidos.setLayout(null);
        framePedidos.setVisible(true);
        framePedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePedidos.setSize(600, 400);

        JPanel addPedidos = new JPanel();
        addPedidos.setBounds(10, 10, 580, 30);
        framePedidos.add(addPedidos);

        JPanel verPedidos = new JPanel();
        verPedidos.setBounds(10, 50, 580, 30);
        framePedidos.add(verPedidos);

        JPanel remover = new JPanel();
        remover.setBounds(10,80,580,30);
        framePedidos.add(remover);

        JPanel back = new JPanel();
        back.setBounds(10, 140, 580, 30);
        framePedidos.add(back);

        //------------------------------------//

        addPedidos.add(adicionarPedidos);
        adicionarPedidos.addActionListener(this);

        verPedidos.add(pedidos);
        pedidos.addActionListener(this);

        remover.add(remove);
        remove.addActionListener(this);

        back.add(Voltar);
        Voltar.addActionListener(this);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == adicionarPedidos) {
         final JFrame opcoes = new JFrame("Digite os detalhes do pedido");
            opcoes.setLayout(null);
            opcoes.setVisible(true);
            opcoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            opcoes.setSize(600, 400);
    
        final JTextField nome = new JTextField("Digite o nome do produto");
            nome.setBounds(10, 10, 200, 30);
            opcoes.add(nome);
            
        final JTextField quantidade = new JTextField("Digite a quantidade de produto");
            quantidade.setBounds(10, 90, 200, 30);
            opcoes.add(quantidade);
    
        

    
            JButton confirmar = new JButton("Confirmar");
            confirmar.setBounds(10, 170, 100, 30);
            opcoes.add(confirmar);

            confirmar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    Product.adicionarProduto(null);

                    opcoes.setVisible(false);
                }
            });
       }
       if (e.getSource() == Voltar) {
            Window nova = new Window();
            nova.CreateWindow();
            
       }
    }
    
}
