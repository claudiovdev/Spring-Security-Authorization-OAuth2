package br.com.praticandoSecurity.usuario.dto;

import br.com.praticandoSecurity.usuario.entities.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioResponse {
    private Long id;
    private String nome;

    public UsuarioResponse(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static List<UsuarioResponse> toResponse(List<Usuario> usuarios){
        return usuarios.stream().map(UsuarioResponse::toResponse).toList();
    }

    public static UsuarioResponse toResponse(Usuario usuario){
        return new UsuarioResponse(usuario.getId(), usuario.getNome());
    }
}
