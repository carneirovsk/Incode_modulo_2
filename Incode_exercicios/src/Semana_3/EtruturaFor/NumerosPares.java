package Semana_3.EtruturaFor;

import javax.swing.*;

public class NumerosPares {
    public static void main(String[] args) {
         /*
        Solicitar ao usuário um número e, utilizando um
        laço for, exibir todos os números pares de 0 até o número informado.
         */
        int num =Integer.parseInt(JOptionPane.showInputDialog
                (null, "Digite um numero",
                        "Numeros Pares", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 0; i <= num; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
