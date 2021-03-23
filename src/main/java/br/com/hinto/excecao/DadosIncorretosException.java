package br.com.hinto.excecao;

public class DadosIncorretosException extends RuntimeException {
		
	private static final long serialVersionUID = 1L;

	public DadosIncorretosException(String mensagem) {
		super(mensagem);
	}
		
	public DadosIncorretosException(String mensagem, Throwable throwable) {
		super(mensagem);
	}	
}
