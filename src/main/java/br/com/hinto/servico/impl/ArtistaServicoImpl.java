package br.com.hinto.servico.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hinto.entidade.Artista;
import br.com.hinto.entidade.dto.ArtistaDTO;
import br.com.hinto.repositorio.ArtistaDAO;
import br.com.hinto.servico.ArtistaServico;

@Service
public class ArtistaServicoImpl implements ArtistaServico {
	
	@Autowired
	private ArtistaDAO dao;

	@Override
	public List<Artista> salvarTodos(List<ArtistaDTO> dtos) {
		//mapeia dto's para objeto artista
		List<Artista> artistas = dtos.stream().map(dto -> this.toArtista(dto))
				.collect(Collectors.toList());
		
		List<Artista> artistasCriados = new ArrayList<>();
		
		artistas.forEach(artista -> {
			Artista artistaBuscado = this.encontrarArtistaPorNome(artista.getNome());
			if (artistaBuscado == null) {
				artistasCriados.add(artista);
			} else {
				artistasCriados.add(artistaBuscado);
			}
		});
		
		return this.dao.saveAll(artistasCriados);
	}
	
	private Artista toArtista(ArtistaDTO dto) {
		Artista artista = new Artista();
		
		artista.setId(null);
		artista.setNome(dto.getNome());
		artista.setProfissao(dto.getProfissao());
		
		return artista;
	}

	@Override
	public Artista encontrarArtistaPorNome(String nome) {
		return this.dao.findByNome(nome);
	}

}
