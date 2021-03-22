package br.com.hinto.enumeracao;

public enum TipoMidia {

	FILME(0, "Filme"),
	ANIME(1, "Anime"),
	SERIE(2,"Série");
	
	private Integer codigoMidia;
	private String nomeTipo;
	
	TipoMidia(int codigoMidia, String nomeTipo){
		this.codigoMidia = codigoMidia;
		this.nomeTipo = nomeTipo;
	}

	public Integer getCodigoMidia() {
		return codigoMidia;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}
	
}
