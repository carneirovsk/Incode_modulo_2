package Semana_1.OperadoresAritimeticos;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
        Receber três números e calcular a média aritmética
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int num3 = entrada.nextInt();

        double media = (double) (num1 + num2 + num3) /3;
        System.out.printf("A media dos valores é: %.2f", media);
        entrada.close();
    }

}
