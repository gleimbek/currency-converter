package com.alura.currency;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ApiService {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/af9db387302e01192284e2e9/latest/";

    public double getExchangeRate(String from, String to) {
        try {
            URL url = new URL(BASE_URL + from);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner scanner = new Scanner(new InputStreamReader(conn.getInputStream()));
            StringBuilder jsonText = new StringBuilder();
            while (scanner.hasNext()) {
                jsonText.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject jsonObject = new JSONObject(jsonText.toString());
            return jsonObject.getJSONObject("conversion_rates").getDouble(to);
        } catch (Exception e) {
            System.out.println("Error al obtener tasas de cambio: " + e.getMessage());
            return 0;
        }
    }
}
