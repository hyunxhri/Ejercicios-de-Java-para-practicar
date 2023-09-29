import java.util.Scanner;

public class Ej1 {
    public static void main(String[]args){
        System.out.println("Introduzca el día de la semana:");
        Scanner scanner = new Scanner(System.in);
        String diaSemana = scanner.nextLine().toLowerCase();
        switch(diaSemana.toString().toLowerCase()){
            case "lunes":
                System.out.println("DWEC.");
                break;
            case "martes":
                System.out.println("DWES.");
                break;
            case "miércoles":
                System.out.println("DAW.");
                break;
            case "jueves":
                System.out.println("EIE.");
                break;
            case "viernes":
                System.out.println("DISEÑO.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }
}
