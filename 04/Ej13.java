import java.util.Random;

public class Ej13 {
    public static void main(String[] args) {
        Random random = new Random();
        int dado2;
        int dado1;
        do {
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            System.out.println("Dado 1: " + dado1 + " || Dado 2: " + dado2);
        } while (dado1 != dado2);
    }
}
