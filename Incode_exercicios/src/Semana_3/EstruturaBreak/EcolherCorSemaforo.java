package Semana_3.EstruturaBreak;

import java.util.Scanner;

/**
 * @author Pedro Carneiro
 */
public class EcolherCorSemaforo {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário o número correspondente ao sinal
        de um semáforo (1 = vermelho, 2 = amarelo, 3 = verde) e,
        com o uso de `switch`, exibir a cor do semáforo. Caso o número
        seja diferente de 1, 2 ou 3, exibir "Opção inválida".
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                SELECIONE UM NUMERO CORRESPONDENTE:\n
                1 - VERMELHO
                2 - AMARELO
                3 - VERDE
                """);
        int num = entrada.nextInt();
        switch (num){
            case 1:
                System.out.println("Sinal fechado!! Aguarde parado!!");
                break;
            case 2:
                System.out.println("ATENÇÃO!!");
                break;
            case 3:
                System.out.println("Siga seu caminho!!");
                break;
            default:
                System.out.println("Opção inválida");

        }

    }
}
