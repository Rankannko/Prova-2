package br.maua.classes;
import br.maua.classes.Usuario;
import java.util.Scanner;
import java.util.ArrayList;
import br.maua.interfaces.criarID;

public class Menu{
    public static void Run(){
        String input,senha,pedido,ID,formadepagamento;
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
        if (input.equals("1")){
            System.out.println("Digite a senha do usuario:");
            senha=scanner.nextLine();
            if (senha.equals(usuario.getSenha())){
                System.out.println("Senha reconhecida");
                ID= new criarID();
            }
        }
        }while (input.equals("1")||input.equals("2")||input.equals("3"));
    }



}
