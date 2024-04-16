package src;

import java.util.Scanner;

public class Desafio0403 {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("*********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + "US$ " + saldo);
        System.out.println("\n*********************************");

        String menu = """
                *** Ingrese el número de la opción que desea ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actualizado es: " + "US$ " + saldo);
                break;
                case 2:
                    System.out.println("¿Qué valor desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorARetirar;
                        System.out.println("Su saldo actualizado es: "+ "US$ " + saldo);
                    }
                break;
                case 3:
                    System.out.println("¿Qué valor desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su saldo actualizado es: "+ "US$ " + saldo);
                break;
                case 9:
                    System.out.println("Cerrando el programa, agradecemos su uso de nuestros servicios.");
                break;
                default:
                    System.out.println("Opción no valida");
            }
        }

        teclado.close();
    }
}
