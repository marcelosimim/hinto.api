package br.com.hinto.entidade.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.hinto.entidade.Artista;
import br.com.hinto.entidade.Genero;
import br.com.hinto.entidade.Midia;
import br.com.hinto.enumeracao.TipoMidia;

public class MidiaCriadoDTO implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 75, message = "O tamanho máximo do nome deve ser 75 caracteres")
    private String titulo;

    @Null
    @Size(max = 255, message = "O tamanho máximo do nome deve ser 255 caracteres.")
    private String imagemURL;

    @NotNull
    private String sinopse;

    @NotNull
    private TipoMidia tipo;

    //Nao tenho ideia do que seja essa afinidade, então to incluindo... qualquer coisa tira dps
    //Confesso que também não! Att: dev cansado.
    @NotNull
    private Boolean afinidade;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataLancamento;
    
    private List<Genero> generos = new ArrayList<>();
    private List<Artista> artistas = new ArrayList<>();

    public MidiaCriadoDTO(){ }

    public MidiaCriadoDTO(@NotNull @Size(max = 75, message = "O tamanho máximo do nome deve ser 75 caracteres") String titulo,
                          @NotNull @Size(max = 2255, message = "O tamanho máximo do email deve ser 255 caracteres") String imagemURL,
                          @NotNull String sinopse,
                          @NotNull TipoMidia tipo,
                          @NotNull Date dataLancamento, Boolean afinidade,
                          List<Genero> generos, List<Artista> artistas){
        this.titulo = titulo;
        this.imagemURL = imagemURL;
        this.sinopse = sinopse;
        this.tipo = tipo;
        this.afinidade = afinidade;
        this.dataLancamento = dataLancamento;
        this.generos = generos;
        this.artistas = artistas;
    }

    public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setImagemURL(String imagemURL) {
		this.imagemURL = imagemURL;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public void setTipo(TipoMidia tipo) {
		this.tipo = tipo;
	}

	public void setAfinidade(Boolean afinidade) {
		this.afinidade = afinidade;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTitulo() {
        return titulo;
    }

    public String getImagemURL() {
        return imagemURL;
    }

    public String getSinopse() {
        return sinopse;
    }

    public TipoMidia getTipo() {
        return tipo;
    }

    public Boolean getAfinidade() {
        return afinidade;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return Objects.equals(titulo, midia.getTitulo()) &&
                Objects.equals(imagemURL, midia.getImagemURL()) &&
                Objects.equals(sinopse, midia.getSinopse()) &&
                Objects.equals(afinidade, midia.getAfinidade()) &&
                Objects.equals(tipo, midia.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, imagemURL, sinopse, afinidade, tipo);
    }


}
