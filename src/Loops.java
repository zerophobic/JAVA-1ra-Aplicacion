package src;

import java.util.Scanner;

public class Loops {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int index = 0; index < 3; index++) {
            System.out.println("Escribe la nota que le darias a la película Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media de evaluciones para Matrix es: " + mediaEvaluaciones / 3);
    }
}
