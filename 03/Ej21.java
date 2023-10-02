import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPares = Integer.MIN_VALUE;
        do {
            System.out.println("Introduce un número:");
            numero = scanner.nextInt();
            if (numero >= 0) {
                contador++;
                if(numero%2 != 0){
                    sumaImpares += numero;
                    contadorImpares++;
                } else {
                    if(numero > mayorPares){
                        mayorPares = numero;
                    }
                }
            }
        } while (numero >= 0);

        if (contador > 0) {
            System.out.println("Cantidad de números introducidos: " + contador);
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("Media de los impares: " + mediaImpares);
            if (mayorPares != Integer.MIN_VALUE) {
                System.out.println("Mayor número par: " + mayorPares);
            } else {
                System.out.println("No se introdujeron números pares.");
            }
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

    }
}