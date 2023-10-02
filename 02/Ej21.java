import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        try{
            int nota1 = scanner.nextInt();
            if(nota1 < 0 || nota1 > 10){
                throw new IllegalArgumentException("Nota no válida.");
            } else {
                System.out.println("Introduce la nota del segundo examen:");
                int nota2 = scanner.nextInt();
                scanner.nextLine();
                if(nota2 < 0 || nota2 > 10){
                    throw new IllegalArgumentException("Nota no válida.");
                } else {
                    double media =  (double) (nota1 + nota2) /2;
                    if(nota1 > 5 && nota2 > 5) {
                        System.out.println("La media es: " + media);
                    } else if (nota1 < 5 || nota2 < 5){
                        System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
                        String resultado = scanner.nextLine().toLowerCase();
                        switch (resultado) {
                            case "apto" -> System.out.println("La nota media es 5.");
                            case "no apto" -> System.out.println("La nota media es " + media);
                            default -> System.out.println("Valor introducido no válido.");
                        }
                    }
                }
            }
        } catch (InputMismatchException error) {
            System.out.println("ERROR. DEBE INGRESAR UNA NOTA.");
        }
    }
}
