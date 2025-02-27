package Semana_3.EstruturaBreak;

import javax.swing.*;

public class ContinueFor {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e, utilizando
        um laço for e continue, exibir apenas os números
         ímpares de 1 até o número informado.
         */
        int num =Integer.parseInt(JOptionPane.showInputDialog
                (null, "Digite um numero",
                        "For com ocntinue", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
