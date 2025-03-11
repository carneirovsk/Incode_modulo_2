package Semana_4.DesafioJoption;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DesafioJoption {
    public static void main(String[] args) {

        int option = 0;
        ArrayList<String> listaTotal = new ArrayList<>();
        ArrayList<String> listaPendente = new ArrayList<>();
        Object[] itens = {"Adicionar tarefa","Listar tarefas","Listar tarefas pendentes","Listar tarefas concluidas","Concluir Tarefa","Sair"};
        ArrayList<String> listaConcluida = new ArrayList<>();
        while (option != 6){
            Object selectedValue = JOptionPane.showInputDialog(null,
                      "Escolha um item", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    itens, itens [0]);
            if (selectedValue == null){
                break;
            }
            String escolha = selectedValue.toString();

            if (escolha.equals("Adicionar tarefa")){
                String novaTarefa = JOptionPane.showInputDialog("Digite sua nova tarefa");
                listaTotal.add(novaTarefa);
                listaPendente.add(novaTarefa);
                
            } else if (escolha.equals("Listar tarefas")) {
                if (listaTotal.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaTotal));
                }
            }
        }

    }
}
