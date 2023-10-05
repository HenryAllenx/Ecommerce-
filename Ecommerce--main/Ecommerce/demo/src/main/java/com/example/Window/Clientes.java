package com.example.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.example.Json.Product;

public class Clientes implements ActionListener {
    final JFrame newFrame = new JFrame("O que desejas fazer?");
    JButton addcliente = new JButton("Adicionar Cliente: ");
    JButton verClients = new JButton("Ver Clientes");
    JButton Voltar = new JButton("Voltar para a pÃ¡gina inicial");

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


        adicionarClientes.add(addcliente);
        addcliente.addActionListener(this);

        verClientes.add(verClients);
        

        back.add(Voltar);
        Voltar.addActionListener(this);




    }




    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == addcliente) {
             final JFrame opcoes = new JFrame("Criar novo Cliente");
            opcoes.setLayout(null);
            opcoes.setVisible(true);
            opcoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            opcoes.setSize(600, 400);
    
        final JTextField nome = new JTextField("Digite o nome do Cliente");
            nome.setBounds(10, 10, 200, 30);
            opcoes.add(nome);
            
    
        final JTextField cpf = new JTextField("Digite o cpf do Cliente");
            cpf.setBounds(10, 50, 200, 30);
            opcoes.add(cpf);
    
        final JTextField sexo = new JTextField("Digite o sexo do Cliente");
            sexo.setBounds(10, 90, 200, 30);
            opcoes.add(sexo);
    
        final JTextField saldo = new JTextField("Digite o Saldo do Cliente");
            saldo.setBounds(10, 130, 200, 30);
            opcoes.add(saldo);

    
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
