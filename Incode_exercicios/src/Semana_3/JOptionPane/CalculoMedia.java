package Semana_3.JOptionPane;

import javax.swing.*;

public class CalculoMedia {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário três notas e calcular
        a média, exibindo o resultado com uma mensagem
        utilizando JOptionPane.showMessageDialog.
         */
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número"));
        double media = ((double) num1 + num2 + num3 )/ 3;
        JOptionPane.showMessageDialog(null,"O valor da média dos numeros é:  "+media);
    }
}
