public class Ej6 {
    public static double calculaIVA(double baseImponible, final double porcentaje){
        double IVA = baseImponible * (1 + porcentaje);
        return IVA;
    }

    public static void main(String[]args){
        double baseImponible = 33.33;
        final double PORCENTAJE_IVA = 0.21;
        double resultado = calculaIVA(baseImponible, PORCENTAJE_IVA);
        System.out.println("Base Imponible ------- " + baseImponible);
        System.out.println("Porcentaje IVA -------- " + PORCENTAJE_IVA);
        System.out.println("Precio total ---------- " + resultado);
    }
}
