import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero de 1 a 5 dígitos:");
        int numero = scanner.nextInt();
        switch(Integer.toString(numero).length()){
            case 1 -> System.out.println("El número tiene un dígito.");
            case 2 -> System.out.println("El número tiene dos dígitos.");
            case 3 -> System.out.println("El número tiene tres dígitos.");
            case 4 -> System.out.println("El número tiene cuatro dígitos.");
            case 5 -> System.out.println("El número tiene cinco dígitos.");
            default -> throw new IllegalArgumentException("ERROR. El número no tiene de 1 a 5 dígitos.");
        }
    }
}
