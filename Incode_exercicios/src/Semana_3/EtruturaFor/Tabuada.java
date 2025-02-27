package Semana_3.EtruturaFor;


import javax.swing.*;

/// @author Pedro Carneiro
public class Tabuada {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e exibir a tabuada
         desse número (de 1 a 10) utilizando um laço for.
         */
        int resultado = 0;
        int num =Integer.parseInt(JOptionPane.showInputDialog
                (null, "Digite um numero",
                        "Tabuada", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 1; i <= 10; i++){
            resultado = num * i;
            System.out.printf("%d X %d = %d\n", num, i, resultado);
        }
    }
}
