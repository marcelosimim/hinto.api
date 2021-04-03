package br.com.hinto.servico.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hinto.entidade.Genero;
import br.com.hinto.entidade.dto.GeneroDTO;
import br.com.hinto.repositorio.GeneroDAO;
import br.com.hinto.servico.GeneroServico;

@Service
public class GeneroServicoImpl implements GeneroServico {
	
	@Autowired
	private GeneroDAO dao;

	public Genero toGenero(GeneroDTO generoDTO) {
		Genero genero = new Genero();
		
		genero.setId(null);
		genero.setDescricao(generoDTO.getName());
		return genero;
	}

	@Override
	public List<Genero> salvarTodos(List<GeneroDTO> dtos) {
		//mapeia todos os dtos para o tipo entidade genero
		List<Genero> generos = dtos.stream().map(dto ->
			this.toGenero(dto)).collect(Collectors.toList());
		
		List<Genero> generosCriados = new ArrayList<>();
		
		generos.forEach(genero -> {
			Genero generoBuscado = this.buscarGeneroPorDescricao(genero.getDescricao());
			if (generoBuscado == null) {
				generosCriados.add(genero);
			} else {
				generosCriados.add(generoBuscado);
			}
		});
		
		return this.dao.saveAll(generosCriados);
	}

	@Override
	public Genero buscarGeneroPorDescricao(String descricao) {
		return this.dao.findByDescricao(descricao);
	}
}
