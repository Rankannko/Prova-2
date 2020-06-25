package br.maua.classes;
import br.maua.classes.Usuario;
import java.util.Scanner;

public class Menu {
    public static void Run(){
        String input;
        Scanner scanner = new Scanner(System.in);
        input="0";
        Usuario usuario = new Usuario("José","Joselegal@hotmail.com","123456");
        do{
        System.out.println("Pizzaria Rato que Ri:\n"+
                "1-Nova Venda\n" +
                "2-Verificar Pedidos\n" +
                "3-Alterar Pedidos\n"+
                "0-Sair");
        input=scanner.nextLine();
        }while (input.equals("1")||input.equals("2")||input.equals("3"));
    }
}
