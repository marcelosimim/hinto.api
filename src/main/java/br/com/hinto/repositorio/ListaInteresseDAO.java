package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.hinto.entidade.ListaInteresse;

@Repository
public interface ListaInteresseDAO extends JpaRepository<ListaInteresse, Long>{
	
	@Transactional(readOnly = true)
	@Query(value = "SELECT * FROM LISTA_INTERESSE WHERE USUARIO_ID = :usuarioId", nativeQuery = true)
	ListaInteresse findByUsuarioId(@Param("usuarioId") Long usuarioId);
}
