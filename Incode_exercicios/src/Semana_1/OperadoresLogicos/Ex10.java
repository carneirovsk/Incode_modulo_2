package Semana_1.OperadoresLogicos;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*
        Declarar uma variável boolean dentroDoIntervalo
         e atribuir (num >= 10 && num <= 50), exibindo o valor.
         */
        Scanner entrada = new Scanner(System.in);
        boolean dentroDoIntervalo;
        System.out.print("Insira o numero a ser avaliado: ");
        int num = entrada.nextInt();
        if (num >= 10 && num <= 50){
            System.out.println("O número está dentro do intervalo.");
            dentroDoIntervalo = true;
        }else {
            dentroDoIntervalo = false;
            System.out.println("O número está fora do intervalo.");

        }
        entrada.close();
    }
}
