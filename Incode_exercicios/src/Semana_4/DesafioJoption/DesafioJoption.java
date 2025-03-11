package Semana_4.DesafioJoption;

import javax.swing.*;
import java.util.ArrayList;

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

            switch (escolha) {
                case "Adicionar tarefa" -> {
                    String novaTarefa = JOptionPane.showInputDialog("Digite sua nova tarefa");
                    if (novaTarefa == null){
                        break;
                    }
                    listaTotal.add(novaTarefa);
                    listaPendente.add(novaTarefa);
                }
                case "Listar tarefas" -> {
                    if (listaTotal.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaTotal));
                    }
                }
                case "Listar tarefas pendentes" -> {
                    if (listaPendente.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa pendente disponível.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaPendente));
                    }
                }
                case "Listar tarefas concluidas" -> {
                    if (listaConcluida.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa concluida disponível.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaConcluida));
                    }
                }
                case "Concluir Tarefa" -> {
                    if (listaPendente.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa para ser concluida disponível.");
                    } else {
                        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o indice da tarefa\n" + String.join("\n", listaConcluida))) - 1;
                        listaConcluida.add(listaPendente.get(i));
                        listaPendente.remove(i);
                        JOptionPane.showMessageDialog(null, "Tarefa Concluída!");
                    }
                }
                case "Sair" -> {
                    JOptionPane.showMessageDialog(null, "Você encerrou o programa!");
                    option = 6;
                }
            }
        }

    }
}
