package Semana_3.EtruturaFor;

import javax.swing.*;

/**
 * @author Pedro Carneiro
 */

public class SequenciaImpar {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número n e imprimir uma sequência onde o primeiro número seja 1
        , o segundo 3, o terceiro 5, e assim por diante, até o nésimo valor.
         */
        int num =Integer.parseInt(JOptionPane.showInputDialog
                (null, "Digite um numero",
                        "Sequencia ímpar", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 1; i <= num; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
