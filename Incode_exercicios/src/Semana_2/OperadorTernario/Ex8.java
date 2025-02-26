package Semana_2.OperadorTernario;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário sua idade e exibir "Você é maior de idade"
        se for maior ou igual a 18, ou "Você é menor de idade" caso contrário,
         utilizando o operador ternário.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        String msg = idade >= 18? "Você é maior de idade" : "Você é menor de idade" ;
        System.out.println(msg);
        entrada.close();



    }
}
