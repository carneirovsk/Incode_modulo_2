package Semana_4.DesafioTeste;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int option = 0;
        ArrayList<String> listaTarefas = new ArrayList<>();
        ArrayList<String> listaTarefasPendentes = new ArrayList<>();
        ArrayList<String> listaTarefasConcluidas = new ArrayList<>();


        while (option != 6) {
            System.out.println("1-Adicionar tarefa\n2-Listar tarefas\n3-Listar tarefas pendentes \n4-Listar tarefas concluidas \n5-Concluir Tarefa\n6-Sair");
            option = entrada.nextInt();
            entrada.nextLine(); // Consumir quebra de linha pendente

            if (option == 1) {
                System.out.println("Insira sua nova tarefa: ");
                String tarefa = entrada.nextLine();
                listaTarefas.add(tarefa);
                listaTarefasPendentes.add(tarefa);
            }
            else if (option == 2) {
                if (listaTarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < listaTarefas.size(); i++) {
                        System.out.printf("%d - %s\n", i+1, listaTarefas.get(i));
                    }
                }
            }else if (option == 3) {
                if (listaTarefasPendentes.isEmpty()) {
                    System.out.println("Nenhuma tarefa pendente.");
                } else {
                    for (int i = 0; i < listaTarefasPendentes.size(); i++) {
                        System.out.printf("%d - %s\n", i+1, listaTarefasPendentes.get(i));
                    }
                }
            }else if (option == 4) {
                if (listaTarefasConcluidas.isEmpty()) {
                    System.out.println("Nenhuma tarefa concluida.");
                } else {
                    for (int i = 0; i < listaTarefasConcluidas.size(); i++) {
                        System.out.printf("%d - %s\n", i+1, listaTarefasConcluidas.get(i));
                    }
                }
            }
            else if (option == 5) {
                if (listaTarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa para concluir.");
                } else {
                    System.out.println("Digite o número da tarefa concluída: ");
                    int index = entrada.nextInt() - 1;
                    entrada.nextLine();
                    if (index >= 0 && index < listaTarefas.size()) {
                        listaTarefasPendentes.remove(index);
                        listaTarefasConcluidas.add(listaTarefas.get(index));
                        System.out.println("Tarefa concluída e removida!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                }
            }
        }

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
