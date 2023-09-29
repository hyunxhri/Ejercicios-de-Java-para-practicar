import java.util.Random;

public class Ej5 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroMinimo = 199; //Al ser el máximo, siempre se sobreescribirá excepto si los 50 números fueran 199.
        int numeroMaximo = 100; //Al ser el mínimo, siempre se sobreescribirá excepto si los 50 números fueran 100.
        int media = 0;

        for(int i= 0; i <= 50; i++){
            int numero = random.nextInt(100, 200);
            System.out.print(numero + " ");

            if(numeroMinimo > numero){
                numeroMinimo = numero;
            }
            if(numeroMaximo < numero){
                numeroMaximo = numero;
            }
            media = media + numero;
        }
        media = media / 50;
        System.out.println("\nEl número mínimo es: " + numeroMinimo);
        System.out.println("El número máximo es: " + numeroMaximo);
        System.out.println("La media es: " + media);
    }
}

