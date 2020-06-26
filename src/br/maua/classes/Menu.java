package br.maua.classes;
import br.maua.classes.Usuario;

import br.maua.enums.FormaDePagamento;
import br.maua.enums.Status;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu{
    public static void Run(){
        String input;
        String senha;
        String detalhespedido;
        String ID;
        String IDmodificado;
        String formadepagamento;
        final String[] novostatus = new String[1];
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
                System.out.println("Digite o Pedido:");
                detalhespedido=scanner.nextLine();
                System.out.println("Digite a forma de pagamento, entre Dinheiro, Debito, Credito, Vale Alimentacao, Vale refeicao, em maiusculas com um _:");
                formadepagamento=scanner.nextLine();
                meusPedidos.add(new Pedido(detalhespedido,ID, FormaDePagamento.valueOf(formadepagamento), Status.REALIZADO));
            }
            }
        if (input.equals("2")){
            meusPedidos.forEach(pedido -> {
                System.out.println("O Pedido é:"
                        +pedido.getDetalhes()+
                        " o ID do pedido é: "
                        + pedido.getID()+
                        " sua forma de pagamento é "
                        + pedido.getFormadepagamento()+
                        " e seu status é "+
                        pedido.getStatus());
            });
        }
        if (input.equals("3")){
            System.out.println("Digite a senha do usuario:");
            senha=scanner.nextLine();
            if (senha.equals(usuario.getSenha())) {
                System.out.println("Digite o ID do pedido a ser alterado:");
                IDmodificado=scanner.nextLine();
                meusPedidos.forEach(pedido -> {
                    if (IDmodificado.equals(pedido.getID())) {
                        System.out.println("Pedido encontrado");
                    }
                });
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
