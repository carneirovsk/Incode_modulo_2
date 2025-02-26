package Semana_2.EstruturaCondicional;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*
        Criar um programa que solicita a nota do aluno
        e exibe a classificação: "Aprovado" para nota >= 7,
         "Recuperação" para 5 <= nota < 7, e "Reprovado" para nota < 5.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira sua nota final: ");
        double nota = entrada.nextDouble();
        if (nota >= 7){
            System.out.println("Aprovado");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
