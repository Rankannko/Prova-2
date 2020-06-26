package br.maua.enums;

/**
 * Enum com as formas de Pagamento, utilizada na construção da classe Pedido
 */
public enum FormaDePagamento {
    DINHEIRO("Dinheiro"),
    DEBITO("Debito"),
    CREDITO("Credito"),
    VALE_ALIMENTACAO("Vale Alimentacao"),
    VALE_REFEICAO("Vale Refeicao");

    private String text;

    FormaDePagamento(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static FormaDePagamento fromString(String text) {
        for (FormaDePagamento forma : FormaDePagamento.values()) {
            if (forma.text.equalsIgnoreCase(text)) {
                return forma;
            }
        }
        return null;
    }
}