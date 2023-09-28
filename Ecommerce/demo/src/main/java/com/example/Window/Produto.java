package com.example.Window;

import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.tools.DocumentationTool.Location;

public class Produto implements ActionListener{
    
    final JFrame novoFrame = new JFrame("O que deseja fazer?");
    JTable tabela;
    DefaultTableModel table;
    String[] colunas = {"Nome", "Quantidade", "Preço", "Peso"};
    String name;
    double preco;
    int quantidade;
    double peso;
    
    
    //----------BOTÕES----------//
    JButton adicionarproduto = new JButton("Adicionar Produto");
    JButton editarproduto = new JButton("Editar Produto");
    JButton removerproduto = new JButton("Remover Produto");
    JButton verproduto = new JButton("Ver Produtos");
    JButton voltar = new JButton("Menu");
    
    
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
        novoFrame.add(verprod);

        
        

        JPanel removprod = new JPanel();
        removprod.setBounds(10, 110, 580, 30);
        novoFrame.add(removprod);

        JPanel back = new JPanel();
        back.setBounds(10, 140, 580, 30);
        novoFrame.add(back);

        //--------------Funções Botões------------------//
        maisprod.add(adicionarproduto);
        adicionarproduto.addActionListener(this);

        editprod.add(editarproduto);
        editarproduto.addActionListener(this);

        removprod.add(removerproduto);
        removerproduto.addActionListener(this);

        verprod.add(verproduto);
        verproduto.addActionListener(this);


        back.add(voltar);
        voltar.addActionListener(this);
        //----------------------FUNÇÕES---------------------------//

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
        if (e.getSource() == adicionarproduto) {
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
            opcoes.add(preco.setPrice());
    
        final JTextField quantidade = new JTextField("Digite a quantidade do produto");
            quantidade.setBounds(10, 90, 200, 30);
            opcoes.add(quantidade.setAmount());
    
        final JTextField peso = new JTextField("Digite o peso do produto");
            peso.setBounds(10, 130, 200, 30);
            opcoes.add(peso.setWeight());
    
            JButton confirmar = new JButton("Confirmar");
            confirmar.setBounds(10, 170, 100, 30);
            opcoes.add(confirmar);

            confirmar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    

                    opcoes.setVisible(false);
                }
            });
            

        }

        else if (e.getSource() == editarproduto) {
            
        }

        else if (e.getSource() == removerproduto) {
            
        }

        else if (e.getSource() == verproduto) {
           final JFrame info = new JFrame();
           info.setLayout(null);
           info.setVisible(true);
           info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           info.setSize(600, 400);

            table = new DefaultTableModel();
            tabela = new JTable();
            table.addColumn("Nome");
            table.addColumn("Preço");
            table.addColumn("Peso");
            table.addColumn("Quantidade");

            
            
            voltar.setBounds(250, 330,80 , 30);
            info.add(voltar);
            voltar.addActionListener(this);


        }

        else if (e.getSource() == voltar) {
            Window abrir = new Window();
            Window.CreateWindow();
        }
        
            
           
                
    };
        
}



 




