package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Genero;

@Repository
public interface GeneroDAO extends JpaRepository<Genero, Long>{
	
	Genero findByDescricao(String descricao);
}
