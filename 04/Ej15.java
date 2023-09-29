import java.util.Random;

public class Ej15 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
        int longitudMelodia = (random.nextInt(7) + 1) * 4; // Entre 4 y 28 notas
        StringBuilder melodia = new StringBuilder();
        for (int i = 0; i < longitudMelodia; i++) {
            melodia.append(notas[random.nextInt(notas.length)]);
            melodia.append(" ");
            // Separar cada grupo de 4 notas
            if ((i + 1) % 4 == 0) {
                melodia.append("| ");
            }
        }
        // Agregar una barras vertical al final y así son dos (la anterior + esta)
        melodia.append("|");
        System.out.println(melodia);
    }
}
