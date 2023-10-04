package com.example.Json;
import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private double amount;
    private double weight;

    public Product(String name, double price, double amount, double weight) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public static ArrayList<Product> listaProducts = new ArrayList<>();

    public static ArrayList<Product> getListaProducts() {
        return listaProducts;
    }

    public static void adicionarProduto(Product prod){
        listaProducts.add(prod);
    }





    public static String listar(){
        String saida = "";

        for (Product prod: listaProducts){
            saida += prod.imprimir() + "\n";
        }
        return saida;
    }

    public static boolean remover(String nome){
        for(Product prod: listaProducts){
            if(prod.getName() == nome ){
                listaProducts.remove(prod);
                return true;
            }
        }
        return false;
    }

    
    








    public String imprimir() {
        return ("\n Nome do produto: "+name+"\n Preço: "+price+"\n Quantidade: "+amount+"\n Peso: "+weight);
    }


}