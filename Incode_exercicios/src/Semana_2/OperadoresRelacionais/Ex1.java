package Semana_2.OperadoresRelacionais;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Verificar se dois números são iguais.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Insira o segundo numero: ");
        int num2 = entrada.nextInt();
        if (num2 == num1){
            System.out.println("Os dois numeros são iguais!");
        }else{
            System.out.println("Os dois numeros são diferentes!");
        }
entrada.close();
    }
}
