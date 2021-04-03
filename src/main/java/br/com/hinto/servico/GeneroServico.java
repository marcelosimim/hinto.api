package br.com.hinto.servico;

import java.util.List;

import br.com.hinto.entidade.Genero;
import br.com.hinto.entidade.dto.GeneroDTO;

public interface GeneroServico {

	public List<Genero> salvarTodos(List<GeneroDTO> dtos);
	public Genero buscarGeneroPorDescricao(String descricao);
}
