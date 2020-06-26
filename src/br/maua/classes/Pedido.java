package br.maua.classes;
import br.maua.enums.FormaDePagamento;
import br.maua.enums.Status;

import java.util.Random;

public class Pedido{
    public Pedido(String ID, FormaDePagamento formadepagamento, Status status) {
        this.ID = ID;
        this.formadepagamento = formadepagamento;
        this.status = status;
    }

    public String getID() {
        return ID;
    }

    public FormaDePagamento getFormadepagamento() {
        return formadepagamento;
    }

    public Status getStatus() {
        return status;
    }

    private String ID;
    private FormaDePagamento formadepagamento;
    private Status status;

}
