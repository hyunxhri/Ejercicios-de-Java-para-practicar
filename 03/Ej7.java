import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clave = 6485;
        int intentos = 0;
        boolean cajaAbierta = false;
        while(intentos < 4 && !cajaAbierta){
            System.out.println("Introduzca la clave para abrir la caja fuerte: ");
            int codigo = scanner.nextInt();
            if(codigo == clave){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                cajaAbierta = true;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos++;
            }
        }
    }
}
