import java.util.Random;

public class Ej2 {
    public static void main(String[]args){
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Random random = new Random();
        int indicePalo = random.nextInt(4);
        int indiceValor = random.nextInt(13);
        System.out.println("El valor de la carta es: " + valores[indiceValor] + " de " + palos[indicePalo]);
    }
}
