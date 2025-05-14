package br.com.praticandoSecurity.usuario.dto;

public class UsuarioDto {

    private String nome;

    public UsuarioDto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
