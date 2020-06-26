package br.maua.classes;
import br.maua.classes.Usuario;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu{
    public static void Run(){
        String input,senha,tipopedido,ID,formadepagamento;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pedido> meusPedidos =new ArrayList<>();
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
                ID = criarID();
                meusPedidos.add(new Pedido(ID,))
            }
        }
        }while (input.equals("1")||input.equals("2")||input.equals("3"));
    }

    private static String criarID(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i<3 ;i++){
            idGerado+=random.nextInt(10);
        }
        return idGerado;
    }

}
