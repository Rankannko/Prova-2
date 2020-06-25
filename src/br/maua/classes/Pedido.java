package br.maua.classes;
import br.maua.enums.FormaDePagamento;
import br.maua.enums.Status;
import br.maua.interfaces.criarID;

import java.util.Random;

public class Pedido implements criarID {
    private String ID;
    private FormaDePagamento formadepagamento;
    private Status status;

    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i<3 ;i++){
            idGerado+=random.nextInt(10);
        }
        return idGerado;
    }
}
