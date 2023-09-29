public class Ej4 {
    public static double calculaPesetas(int euros){
        final double VALOR_PESETA = 166.386;
        double pesetas = euros * VALOR_PESETA;
        return pesetas;
    }
    public static void main(String[]args){
        int euros = 15;
        double resultado = calculaPesetas(euros);
        System.out.println("El valor de " + euros + "en pesetas es: " + resultado);
    }
}
