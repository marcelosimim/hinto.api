package br.com.hinto.servico;

import java.util.List;

import br.com.hinto.entidade.Artista;
import br.com.hinto.entidade.dto.ArtistaDTO;

public interface ArtistaServico {
	
	public List<Artista> salvarTodos(List<ArtistaDTO> dtos);
	public Artista encontrarArtistaPorNome(String nome);
}
