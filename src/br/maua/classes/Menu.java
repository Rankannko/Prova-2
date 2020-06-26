package br.maua.classes;
import br.maua.classes.Usuario;

import br.maua.enums.FormaDePagamento;
import br.maua.enums.Status;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *Classe Menu, com varias funcionalidades. Chama o menu da aplicação e, a partir das opções, adiciona um novo pedido, exibe os pedidos e os modifica
 * Para tal, implementa tanto formatos de Array list quanto classes de Pedido e Usuario, alem de enums Forma de Pagamento e Status
 * @Autor João Pedro de Pauda Santoro Azevedo RA: 18.02277-4
 * e-mai: azevedomasterjp27@hotmail.com
 */
public class Menu{
    /**
     * Função principal da classe, que desempenha o papel de implementar o menu e deixa-lo ser interagido pelo usuario
     */
    public static void Run(){
        String input;
        String senha;
        String detalhespedido;
        String ID;
        String novoStatus;
        String formadepagamento;
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
            scanner.nextLine();
            if (senha.equals(usuario.getSenha())) {
                System.out.println("Digite o ID do pedido a ser alterado:");
                String idmodificado = scanner.nextLine();
                System.out.println("Id regitrado para a busca:" +idmodificado);
                meusPedidos.forEach(pedido -> {
                    if (idmodificado){
                        System.out.println("Digite o Novo status entre Realizado, Preparado, Saiu Pra Entrega, Entregue, Devolvido:");
                        novoStatus=scanner.nextLine();
                        pedido.setStatus(Status.valueOf(novoStatus));
                    }
                });
            }
        }
        }while (input.equals("1")||input.equals("2")||input.equals("3"));
    }

    /**
     * @return Função de criar um ID, utilizado em conjunção a classe produto para os identificar de uma maneira unica, devolvendo uma string ID
     */
    private static String criarID(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i<3 ;i++){
            idGerado+=random.nextInt(10);
        }
        return idGerado;
    }
}
