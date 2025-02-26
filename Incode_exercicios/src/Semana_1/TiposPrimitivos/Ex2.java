package Semana_1.TiposPrimitivos;

public class Ex2 {
    public static void main(String[] args) {
        /*
        Declarar variáveis dos tipos byte, short, int, long, float,
         double, char e boolean, exibindo seus valores.
         */
        Byte b = 12;
        Short s = 1200;
        Integer i = 1200000;
        Long l = (long) 120000000;
        Float f = (float) 12.00003;
        Double d = 12.841951651984;
        System.out.printf("Byte: %d", b);
        System.out.printf("\nShort %d", s);
        System.out.printf("\nInt: %d", i);
        System.out.printf("\nLong: %d", l);
        System.out.printf("\nFloat: %f", f);
        System.out.printf("\nDouble: %f", d);

        /*
        Declarar um double e um int,
        realizar uma divisão e exibir o resultado.
         */
        double num1 = 12.0;
        int num2 = 2;
        System.out.println("\nO valor da divisão é: " + (num1 / num2));




    }
}
