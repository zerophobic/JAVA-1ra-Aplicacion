package src;

public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //indica si la pelicula es reciente 
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        }else {
            System.out.println("Pelicula Retro que aún vale la pena ver");
        }

        //indica si la pelicual esta incluida en su plan
        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Pelicula incluida en tu plan");
        } else {
            System.out.println("Pelicula no incluida en tu plan");
        }
    }
}
