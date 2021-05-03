package br.com.hinto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hinto.entidade.Artista;


public interface ArtistaDAO {

	Artista findByNome(String nome);
}
