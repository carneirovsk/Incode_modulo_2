package Semana_3.EtruturaFor;

import javax.swing.*;

/**
 * @author Pedro Carneiro
 */

public class SomarNumeros {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e,
        em seguida, solicitar até esse número e exibir a soma de todos
        os números inteiros de 1 até o valor informado.
         */
        int soma = 0;
        int num =Integer.parseInt(JOptionPane.showInputDialog
                (null, "Digite um numero",
                        "Somar numeros", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 1; i <= num; i++){
            soma += i;
        }
        System.out.println("A soma de todos os numeros inteiros ate o " + num + " é " + soma);

    }
}
