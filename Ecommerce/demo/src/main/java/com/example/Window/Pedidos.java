package com.example.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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

        verPedidos.add(pedidos);

        remover.add(remove);

        back.add(Voltar);

    }
     @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == adicionarPedidos) {
        
       }
    }
    
}
