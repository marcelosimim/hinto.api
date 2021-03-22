package br.com.hinto.servico;

import java.util.List;
import java.util.Optional;

import br.com.hinto.entidade.Usuario;

/**
 * criada por @llaet
 * Interface de regras de negócio Usuario.
 */
public interface UsuarioServico {
	
	public Usuario salvar(Usuario usuario);
	public void deletar(Long idUsuario);
	public Usuario atualizar(Long idUsuario);
	public List<Usuario> encontrarTodos();
	public Optional<Usuario> encontrarPorId(Long idUsuario);
}
