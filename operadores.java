package variables;

public class operadores {
    public static void main(String[] args){
        int NumeroTotal = 450;
        int Semanas = NumeroTotal /168;
        int Dias = NumeroTotal%168;
        int DiasU = Dias/24;
        int Horas = NumeroTotal%24;
        System.out.println("semanas: "+Semanas);
        System.out.println("Dias: "+DiasU);
        System.out.println("Horas: "+Horas);



    }

}
