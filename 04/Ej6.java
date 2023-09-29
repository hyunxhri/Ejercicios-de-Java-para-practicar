import java.util.Random;
import java.util.Scanner;

public class Ej6 {
    private static final int MAX_INTENTOS = 5;
    private static final int RANGO_MIN = 0;
    private static final int RANGO_MAX = 100;

    public static void juego(int numeroSecreto, Scanner scanner, int contadorIntento){
        while (contadorIntento < MAX_INTENTOS) {
            System.out.print("Intento " + (contadorIntento + 1) + ": ");
            int intento = Integer.parseInt(scanner.nextLine());

            if (intento == numeroSecreto) {
                System.out.println("¡Enhorabuena, lo has conseguido!");
                break;
            } else if (intento < RANGO_MIN || intento > RANGO_MAX) {
                throw new IllegalArgumentException("ERROR. El número debe estar comprendido entre " + RANGO_MIN + " y " + RANGO_MAX + ".");
            } else if (intento > numeroSecreto) {
                contadorIntento++;
                if (contadorIntento == 5){
                    System.out.println("¡HAS PERDIDO! El número secreto era " + numeroSecreto + ".");
                } else {
                    System.out.println("El número es menor que " + intento);
                }
            } else {
                contadorIntento++;
                if (contadorIntento == 5){
                    System.out.println("¡HAS PERDIDO! El número secreto era " + numeroSecreto + ".");
                } else {
                    System.out.println("El número es mayor que: " + intento);
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(RANGO_MAX + 1);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Adivina el número entre " + RANGO_MIN + " y " + RANGO_MAX + ".");
            int contadorIntento = 0;
            juego(numeroSecreto, scanner, contadorIntento);
        } catch (NumberFormatException e) {
            System.out.println("ERROR. Debe introducir un número entero entre 0 y 100.");
        }
    }
}

