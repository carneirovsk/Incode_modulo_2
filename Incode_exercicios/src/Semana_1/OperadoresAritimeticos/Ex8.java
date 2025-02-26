package Semana_1.OperadoresAritimeticos;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        /*
        Converter temperatura de Celsius para Fahrenheit usando
        a fórmula double fahrenheit = (celsius * 9/5) + 32.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Inisra O valor da temperatura em C°: ");
        double c = entrada.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.printf("A temperatura em F° é: %.2f ", f);

    }
}
