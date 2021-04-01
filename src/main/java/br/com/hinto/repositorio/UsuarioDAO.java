package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Usuario;

/**
 * criada por @llaet
 * Interface Repositório Usuario.
 */
@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByEmail(String email);
}
