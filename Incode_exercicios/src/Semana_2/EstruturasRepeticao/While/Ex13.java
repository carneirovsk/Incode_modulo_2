package Semana_2.EstruturasRepeticao.While;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /*
        Criar um programa que solicita ao usuário um número
        e imprime a soma de todos os números inteiros até o valor informado.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int num = entrada.nextInt();
        int soma = 0;
        int i = 1;
        while (i <= num){//ou(i < num)
            soma += i++;
        }
        System.out.println("A soma dos numero é: "+soma);
        entrada.close();
    }
}
