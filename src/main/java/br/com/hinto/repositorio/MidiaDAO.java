package br.com.hinto.repositorio;

import br.com.hinto.entidade.Midia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * criada por 
 * Interface Repositório Usuario.
 */
@Repository
public interface MidiaDAO extends JpaRepository<Midia, Long> {
}
