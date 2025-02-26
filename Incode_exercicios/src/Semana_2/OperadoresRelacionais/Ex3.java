package Semana_2.OperadoresRelacionais;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Solicitar ao usuário dois números
        // e exibir o maior entre eles.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Insira o segundo numero: ");
        int num2 = entrada.nextInt();

        if (num1>num2){
            System.out.printf("\nO maior numero é: %d",num1);
        }else if (num2 > num1){
            System.out.printf("\nO maior numero é: %d",num2);
        }else {
            System.out.println("\nOs numeros são iguais");

        }

    }
}
