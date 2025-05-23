    package br.com.praticandoSecurity.usuario.core.security;

    import br.com.praticandoSecurity.usuario.entities.Usuario;
    import br.com.praticandoSecurity.usuario.repository.UsuarioRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.security.core.GrantedAuthority;
    import org.springframework.security.core.authority.SimpleGrantedAuthority;
    import org.springframework.security.core.userdetails.User;
    import org.springframework.security.core.userdetails.UserDetails;
    import org.springframework.security.core.userdetails.UserDetailsService;
    import org.springframework.security.core.userdetails.UsernameNotFoundException;
    import org.springframework.stereotype.Service;
    import org.springframework.transaction.annotation.Transactional;

    import java.util.Collection;
    import java.util.stream.Collectors;

    @Service
    public class JpaUserDetailsService implements UserDetailsService {

        @Autowired
        private UsuarioRepository usuarioRepository;

        @Transactional(readOnly = true)
        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Usuario usuario = usuarioRepository.findByEmail(username)
                    .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado com e-mail informado"));


            return new User(usuario.getEmail(), usuario.getSenha(), getAuthorities(usuario));
        }

        private Collection<GrantedAuthority> getAuthorities(Usuario usuario) {
            return usuario.getGrupos().stream()
                    .flatMap(grupo -> grupo.getPermissoes().stream())
                    .map(permissao -> new SimpleGrantedAuthority(permissao.getNome().toUpperCase()))
                    .collect(Collectors.toSet());
        }
    }
