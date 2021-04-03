package br.com.hinto.util.carga;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.hinto.entidade.dto.GeneroDTO;
import br.com.hinto.entidade.dto.MidiaAnimeCriadoDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnimeJSON implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private List<MidiaAnimeCriadoDTO> results = new ArrayList<>();
	private List<GeneroDTO> genres = new ArrayList<>();
	
	public AnimeJSON() {}

	public List<MidiaAnimeCriadoDTO> getResults() {
		return results;
	}

	public void setResults(List<MidiaAnimeCriadoDTO> results) {
		this.results = results;
	}

	public List<GeneroDTO> getGenres() {
		return genres;
	}

	public void setGenres(List<GeneroDTO> genres) {
		this.genres = genres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResultadoJSON {"
				+ "results= [" 
				+ results
				+ "],"
				+ "aired= [" + genres 
				+ "]"
				+ "}";
	}
}
