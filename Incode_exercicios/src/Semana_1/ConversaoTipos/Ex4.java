package Semana_1.ConversaoTipos;

public class Ex4 {
    public static void main(String[] args) {
        /*
        Declarar um double, converter para int
        explicitamente (casting) e exibir ambos os valores.
         */
        double d = 12.5;
        int i = (int) d;
        System.out.printf("valor double: %.2f\n", d);
        System.out.printf("valor int: %d", i);

        /*
        Receber um número como String e converter
        para int usando Integer.parseInt().
         */

        String numero = "16";
        int numeroInt = Integer.parseInt(numero);
        System.out.printf("\nvalor inteiro convertido: %d", numeroInt);


    }
}
