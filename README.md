# Conversor de Monedas

Este es un conversor de monedas desarrollado en Java como parte del desafío Alura Latam. Utiliza la API de ExchangeRate para obtener tasas de cambio actualizadas.

## Características

- Conversión entre USD, ARS, BRL y EUR
- Interfaz de consola
- Manejo básico de errores

## Requisitos

- Java 17+
- Maven
- API Key de [ExchangeRate API](https://www.exchangerate-api.com/)

## Instrucciones

1. Clona el repositorio.
2. Reemplaza `YOUR-API-KEY` en `ApiService.java` con tu clave de API.
3. Compila y ejecuta:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.alura.currency.Main"
```

## Licencia

MIT
