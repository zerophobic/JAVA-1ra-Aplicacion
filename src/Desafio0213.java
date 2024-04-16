package src;

public class Desafio0213 {
    public static void main(String[] args) {
        double temperaturaCelsius = 20.0; // Temperatura en grados Celsius
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32; // Conversión a Fahrenheit
        System.out.println("Temperatura en Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit);
        
        // Mostrar la temperatura en grados Fahrenheit sin decimales
        int temperaturaFahrenheitEntera = (int) temperaturaFahrenheit; // Volver entero
        System.out.println("Temperatura en Fahrenheit (entera): " + temperaturaFahrenheitEntera);
    }
}
