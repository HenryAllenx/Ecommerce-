package com.example.Window;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Produto implements ActionListener{
    final JFrame novoFrame = new JFrame("O que deseja fazer?");

    public void abrirjanela(){
        novoFrame.setLayout(null);
        novoFrame.setVisible(true);
        novoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        novoFrame.setSize(600, 400);

        //-----------cada um desses alinha os botoes no painel---------//
        JPanel maisprod = new JPanel();
        maisprod.setBounds(10, 10, 580, 30);
        novoFrame.add(maisprod);

        JPanel editprod = new JPanel();
        editprod.setBounds(10, 50, 580, 30);
        novoFrame.add(editprod);

        JPanel verprod = new JPanel();
        verprod.setBounds(10, 80, 580, 30);
        novoFrame.add( verprod);

        JPanel removprod = new JPanel();
        removprod.setBounds(10, 110, 580, 30);
        novoFrame.add(removprod);

        JPanel back = new JPanel();
        back.setBounds(10, 140, 580, 30);
        novoFrame.add(back);

        //--------------botoes propriamente ditos------------------//
        JButton adicionarproduto = new JButton("Adicionar Produto");
        maisprod.add(adicionarproduto);

        JButton editarproduto = new JButton("Editar Produto");
        editprod.add(editarproduto);

        JButton removerproduto = new JButton("Remover Produto");
        removprod.add(removerproduto);

        JButton verproduto = new JButton("Ver Produtos");
        verprod.add(verproduto);


        JButton Voltar = new JButton("Voltar para a página inicial");
        back.add(Voltar);
        //----------------------FUNÇÕES---------------------------//

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
        final JFrame opcoes = new JFrame("Digite os detalhes do produto");
            opcoes.setLayout(null);
            opcoes.setVisible(true);
            opcoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            opcoes.setSize(600, 400);
    
        final JTextField nome = new JTextField("Digite o nome do produto");
            nome.setBounds(10, 10, 200, 30);
            opcoes.add(nome);
    
        final JTextField preco = new JTextField("Digite o preço do produto");
            preco.setBounds(10, 50, 200, 30);
            opcoes.add(preco);
    
        final JTextField quantidade = new JTextField("Digite a quantidade do produto");
            quantidade.setBounds(10, 90, 200, 30);
            opcoes.add(quantidade);
    
        final JTextField peso = new JTextField("Digite o peso do produto");
            peso.setBounds(10, 130, 200, 30);
            opcoes.add(peso);
    
            JButton confirmar = new JButton("Confirmar");
            confirmar.setBounds(10, 170, 100, 30);
            opcoes.add(confirmar);
            
           
                
    };
        
}

 




