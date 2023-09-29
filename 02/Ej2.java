import java.util.Scanner;

public class Ej2 {
    public static void main(String[]args) {
        System.out.println("Introduzca la hora: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int hora = Integer.parseInt(scanner.nextLine());
            if (hora >= 6 && hora <= 12) {
                System.out.println("Es por la mañana.");
            } else if (hora > 12 && hora < 21) {
                System.out.println("Es por la tarde.");
            } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
                System.out.println("Es por la noche.");
            } else {
                System.out.println("Hora no válida.");
            }
        } catch (NumberFormatException e){
            System.out.println("ERROR. Introduzca un número.");
        }
    }
}
