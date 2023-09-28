package com.example.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Clientes implements ActionListener {
    final JFrame newFrame = new JFrame("O que desejas fazer?");

    public void openClients(){
        newFrame.setLayout(null);
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(600, 400);

        JPanel adicionarClientes = new JPanel();
        adicionarClientes.setBounds(10, 10, 580, 30);
        newFrame.add(adicionarClientes);

        JPanel verClientes = new JPanel();
        verClientes.setBounds(10, 50, 580, 30);
        newFrame.add(verClientes);

        JPanel back = new JPanel();
        back.setBounds(10, 140, 580, 30);
        newFrame.add(back);
 //-------------------------------------------//


        JButton addcliente = new JButton("Adicionar Cliente: ");
        adicionarClientes.add(addcliente);

        JButton verClients = new JButton("Ver Clientes");
        verClientes.add(verClients);

        JButton Voltar = new JButton("Voltar para a página inicial");
        back.add(Voltar);


    }








    @Override
    public void actionPerformed(ActionEvent e) {
        
       
    }
    
}
