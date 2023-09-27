package com.example.Window;

import java.awt.*;
import javax.swing.*;

import com.example.Product;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    

    private static void CreateWindow(){

        JFrame frame = new JFrame("Gerenciamento do Mercado", null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel produto = new JPanel(new FlowLayout(FlowLayout.CENTER));
        produto.setBounds(10, 10, 580, 30);
        frame.add(produto);

        JPanel clientes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        clientes.setBounds(10, 50, 580, 30);
        frame.add(clientes);

        JPanel ordenar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ordenar.setBounds(10, 80, 580, 30);
        frame.add(ordenar);

        JPanel fechar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        fechar.setBounds(10, 110, 580, 30);
        frame.add(fechar);


        //---------------------BOTÕES---------------------------//
        JButton addProduct = new JButton("Produto");
        produto.add(addProduct);

        addProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //----------painel---------//
          final JFrame novoFrame = new JFrame("O que deseja fazer?");
                novoFrame.setLayout(null);
                novoFrame.setVisible(true);
                novoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                novoFrame.setSize(600, 400);

                //-----------cada um desses alinha os botoes no painel---------//
                JPanel maisprod = new JPanel(new FlowLayout(FlowLayout.CENTER));
                maisprod.setBounds(10, 10, 580, 30);
                novoFrame.add(maisprod);

                JPanel editprod = new JPanel(new FlowLayout(FlowLayout.CENTER));
                editprod.setBounds(10, 50, 580, 30);
                novoFrame.add(editprod);

                JPanel removprod = new JPanel(new FlowLayout(FlowLayout.CENTER));
                removprod.setBounds(10, 80, 580, 30);
                novoFrame.add(removprod);

                JPanel back = new JPanel(new FlowLayout(FlowLayout.CENTER));
                back.setBounds(10, 110, 580, 30);
                novoFrame.add(back);

                //--------------botoes propriamente ditos------------------//
                JButton adicionarproduto = new JButton("Adicionar Produto");
                maisprod.add(adicionarproduto);

                JButton editarproduto = new JButton("Editar Produto");
                editprod.add(editarproduto);

                JButton removerproduto = new JButton("Remover Produto");
                removprod.add(removerproduto);

                JButton Voltar = new JButton("Voltar para a página inicial");
                back.add(Voltar);
                //----------------------FUNÇÕES---------------------------//


                //adicionar produto
                adicionarproduto.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e){
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
                            
                            confirmar.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    
                                Product produto = new Product(
                                nome.getText(),
                                Double.parseDouble(preco.getText()),
                                Double.parseDouble(quantidade.getText()),
                                Double.parseDouble(peso.getText())
                                );
                                Product.adicionarProduto(produto);
                                Product.getListaProducts(); //NÃO SEI COMO PRINTAR ESSA PORRA NA TELA VAI SE FUDE ESSA LINGUAGEM DO CARALHO
                                opcoes.setVisible(false);

                            }
                                
                            });
                        
                        }
                });




                //editar o produto
                editarproduto.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e){
                        
                        
                        }
                });

                //remover o produto
                removerproduto.addActionListener(new ActionListener() {
                     @Override
                        public void actionPerformed(ActionEvent e){
                        
                        
                        }
                });

                //voltar pro menu inicial(FUNCIONANDO)
                Voltar.addActionListener(new ActionListener() {
                     @Override
                        public void actionPerformed(ActionEvent e){
                        novoFrame.setVisible(false);
                        }
                });
            }


        });;





        //funcao do botao cliente que ainda falta fzr
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
        close.setBounds(50, 130, 150, 30);
        
       
      
    }

    public static void main(String[] args) {
        CreateWindow();
    }
}
