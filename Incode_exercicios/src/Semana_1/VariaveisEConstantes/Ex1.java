package Semana_1.VariaveisEConstantes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Declarar uma variável do tipo int para armazenar a idade de uma pessoa.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a idade da pessoa: ");

        int idade = entrada.nextInt();
        System.out.printf("A idade da pessoa é: %d\n", idade);


        /*Declarar uma constante do tipo double para armazenar
        o valor de PI (3.14159) e exibir seus valores.*/
        double pi = 3.14159;
        System.out.printf("O valor de pi é: %f\n\n", pi);

        /*Declarar variáveis String para armazenar um nome e uma profissão
         e exibir na formatação: Nome: [nome], Profissão: [profissão].*/
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Insira o nome da pessoa: ");
        String nome = entrada2.next();
        System.out.print("\nInsira a profissão da pessoa: ");
        String prof = entrada.next();

        System.out.printf("Nome: %s, Profissão: %s ", nome, prof);
        entrada2.close();
        entrada.close();

        /*
            Declarar duas variáveis int, atribuir valores e realizar soma,
             subtração e multiplicação entre elas.
         */

        int num1 = 2;
        int num2 = 3;
        int soma = num1 + num2;
        int subt = num1 - num2;
        int mult = num1 * num2;

        System.out.printf("\n\nResultado da soma: %d\n" +
                "Resultado da subtração: %d\n" +
                "Resultado da multiplicação: %d\n", soma, subt, mult);






    }
}
