package Semana_2.OperadoresUnarios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
        Criar um contador de tentativas de login,
         iniciando com 5 tentativas, e decrementar
         a cada erro de login.
         */
        Scanner entrada = new Scanner(System.in);
        int i = 5;
        String usuario = "a";
        String usuarioTent = "";
        String senha = "b";
        String senhaTent ="";
        while (!usuarioTent.equals(usuario) || !senhaTent.equals(senha)) {
            if (i == 0) {
                System.out.println("Sem tentativas restantes!!!");
                break;
            }
            System.out.printf("\nTentativas restantes: %d\n", i);
            System.out.print("Insira o usuário: ");
            usuarioTent = entrada.next();
            System.out.print("Insira a senha: ");
            senhaTent = entrada.next();
            i--;
        }
        entrada.close();


    }
}
