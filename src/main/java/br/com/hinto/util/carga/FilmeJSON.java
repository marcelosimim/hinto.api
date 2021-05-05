package br.com.hinto.util.carga;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import br.com.hinto.entidade.dto.ProdutorDTO;
import br.com.hinto.entidade.dto.GeneroDTO;
import br.com.hinto.entidade.dto.MidiaFilmeCriadoDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmeJSON implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private List<MidiaFilmeCriadoDTO> results = new ArrayList<>();
	private List<GeneroDTO> genres = new ArrayList<>();
	private List<ProdutorDTO> production_companies = new ArrayList<>();
	private String imdb_id;
	public FilmeJSON() {}

	public List<ProdutorDTO> getProduction_companies() {
		return production_companies;
	}

	public void setProduction_companies(List<ProdutorDTO> production_companies) {
		this.production_companies = production_companies;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}

	public List<MidiaFilmeCriadoDTO> getResults() {
		return results;
	}

	public void setResults(List<MidiaFilmeCriadoDTO> results) {
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
				+ ", imdb_id= " + imdb_id
				+ "production_companies= [" + production_companies
				+ "]"
				+ "}";
	}
}
