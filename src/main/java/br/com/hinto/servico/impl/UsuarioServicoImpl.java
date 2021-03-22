package br.com.hinto.servico.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hinto.entidade.Usuario;
import br.com.hinto.repositorio.UsuarioDAO;
import br.com.hinto.servico.UsuarioServico;

/**
 * criada por @llaet
 * Classe de implementação das regras de negócio Usuario.
 */
@Service
public class UsuarioServicoImpl implements UsuarioServico {
	
	@Autowired
	private UsuarioDAO dao;

	@Override
	public Usuario salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuario.setAtivo(Boolean.TRUE);
		usuario.setDataCriacao(LocalDateTime.now());
		usuario.setUltimoAcesso(LocalDateTime.now());
		return this.dao.save(usuario);
	}

	@Override
	public void deletar(Long idUsuario) {
		// TODO Auto-generated method stub
		this.dao.deleteById(idUsuario);
	}

	@Override
	public Usuario atualizar(Long idUsuario) {
		// TODO Auto-generated method stub
		return this.dao.updateById(idUsuario);
	}

	@Override
	public List<Usuario> encontrarTodos() {
		// TODO Auto-generated method stub
		return this.dao.findAll();
	}

	@Override
	public Optional<Usuario> encontrarPorId(Long idUsuario) {
		// TODO Auto-generated method stub
		Optional<Usuario> usuario = this.dao.findById(idUsuario);
		
		if (usuario == null) {
			throw new IllegalArgumentException("Usuário não encontrado!");
		}
		return usuario;
	}

}
