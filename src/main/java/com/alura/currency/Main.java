package com.alura.currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiService apiService = new ApiService();
        CurrencyConverter converter = new CurrencyConverter(apiService);

        String option;
        do {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("1. USD a ARS");
            System.out.println("2. ARS a USD");
            System.out.println("3. USD a BRL");
            System.out.println("4. BRL a USD");
            System.out.println("5. EUR a USD");
            System.out.println("6. USD a EUR");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextLine();

            String from = "", to = "";
            switch (option) {
                case "1": from = "USD"; to = "ARS"; break;
                case "2": from = "ARS"; to = "USD"; break;
                case "3": from = "USD"; to = "BRL"; break;
                case "4": from = "BRL"; to = "USD"; break;
                case "5": from = "EUR"; to = "USD"; break;
                case "6": from = "USD"; to = "EUR"; break;
                case "7": System.out.println("Saliendo..."); continue;
                default:
                    System.out.println("Opción inválida."); continue;
            }

            System.out.print("Ingresa el valor que deseas convertir: ");
            double amount = Double.parseDouble(scanner.nextLine());

            double result = converter.convert(from, to, amount);
            System.out.printf("El valor de %.2f %s corresponde a %.2f %s%n", amount, from, result, to);

        } while (!option.equals("7"));

        scanner.close();
    }
}
