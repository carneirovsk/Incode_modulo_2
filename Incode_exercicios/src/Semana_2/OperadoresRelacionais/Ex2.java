package Semana_2.OperadoresRelacionais;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*
        Receber dois números e verificar
         se o primeiro é maior ou igual ao segundo.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Insira o segundo numero: ");
        int num2 = entrada.nextInt();

        if (num1 >= num2){
        System.out.print("O primeiro numero é maior ou igual o segundo numero! ");
        }else {
        System.out.print("O primeiro numero não é maior ou igual o segundo numero! ");
        }
        entrada.close();
    }
}
