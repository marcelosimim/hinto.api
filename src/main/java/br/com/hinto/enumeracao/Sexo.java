package br.com.hinto.enumeracao;

public enum Sexo {

    FEMININO(0),
    MASCULINO(1),
    NAO_INFORMADO(2);

    private Integer codigoSexo;

    Sexo(Integer codigoSexo){
        this.codigoSexo = codigoSexo;
    }
    
    public Integer getCodigoSexo() {
    	return this.codigoSexo;
    }
}
