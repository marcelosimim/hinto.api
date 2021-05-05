package br.com.hinto.entidade.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.hinto.entidade.Produtor;
import br.com.hinto.entidade.Genero;
import br.com.hinto.enumeracao.TipoMidia;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MidiaFilmeCriadoDTO implements Serializable {
	
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String overview;
    private String poster_path;
    private Date release_date;
    private String title;
    private TipoMidia tipo = TipoMidia.FILME;
    
    private List<Produtor> produtores = new ArrayList<>();
    private List<Genero> generos = new ArrayList<>();

    public MidiaFilmeCriadoDTO(){ }

	public List<Produtor> getProdutores() {
		return produtores;
	}
	
	public void setProdutores(List<Produtor> produtores) {
		this.produtores = produtores;
	}

	public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public TipoMidia getTipo() {
		return tipo;
	}

	public void setTipo(TipoMidia tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poster_path == null) ? 0 : poster_path.hashCode());
		result = prime * result + ((overview == null) ? 0 : overview.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		MidiaFilmeCriadoDTO other = (MidiaFilmeCriadoDTO) obj;
		if (poster_path == null) {
			if (other.poster_path != null)
				return false;
		} else if (!poster_path.equals(other.poster_path))
			return false;
		if (overview == null) {
			if (other.overview != null)
				return false;
		} else if (!overview.equals(other.overview))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MidiaCriadoDTO {"
					+ "id=" + id + ", "
					+ "title=" + title + ", "
					+ "poster_path=" + poster_path + ", " 
					+ "overview=" + overview + ", "
					+ "release_date=" + release_date + ", "
					+ "produtores= [" + produtores + "], "
					+ "generos= [" + generos + "], "
					+ "}";
	}  
}
