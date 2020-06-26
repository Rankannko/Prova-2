package br.maua.enums;

/**
 * Enumeracao dos possiveis Status, utilizado para gerar um Pedido
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
