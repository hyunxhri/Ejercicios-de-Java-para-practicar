import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        String[] palos = {"Oro", "Basto", "Copa", "Espada"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
        Random random = new Random();
        int indicePalo = random.nextInt(4);
        int indiceValor = random.nextInt(9);
        System.out.println("El valor de la carta es: " + valores[indiceValor] + " de " + palos[indicePalo]);
    }
}
