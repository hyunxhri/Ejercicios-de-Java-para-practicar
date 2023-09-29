import java.util.Random;

public class Ej10 {
    public static void main(String[] args) {
        String[] caracteres = {"*", "-", "=", ".", "|", "@"};
        Random random = new Random();
        String caracter = caracteres[random.nextInt(6)];
        System.out.println(caracter.repeat(random.nextInt(40) + 1));
    }
}
