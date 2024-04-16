package src;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        
        int clasificacion = (int) (media / 2);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en: %d
                Nota: %d
                """.formatted(fechaDeLanzamiento, clasificacion);

        System.out.println(sinopsis);
    }
}