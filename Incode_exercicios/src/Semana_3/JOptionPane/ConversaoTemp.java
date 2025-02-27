package Semana_3.JOptionPane;

import javax.swing.*;

public class ConversaoTemp {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário uma temperatura
        em graus Celsius e exibir a conversão
        para Fahrenheit utilizando JOptionPane.
         */
        double celcius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em ºC"));
        double f = (celcius * 9/5) + 32;
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é: "+ f + "ºF");

    }
}
