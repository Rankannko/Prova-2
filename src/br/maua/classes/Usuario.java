package br.maua.classes;

/**
 * Classe Usuario, necessario para acessar items diferentes no Menu.
 * Implementações de get Nome e Email foram deixadas no programa para futura refatoração com mais de um usuário
 */
public class Usuario {

    private String nome, email, senha;

    /**
     * Função para gerar um usuario.
     * @param nome Nome do Usuario.
     * @param email Email do Usuario.
     * @param senha Senha do Usuario.
     */
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /**
     * @return Getter do Nome do Usuario
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return Getter do Email do Funcionario
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return Retorna o fator senha utilizado na criação do usuario. Getter.
     */
    public String getSenha() {
        return senha;
    }

}
