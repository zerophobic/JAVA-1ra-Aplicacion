package src;

import java.util.Scanner;

public class Evaluaciones {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la película Matrix");
            nota = teclado.nextDouble();
            
            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}
