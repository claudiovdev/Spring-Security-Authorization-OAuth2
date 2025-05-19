package br.com.praticandoSecurity.usuario.service;

import br.com.praticandoSecurity.usuario.dto.UsuarioDto;
import br.com.praticandoSecurity.usuario.dto.UsuarioResponse;
import br.com.praticandoSecurity.usuario.entities.Usuario;
import br.com.praticandoSecurity.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    public void criarUsuario(UsuarioDto usuarioDto) {
        usuarioRepository.save(new Usuario(usuarioDto.getNome(),usuarioDto.getEmail(),passwordEncoder().encode(usuarioDto.getSenha())));
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
