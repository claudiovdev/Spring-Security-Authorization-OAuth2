package br.com.praticandoSecurity.usuario.controller;

import br.com.praticandoSecurity.usuario.dto.UsuarioDto;
import br.com.praticandoSecurity.usuario.dto.UsuarioResponse;
import br.com.praticandoSecurity.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<UsuarioResponse>> listarUsuarios(){
        var retorno = usuarioService.listarUsuarios();
        return ResponseEntity.ok(retorno);
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public void criarUsuario(@RequestBody UsuarioDto usuarioDto){
        usuarioService.criarUsuario(usuarioDto);

    }


}
