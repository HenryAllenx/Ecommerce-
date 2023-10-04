package com.example.Json;

import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private ArrayList<Product> products;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.products = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice() * product.getAmount();
        }
        return total;
    }

    // Método para salvar o pedido em um arquivo JSON
    public void saveToJson(String orderj) {
        OrderJsonConverter.saveOrderToJson(this, orderj);
    }

    // Método para carregar pedidos de um arquivo JSON
    public static ArrayList<Order> loadFromJson(String orderj) {
        return OrderJsonConverter.loadOrdersFromJson(orderj);
    }
}
