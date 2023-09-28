package com.example.Window;

import java.awt.*;
import javax.swing.*;

import com.example.Product;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    

    private static void CreateWindow(){
        String[]botao = {"Produto", "clientes","pedidos","fechar"};

        int option = JOptionPane.showOptionDialog(null,
         "Escolha",
          "Gerenciamento de mercado",
           JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
             null,
              botao,
               0);
        
        if (option == 0) {
            Produto abrir = new Produto();
            abrir.abrirjanela();
        } else if(option == 1){
            Clientes clientes = new Clientes();
            clientes.openClients();
            
        }else if(option == 2){
            Pedidos order = new Pedidos();
            order.openOrder();
        }else{
            
        }

        //---------------------BOTÕES---------------------------//
        

   





        /*/funcao do botao cliente que ainda falta fzr
        JButton Clients = new JButton("Clientes", null);
        clientes.add(Clients);
        Clients.setBounds(10, 50, 150, 30);

        
        //botao pra ver os pedidos feitos(nao sei como printar, ta foda pra mim)
        JButton order = new JButton("Pedidos", null);
        ordenar.add(order);
        order.setBounds(10, 90, 150, 30);

        //fechar, depois eu vejo isso
        JButton close = new JButton("Fechar Programa", null);
        fechar.add(close);
        close.setBounds(50, 130, 150, 30);*/
        
       
      
    }

    public static void main(String[] args) {
        CreateWindow();
    }
}
