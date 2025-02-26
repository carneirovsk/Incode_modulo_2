package Semana_2.EstruturaCondicional;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /*
        Perguntar ao usuário se ele tem mais
        de 18 anos e se é estudante para determinar
        se ele tem direito a desconto
        (pode ser utilizando && no if).
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Você é maior de idade?(sim ou não) ");
        String maior = entrada.next();
        System.out.print("Você é estudante?(sim ou não) ");
        String estudante = entrada.next();

        if (maior.toLowerCase().equals("sim") && estudante.toLowerCase().equals("sim")){
            System.out.println("Você tem direito a desconto");
        }else {
            System.out.println("Você não tem direito a desconto");
        }
        entrada.close();


    }
}
