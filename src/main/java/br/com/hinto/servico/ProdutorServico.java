package br.com.hinto.servico;

import java.util.List;

import br.com.hinto.entidade.Produtor;
import br.com.hinto.entidade.dto.ProdutorDTO;

public interface ProdutorServico {
	
	public List<Produtor> salvarTodos(List<ProdutorDTO> dtos);
	public Produtor encontrarProdutorPorNome(String nome);
	public Produtor salvar(ProdutorDTO dto);
	public void deletarPorId(Long id);
	public Produtor atualizarPorId(Long id, ProdutorDTO dto);
	public List<Produtor> encontrarTodos();
}
