package br.com.praticandoSecurity.usuario.service;

import br.com.praticandoSecurity.usuario.dto.UsuarioResponse;
import br.com.praticandoSecurity.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponse> listarUsuarios() {
        var usuarios = usuarioRepository.findAll();
        return UsuarioResponse.toResponse(usuarios);

    }
}
