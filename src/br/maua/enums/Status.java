package br.maua.enums;

/**
 * Enumeracao dos possiveis Status, utilizado para gerar um Pedido
 * @Author João Pedro de Pauda Santoro Azevedo RA: 18.02277-4 e-mail: azevedomasterjp27@hotmail.com
 * @since 26/06
 * @version 1.0
 */
public enum Status {
    REALIZADO("Realizado"),
    PREPARACAO("Preparacao"),
    SAIU_PARA_ENTREGA("Saiu Para a Entrega"),
    ENTREGUE("Entregue"),
    DEVOLVIDO("Devolvido");
    private String text;

    Status(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Status fromString(String text) {
        for (Status status : Status.values()) {
            if (status.text.equalsIgnoreCase(text)) {
                return status;
            }
        }
        return null;
    }
}
