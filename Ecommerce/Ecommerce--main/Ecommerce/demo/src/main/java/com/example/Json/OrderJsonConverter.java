package com.example.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OrderJsonConverter {
    
    public static void saveOrderToJson(Order order, String orderj) {
        JSONObject orderJson = orderToJson(order);

        try (FileWriter fileWriter = new FileWriter(orderj)) {
            fileWriter.write(orderJson.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject orderToJson(Order order) {
        JSONObject orderJson = new JSONObject();
        orderJson.put("orderNumber", order.getOrderNumber());
    
        JSONArray productsJson = new JSONArray();
        for (Product product : order.getProducts()) {
            JSONObject productJson = new JSONObject();
            productJson.put("name", product.getName());
            productJson.put("price", product.getPrice());
            productJson.put("amount", product.getAmount());
            productJson.put("weight", product.getWeight());
            productsJson.add(productJson);
        }
        
        orderJson.put("products", productsJson);
        return orderJson;
    }

    public static ArrayList<Order> loadOrdersFromJson(String orderj) {
        ArrayList<Order> orders = new ArrayList<>();

        try (FileReader fileReader = new FileReader(orderj)) {
            JSONParser jsonParser = new JSONParser();
            JSONArray ordersArray = (JSONArray) jsonParser.parse(fileReader);

            for (Object orderObj : ordersArray) {
                JSONObject orderJson = (JSONObject) orderObj;
                Order order = jsonToOrder(orderJson);
                orders.add(order);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return orders;
    }

    private static Order jsonToOrder(JSONObject orderJson) {
        // Implemente aqui a lógica para converter JSON em um objeto Order
        return null; // Substitua por uma instância real de Order
    }
}
