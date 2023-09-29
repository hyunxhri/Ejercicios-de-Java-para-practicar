import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[]args) {
        System.out.println("Introduzca un número del 1 al 7: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int dia = Integer.parseInt(scanner.nextLine());
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Día no válido.");
            }
        } catch (NumberFormatException e){
            System.out.println("ERROR. Introduzca un número.");
        }
    }
}
