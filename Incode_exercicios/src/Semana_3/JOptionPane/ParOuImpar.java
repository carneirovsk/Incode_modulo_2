package Semana_3.JOptionPane;

import javax.swing.*;

public class ParOuImpar {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e exibir
        uma mensagem dizendo se o número é par ou
        ímpar, utilizando JOptionPane.showMessageDialog.
         */
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null,"O numero " + num + " é par");
        }
        else{
            JOptionPane.showMessageDialog(null,"O numero " + num + " é ímpar");

        }
    }
}
