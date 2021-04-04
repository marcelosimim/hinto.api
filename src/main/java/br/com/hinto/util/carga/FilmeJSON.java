package br.com.hinto.util.carga;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.hinto.entidade.dto.GeneroDTO;
import br.com.hinto.entidade.dto.MidiaFilmeCriadoDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmeJSON implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	private List<MidiaFilmeCriadoDTO> results = new ArrayList<>();
	private List<GeneroDTO> genres = new ArrayList<>();
	private String imdb_id;
	private String Actors;
	private String Director;
	
	public FilmeJSON() {}

	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		this.Actors = actors;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		this.Director = director;
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
				+ ", Actors= " + Actors
				+ ", Director= " + Director
				+ "}";
	}
}
