package demo.src.main.java.com.example.Window;

import java.awt.*;
import javax.swing.*;


public class Window {
    

    private static void CreateWindow(){
        JFrame frame = new JFrame("Gerenciamento do Mercado", null);
        frame.setLayout(null);
  
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        frame.add(panel);
        


        JButton addProduct = new JButton("Adicionar produto");
        addProduct.setSize(40, 40);
        panel.add(addProduct);
        frame.add(addProduct);


        JButton Clients = new JButton("Clientes", null);
        frame.add(Clients);

        JButton order = new JButton("Pedidos", null);
        frame.add(order);

        JButton close = new JButton("Fechar Programa", null);
        frame.add(close);
       
        
       
      
    }

    public static void main(String[] args) {
        CreateWindow();
    }
}