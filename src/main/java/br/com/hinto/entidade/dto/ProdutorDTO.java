package br.com.hinto.entidade.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.hinto.entidade.Produtor;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProdutorDTO implements Serializable {
	
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    
    public ProdutorDTO() {}
    
    public ProdutorDTO(Produtor producer) {
    	this.name = producer.getNome();
    	this.id = producer.getId();
    }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ProdutorDTO other = (ProdutorDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtistaDTO {"
				+ "nome=" + name
				+ "}";
	}

}
