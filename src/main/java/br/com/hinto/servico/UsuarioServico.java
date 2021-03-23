package br.com.hinto.servico;

import java.util.List;

import br.com.hinto.entidade.dto.UsuarioCriadoDTO;
import br.com.hinto.entidade.dto.UsuarioRetornadoDTO;

/**
 * criada por @llaet
 * Interface de regras de negócio Usuario.
 */
public interface UsuarioServico {
	
	public UsuarioRetornadoDTO salvar(UsuarioCriadoDTO dto);
	public void deletar(Long idUsuario);
	public UsuarioRetornadoDTO atualizar(UsuarioCriadoDTO usuario, Long idUsuario);
	public List<UsuarioRetornadoDTO> encontrarTodos();
	public UsuarioRetornadoDTO encontrarPorId(Long idUsuario);
}
