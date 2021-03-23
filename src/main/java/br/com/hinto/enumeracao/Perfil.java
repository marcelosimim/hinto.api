package br.com.hinto.enumeracao;

public enum Perfil {

    ADMIN(0),
    USUARIO(1);

    private Integer codigoPerfil;

    Perfil(Integer codigoPerfil){
        this.codigoPerfil = codigoPerfil;
    }
    
    public Integer getCodigoPerfil() {
    	return this.codigoPerfil;
    }
}
