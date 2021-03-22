package br.com.hinto.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hinto.entidade.Usuario;
import br.com.hinto.servico.impl.UsuarioServicoImpl;

/**
 * criada por @llaet
 * Classe controladora do endpoint de Usuario.
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServicoImpl servico;
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		return this.servico.salvar(usuario);
	}

	@DeleteMapping
	public void deletar(Long idUsuario) {
		this.servico.deletar(idUsuario);
	}

	@PutMapping
	public Usuario atualizar(Long idUsuario) {
		return this.servico.atualizar(idUsuario);
	}

	@GetMapping
	public List<Usuario> encontrarTodos() {
		return this.servico.encontrarTodos();
	}

	@GetMapping("/{idUsuario}")
	public Optional<Usuario> encontrarPorId(@PathVariable("idUsuario") Long idUsuario) {
		return this.servico.encontrarPorId(idUsuario);
	}

}
