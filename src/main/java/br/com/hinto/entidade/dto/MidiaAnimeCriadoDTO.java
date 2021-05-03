package br.com.hinto.entidade.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.hinto.entidade.Artista;
import br.com.hinto.entidade.Genero;
import br.com.hinto.enumeracao.TipoMidia;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MidiaAnimeCriadoDTO implements Serializable {
	
    private static final long serialVersionUID = 1L;

    private Integer mal_id;
    private String image_url;
    private String title;
    private String synopsis;
    private Date start_date;
    private TipoMidia tipo = TipoMidia.ANIME;
    
    //private List<Artista> artistas = new ArrayList<>();
    private List<Genero> generos = new ArrayList<>();

    public MidiaAnimeCriadoDTO(){ }
    /**
	public List<Artista> getArtistas() {
		return artistas;
	}
	
	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}
	**/
	public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}

	public Integer getMal_id() {
		return mal_id;
	}

	public void setMal_id(Integer mal_id) {
		this.mal_id = mal_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
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
		result = prime * result + ((image_url == null) ? 0 : image_url.hashCode());
		result = prime * result + ((synopsis == null) ? 0 : synopsis.hashCode());
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
		MidiaAnimeCriadoDTO other = (MidiaAnimeCriadoDTO) obj;
		if (image_url == null) {
			if (other.image_url != null)
				return false;
		} else if (!image_url.equals(other.image_url))
			return false;
		if (synopsis == null) {
			if (other.synopsis != null)
				return false;
		} else if (!synopsis.equals(other.synopsis))
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
					+ "mal_id=" + mal_id + ", "
					+ "title=" + title + ", "
					+ "image_url=" + image_url + ", " 
					+ "synopsis=" + synopsis + ", "
					+ "start_date=" + start_date + ", "
					+ "generos= [" + generos + ", "
					+ "}";
	}  
}
