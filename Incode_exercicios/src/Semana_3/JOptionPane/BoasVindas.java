package Semana_3.JOptionPane;

import javax.swing.*;

public class BoasVindas {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário seu nome e exibir uma mensagem
         de boas-vindas utilizando JOptionPane.showMessageDialog.
         */
        String nome = JOptionPane.showInputDialog("Digite Seu nome");
        JOptionPane.showInternalMessageDialog(null, "Seja bem-vindo " + nome + "!");
    }
}
