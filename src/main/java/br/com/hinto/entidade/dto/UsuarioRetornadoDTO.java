package br.com.hinto.entidade.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.hinto.entidade.Usuario;
import br.com.hinto.enumeracao.Sexo;

/**
 * criada por @llaet
 * Classe de transferencia do objeto Usuario quando retornado.
 */
public class UsuarioRetornadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String nome;
    private String email;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;
    private Sexo sexo;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime ultimoAcesso;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataCriacao;
	private Boolean ativo;
    
    public UsuarioRetornadoDTO(Usuario usuario) {
    	this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.dataNascimento = usuario.getDataNascimento();
		this.sexo = usuario.getSexo();
		this.ultimoAcesso = usuario.getUltimoAcesso();
		this.dataCriacao = usuario.getDataCriacao();
		this.ativo = usuario.getAtivo();
	}
    
    public UsuarioRetornadoDTO(){ }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
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
                Objects.equals(dataNascimento, usuario.getDataNascimento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, dataNascimento);
    }
}
