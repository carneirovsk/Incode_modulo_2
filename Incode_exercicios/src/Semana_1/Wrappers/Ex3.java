package Semana_1.Wrappers;

public class Ex3 {
    public static void main(String[] args) {
        /*
         * Declarar um Integer, atribuir um valor e
         * converter para int usando .intValue().
         */
        Integer numero = 10;
        int valor = numero.intValue();
        System.out.printf("Valor = %d\n", valor);

        /*
         * Declarar um double,
         * converter para Double (wrapper) e exibir.
         */
        double numero1 = 10.4;
        Double valor1 = numero1;
        System.out.printf("Valor primitivo = %f\n", numero1);
        System.out.printf("Valor wrapper = %f", valor1);





    }
}
