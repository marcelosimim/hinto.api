package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Usuario;

/**
 * criada por @llaet
 * Interface Repositório Usuario.
 */
@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
	
	@Query(value = "UPDATE * FROM USUARIO WHERE ID = :id", nativeQuery = true)
	Usuario updateById(@Param("id") Long id);
}
