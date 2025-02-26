package Semana_1.OperadoresLogicos;

public class Ex12 {
    public static void main(String[] args) {
        /*
        Declarar três variáveis boolean para verificar se um número é positivo (num > 0),
        negativo (num < 0) ou zero (num == 0), exibindo os valores.
         */
        int num = -2;
        boolean posi = num > 0 ? true:false;
        boolean neg = num < 0 ? true:false;
        boolean zero = num == 0 ? true:false;
        System.out.println("Numero: "+ num);
        System.out.println("Positivo: "+posi);
        System.out.println("Negativo: "+neg);
        System.out.println("Zero: "+zero);
    }
}
