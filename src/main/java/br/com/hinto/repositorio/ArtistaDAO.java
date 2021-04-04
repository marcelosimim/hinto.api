package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Artista;

@Repository
public interface ArtistaDAO extends JpaRepository<Artista, Long> {

	Artista findByNome(String nome);
}
