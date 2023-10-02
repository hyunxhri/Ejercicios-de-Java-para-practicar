import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Introduce la altura de la pirámide: ");
            int altura = sc.nextInt();
            System.out.print("Introduce el carácter para pintar la pirámide: ");
            char caracter = sc.next().charAt(0);
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= altura - i; j++) {
                    System.out.print(" ");
                }

                // Caracteres de la pirámide
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(caracter);
                }

                System.out.println();
            }
        } catch (InputMismatchException error){
            System.out.println("ERROR. Argumento inválido.");
        }
    }
}
