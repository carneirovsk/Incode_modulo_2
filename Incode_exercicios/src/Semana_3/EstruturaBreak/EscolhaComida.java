package Semana_3.EstruturaBreak;

import java.util.Scanner;

/**
 * @author Pedro Carneiro
 */

public class EscolhaComida {
    public static void main(String[] args) {
        /*
        Criar um programa que simula um menu de opções de pratos
        (por exemplo, "Pizza", "Hamburguer", "Sushi"). O programa
        deve permitir que o usuário escolha um prato, mas se o número
         informado for inválido, deve mostrar uma mensagem de erro e
          continuar perguntando até que uma escolha válida seja feita.
         */
        Scanner entrada = new Scanner(System.in);
        boolean validador = false;
        System.out.println("""
                SELECIONE UMA OPÇÃO:
                1 - Pizza
                2 - Sushi
                3 - Churrasco
                4 - Sair
                """);
        int num = entrada.nextInt();
        while (!validador) {

            switch (num) {
                case 1:
                    System.out.println("Você escolheu pizza");
                    validador = true;
                    break;
                case 2:
                    System.out.println("Você escolheu Sushi");
                    validador = true;
                    break;
                case 3:
                    System.out.println("Você escolheu churrasco");
                    validador = true;
                    break;
                case 4:
                    validador = true;
                    break;
                default:
                    System.out.println("Opção inválida\n");
                    System.out.println("""
                            SELECIONE UMA OPÇÃO:
                            1 - Pizza
                            2 - Sushi
                            3 - Churrasco
                            4 - Sair
                            """);
                    num = entrada.nextInt();
            }
        }
    }
}
