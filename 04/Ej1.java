import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1; // Valores entre 1 y 6
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;
        int sumaTotal = dado1 + dado2 + dado3;

        System.out.println("Tirada del primer dado: " + dado1);
        System.out.println("Tirada del segundo dado: " + dado2);
        System.out.println("Tirada del tercer dado: " + dado3);
        System.out.println("Suma total: " + sumaTotal);
    }
}
