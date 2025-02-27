package Semana_2.EstruturasRepeticao.DoWhile;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        /*
        Criar um programa que pergunte ao usuário quantas
        vezes ele deseja repetir uma ação, e continue
        pedindo até ele informar um valor maior que 0.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira quantas vezes deseja printar seu nome: ");
        int num = entrada.nextInt();
        String nome = "Pedro";
        int i = 1;
        do {
            System.out.println(nome);
            if (num == i){
                System.out.print("Insira quantas vezes deseja printar seu nome: ");
                num = entrada.nextInt();
                i = 1;
            }
            i++;
        }while (num != 0);
        entrada.close();

    }
}
