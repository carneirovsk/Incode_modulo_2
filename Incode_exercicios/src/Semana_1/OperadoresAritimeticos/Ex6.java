package Semana_1.OperadoresAritimeticos;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*
        Pedir um raio e calcular a
        área do círculo usando Math.PI * raio * raio.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o raio da circunferencia: ");
        double raio = entrada.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("\nA area do circulo é: %.2f", area);
        entrada.close();
    }
}
