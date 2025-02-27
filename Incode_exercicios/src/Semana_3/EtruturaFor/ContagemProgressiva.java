package Semana_3.EtruturaFor;

import javax.swing.*;

/**
 * @author Pedro Carneiro
 */

public class ContagemProgressiva {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e exibir todos os números
         de 1 até o número informado utilizando um laço for.
         */

        int num =Integer.parseInt(JOptionPane.showInputDialog
                (null, "Digite um numero",
                        "Contagem Progressiva", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 1; i <= num; i++) System.out.println(i);

    }
}
