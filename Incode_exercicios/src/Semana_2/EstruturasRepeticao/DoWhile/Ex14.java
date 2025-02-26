package Semana_2.EstruturasRepeticao.DoWhile;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário uma senha e continuar pedindo
        até que a senha correta seja informada.
         */
        Scanner entrada = new Scanner(System.in);
        String senha = "1234";
        String senhaTent = "a";

        do {
            System.out.print("Insira uma senha: ");
            senhaTent = entrada.next();
        }while (!senhaTent.equals(senha));
        entrada.close();

    }
}
