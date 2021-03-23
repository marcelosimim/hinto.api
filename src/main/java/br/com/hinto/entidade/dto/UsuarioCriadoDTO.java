package br.com.hinto.entidade.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.hinto.entidade.Usuario;
import br.com.hinto.enumeracao.Sexo;

/**
 * criada por @llaet
 * Classe de transferencia do objeto Usuario quando criado.
 */
public class UsuarioCriadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@NotNull
		@Size(max = 75, message = "O tamanho máximo do nome deve ser 75 caracteres")
	    private String nome;
	    @NotNull
		@Size(max = 125, message = "O tamanho máximo do email deve ser 125 caracteres")
	    private String email;
	    @NotNull
		@Size(max = 75, message = "O tamanho máximo da senha deve ser 64 caracteres")
	    private String senha;
	    @NotNull
	    @JsonFormat(pattern = "dd/MM/yyyy")
	    private Date dataNascimento;
	    private Sexo sexo;

	    public UsuarioCriadoDTO(){ }

	    public UsuarioCriadoDTO(
				@NotNull @Size(max = 75, message = "O tamanho máximo do nome deve ser 75 caracteres") String nome,
				@NotNull @Size(max = 125, message = "O tamanho máximo do email deve ser 125 caracteres") String email,
				@NotNull @Size(max = 75, message = "O tamanho máximo da senha deve ser 64 caracteres") String senha,
				@NotNull Date dataNascimento, Sexo sexo) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.dataNascimento = dataNascimento;
			this.sexo = sexo;
		}

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public Date getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(Date dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public Sexo getSexo() {
	        return sexo;
	    }

	    public void setSexo(Sexo sexo) {
	        this.sexo = sexo;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Usuario usuario = (Usuario) o;
	        return Objects.equals(nome, usuario.getNome()) &&
	                Objects.equals(email, usuario.getEmail()) &&
	                Objects.equals(dataNascimento, usuario.getDataNascimento()) &&
	                Objects.equals(senha, usuario.getSenha());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(nome, email, dataNascimento, senha);
	    }
}
