package br.com.hinto.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hinto.entidade.dto.DadosLoginDTO;
import br.com.hinto.entidade.dto.UsuarioCriadoDTO;
import br.com.hinto.entidade.dto.UsuarioRetornadoDTO;
import br.com.hinto.servico.UsuarioServico;

/**
 * criada por @llaet
 * Classe controladora do endpoint de Usuario.
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServico servico;
	
	@PostMapping
	public UsuarioRetornadoDTO salvar(@Valid @RequestBody UsuarioCriadoDTO usuario) {
		return this.servico.salvar(usuario);
	}
	
	@PostMapping("/autenticar")
	public UsuarioRetornadoDTO autenticarUsuario(@Valid @RequestBody DadosLoginDTO dadosLogin) {
		return this.servico.autenticarUsuario(dadosLogin.getEmail(), dadosLogin.getSenha());
	}

	@DeleteMapping("/{idUsuario}")
	public void deletar(@PathVariable("idUsuario") Long idUsuario) {
		this.servico.deletar(idUsuario);
	}

	@PutMapping("/{idUsuario}")
	public UsuarioRetornadoDTO atualizar(@Valid @RequestBody UsuarioCriadoDTO usuario, @PathVariable("idUsuario") Long idUsuario) {
		return this.servico.atualizar(usuario, idUsuario);
	}

	@GetMapping
	public List<UsuarioRetornadoDTO> encontrarTodos() {
		return this.servico.encontrarTodos();
	}

	@GetMapping("/{idUsuario}")
	public UsuarioRetornadoDTO encontrarPorId(@PathVariable("idUsuario") Long idUsuario) {
		return this.servico.encontrarPorId(idUsuario);
	}
}
