package Semana_2.EstruturasRepeticao.While;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e imprimir todos
        os números de 1 até o número fornecido (inclusive).
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int num = entrada.nextInt();
        int i = 1;
        while (i<=num){
            System.out.println(i++);
        }
    }
}
