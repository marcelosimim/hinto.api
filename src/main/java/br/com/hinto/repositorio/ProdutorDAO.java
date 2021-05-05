package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Produtor;

@Repository
public interface ProdutorDAO extends JpaRepository<Produtor, Long> {

	Produtor findByNome(String nome);
}
