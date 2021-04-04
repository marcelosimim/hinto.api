package br.com.hinto.entidade.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.hinto.entidade.Artista;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistaDTO implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private String profissao;
    
    public ArtistaDTO() {}
    
    public ArtistaDTO(Artista artista) {
    	this.nome = artista.getNome();
    	this.profissao = artista.getProfissao();
    }
    
    public ArtistaDTO(String nome, String profissao) {
    	this.nome = nome;
    	this.profissao = profissao;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
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
		ArtistaDTO other = (ArtistaDTO) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtistaDTO {"
				+ "nome=" + nome 
				+ ", profissao=" + profissao 
				+ "}";
	}

}
