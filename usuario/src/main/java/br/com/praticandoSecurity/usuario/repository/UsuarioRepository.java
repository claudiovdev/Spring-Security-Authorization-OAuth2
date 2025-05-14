package br.com.praticandoSecurity.usuario.repository;

import br.com.praticandoSecurity.usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
