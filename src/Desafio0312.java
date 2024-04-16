package src;

import java.util.Scanner;
import java.util.Random;

public class Desafio0312 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        int intentos = 0;
        
        System.out.println("¡Bienvenido a este divertido juego de adivinanzas!");
        System.out.println("Averigüe un número entre 0 y 100");
        
        while (intentos < 5) {
            System.out.print("Intento #" + (intentos + 1) + ": Ingresa tu número: ");
            int numeroUsuario = teclado.nextInt();
            
            if (numeroUsuario < 0 || numeroUsuario > 100) {
                System.out.println("Ingrese un número entre 0 y 100");
                continue;
            }
            
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Muchas felicidades! ¡¡Has acertado con el número!");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor que el número que deberías deducir");
            } else {
                System.out.println("El número que ingresaste es mayor que el número que se esperaba");
            }
            
            intentos++;
        }
        
        if (intentos == 5) {
            System.out.println("Lo siento, pero tus cinco intentos se han agotado. El número a deducir era: " + numeroAleatorio);
        }
        
        teclado.close();
    }
}