package br.com.hinto.entidade.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import br.com.hinto.entidade.Midia;

public class ListaInteresseAleatoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private List<Midia> midias = new ArrayList<>();
	
	public ListaInteresseAleatoriaDTO(@NotNull List<Midia> midias) {
		this.midias = midias;
	}
	
	public List<Midia> getMidias() {
		return midias;
	}
	
	public void setMidias(List<Midia> midias) {
		this.midias = midias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((midias == null) ? 0 : midias.hashCode());
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
		ListaInteresseAleatoriaDTO other = (ListaInteresseAleatoriaDTO) obj;
		if (midias == null) {
			if (other.midias != null)
				return false;
		} else if (!midias.equals(other.midias))
			return false;
		return true;
	}
}
