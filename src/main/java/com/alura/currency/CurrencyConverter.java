package com.alura.currency;

public class CurrencyConverter {
    private final ApiService apiService;

    public CurrencyConverter(ApiService apiService) {
        this.apiService = apiService;
    }

    public double convert(String from, String to, double amount) {
        double rate = apiService.getExchangeRate(from, to);
        return amount * rate;
    }
}
