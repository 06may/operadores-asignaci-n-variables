package variables;
public class OperacionesDos {
    public static void main(String[] args ){

        int N4 = 10;
        int N5 = 20;
        int N6 = 30;
        double Total = N4+N5+N6;
        double Promedio = Total/3;
        int Resto = N5%N4;      
        System.out.println("Total: "+Total);
        System.out.println("Promedio: "+Promedio);
        System.out.println("Resto: "+Resto);
    }
}
