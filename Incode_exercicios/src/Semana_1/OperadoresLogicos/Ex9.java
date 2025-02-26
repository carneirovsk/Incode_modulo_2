package Semana_1.OperadoresLogicos;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*
        Declarar uma variável boolean maiorDeIdade
         e atribuir a expressão (idade >= 18), exibindo o valor.
         */
        boolean maiorDeIdade;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a idade da pessoa: ");
        int idade = entrada.nextInt();
        if (idade<18){
            maiorDeIdade = false;
            System.out.print("A pessoa é menor de idade ");
        }else {
            maiorDeIdade = true;
            System.out.print("A pessoa é maior de idade ");
        }


        entrada.close();
    }
}
