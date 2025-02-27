package Semana_3.EstruturaBreak;

import java.util.Scanner;

/**
 * @author Pedro Carneiro
 */
public class MenuOpcoes {
    public static void main(String[] args) {
        /*
        Criar um menu com as opções:
        1. Exibir "Ação 1"
        2. Exibir "Ação 2"
        3. Exibir "Ação 3"
        4. Sair
        O programa deve continuar executando até que o usuário
        escolha a opção "Sair", utilizando o `switch` com `break`.
         */
        Scanner entrada = new Scanner(System.in);
        boolean validador = false;
        while (!validador){
            System.out.println("""
                SELECIONE UMA OPÇÃO:\n
                1 - Escrever 'Te amo'
                2 - Escrever 'Te odeio'
                3 - Escrever 'OK'
                4 - Sair
                """);
            int num = entrada.nextInt();
            switch (num){
                case 1:
                    System.out.println("Te amo");
                    continue;
                case 2:
                    System.out.println("Te odeio");
                    continue;
                case 3:
                    System.out.println("OK");
                    continue;
                case 4:
                    validador = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        entrada.close();




    }
}
