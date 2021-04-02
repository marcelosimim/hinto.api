package br.com.hinto.servico.impl;

import org.springframework.stereotype.Service;

import br.com.hinto.entidade.Genero;
import br.com.hinto.entidade.dto.GeneroDTO;

@Service
public class GeneroServiceImpl {

	public Genero toGenero(GeneroDTO generoDTO) {
		Genero genero = new Genero();
		
		genero.setId(null);
		genero.setDescricao(generoDTO.getName());
		return genero;
	}
}
