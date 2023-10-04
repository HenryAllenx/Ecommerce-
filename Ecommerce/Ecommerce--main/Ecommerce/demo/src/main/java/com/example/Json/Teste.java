package com.example.Json;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) {
        try {
            // Ler o arquivo JSON usando FileReader
            FileReader reader = new FileReader("client.json");

            // Criar um parser JSON
            JSONParser jsonParser = new JSONParser();

            // Analisar o JSON para obter um objeto JSONObject
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // Mapear os valores do JSONObject para um objeto Clients
            Clients client = new Clients(
                (String) jsonObject.get("fullname"),
                (String) jsonObject.get("address"),
                (String) jsonObject.get("email"),
                (String) jsonObject.get("sex"),
                (double) jsonObject.get("cpf"),
                (double) jsonObject.get("balance"),
                (double) jsonObject.get("age"),
                (double) jsonObject.get("cep"));

            // Agora você tem o objeto Clients preenchido com os dados do JSON
            System.out.println("Nome completo do cliente: " + client.getFullname());
            System.out.println("Endereço do cliente: " + client.getAddress());
            // E assim por diante...

        } catch (IOException | ParseException e) {
            e.printStackTrace();
            System.out.println("erro");
        }
    }
}
