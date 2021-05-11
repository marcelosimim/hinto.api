package br.com.hinto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Midia;

/**
 * criada por 
 * Interface Repositório Usuario.
 */
@Repository
public interface MidiaDAO extends JpaRepository<Midia, Long> {

	List<Midia> findByTituloContainingIgnoreCaseOrSinopseContainingIgnoreCase(String stringBusca, String stringBusca2);
}
