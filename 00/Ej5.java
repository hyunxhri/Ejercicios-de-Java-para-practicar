public class Ej5 {
    static double pesetas;
    public static void datos(double pesetas){
        Ej5.pesetas = pesetas/166.386;
    }

    public static void main(String[]args){
        datos(3000);
        System.out.println(Ej5.pesetas);
    }
}
//euros=pesetas/166.386