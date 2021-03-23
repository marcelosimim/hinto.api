package br.com.hinto.entidade;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.hinto.enumeracao.Perfil;
import br.com.hinto.enumeracao.Sexo;

/**
 * criada por @llaet
 * Classe Entidade Usuario.
 */
@Entity(name = "Usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Perfil perfil;
    @Column(name = "NOME_USUARIO", nullable = false, length = 75)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(length = 64, nullable = false)  
    private String senha;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    @Column(name = "ULTIMO_ACESSO", nullable = false)
    private LocalDateTime ultimoAcesso;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    @Column(name = "DATA_CRIACAO", nullable = false, updatable = false)
    private LocalDateTime dataCriacao;
    @Column(nullable = false)
    private Boolean ativo;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private Date dataNascimento;
    @Column(nullable = true)
    private Sexo sexo;

    public Usuario(){ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
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
        return Objects.equals(id, usuario.id) &&
                Objects.equals(nome, usuario.nome) &&
                Objects.equals(email, usuario.email) &&
                Objects.equals(ultimoAcesso, usuario.ultimoAcesso) &&
                Objects.equals(dataCriacao, usuario.dataCriacao) &&
                Objects.equals(ativo, usuario.ativo) &&
                Objects.equals(dataNascimento, usuario.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, ultimoAcesso, dataCriacao, ativo, dataNascimento);
    }
}
