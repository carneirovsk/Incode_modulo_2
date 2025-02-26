package Semana_1.OperadoresAritimeticos;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
        Pedir um número ao usuário e exibir o resultado da
        expressão (num % 2 == 0) && true, explicando seu significado.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero para verificar se é par ou impar: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0){
        System.out.printf("O numero %d é par", numero);
        }else {
        System.out.printf("O numero %d é ímpar", numero);
        entrada.close();
        }

    }
}
