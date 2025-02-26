package Semana_2.EstruturaCondicional;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e verificar
        se ele é positivo, negativo ou zero.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int num = entrada.nextInt();
        if (num > 0){
            System.out.printf("O numero %d é positivo", num);
        }else if (num < 0){
            System.out.printf("O numero %d é negativo", num);
        }else{
            System.out.printf("O numero é %d", num);

        }
        entrada.close();
    }
}
