import java.util.Random;

public class Ej9 {
     public static void main(String[] args) {
            Random random = new Random();
            int intentos = 0;

            while (true) {
                int numero = random.nextInt(51) * 2; // Genera un número par entre 0 y 100
                System.out.print(numero + " ");
                intentos++;

                if (numero == 24) {
                    break;
                }
            }

        System.out.println("\n\nSe generaron " + intentos + " números antes de obtener el 24.");
    }
}


