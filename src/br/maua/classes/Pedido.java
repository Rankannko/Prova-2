package br.maua.classes;
import br.maua.enums.FormaDePagamento;
import br.maua.enums.Status;


/**
 * Classe Pedido, one cada um dos pedidos da pizzaria são armazenados
 * Utilizada na função menu.
 */
public class Pedido{
    /**
     * @param detalhes String Detalhes, onde os detalhes do pedido são armazenados
     * @param ID ID do pedido, gerada na classe Menu, indentifica individualmente dois pedidos
     * @param formadepagamento Enum Forma de Pagamento, demonstra qual forma de pagamento foi utilizada
     * @param status Enum Status, demonstra o status atual do pedido
     */
    public Pedido(String detalhes,String ID, FormaDePagamento formadepagamento, Status status) {
        this.detalhes=detalhes;
        this.ID = ID;
        this.formadepagamento = formadepagamento;
        this.status = status;
    }

    /**
     * @return Getter a string Detalhes
     */
    public String getDetalhes(){
        return detalhes;
    }

    /**
     * @return Getter da String ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @return Getter do Enum FormaDePagamento
     */
    public FormaDePagamento getFormadepagamento() {
        return formadepagamento;
    }

    /**
     * @return Getter do Enum Status
     */
    public Status getStatus() {
        return status;
    }

    private String ID,detalhes;
    private FormaDePagamento formadepagamento;
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

}
