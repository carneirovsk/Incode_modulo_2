package Semana_3.JOptionPane;

import javax.swing.*;

public class CalculadoraSimples {
    public static void main(String[] args) {
        /*
        Criar uma calculadora que solicite ao usuário
        dois números e uma operação (adição, subtração,
        multiplicação ou divisão) utilizando JOptionPane
        .showInputDialog e exiba o resultado utilizando
        JOptionPane.showMessageDialog.
         */
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        String opercao = JOptionPane.showInputDialog("Escolha uma operação (+, -, *, /)");
        switch (opercao.trim()){
            case "*":
                JOptionPane.showMessageDialog(null,"O resultado da operação é: " +  (num1 * num2));
                break;
            case "+":
                JOptionPane.showMessageDialog(null,"O resultado da operação é: " + (num1 + num2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null,"O resultado da operação é: " + (num1 - num2));
                break;
            case "/":
                double result = ((double) num1 / num2);
                JOptionPane.showMessageDialog(null,"O resultado da operação é: " + result);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operção inválida!");

        }

    }
}
