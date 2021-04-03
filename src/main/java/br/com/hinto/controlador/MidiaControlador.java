package br.com.hinto.controlador;

import br.com.hinto.entidade.dto.MidiaAnimeCriadoDTO;
import br.com.hinto.entidade.dto.MidiaRetornadoDTO;
import br.com.hinto.servico.MidiaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/midia")
public class MidiaControlador {
	
    @Autowired
    private MidiaServico servico;

    @PostMapping
    public MidiaRetornadoDTO salvar(@Valid @RequestBody MidiaAnimeCriadoDTO midiaCriadoDTO){
        return this.servico.salvar(midiaCriadoDTO);
    }

    @DeleteMapping("/{idMidia}")
    public void deletar(@PathVariable("idMidia") Long idMidia){
        this.servico.deletar(idMidia);
    }

    @PutMapping("/{idMidia}")
    public void atualizar(@Valid @RequestBody MidiaAnimeCriadoDTO midia, @PathVariable("idMidia") Long idMidia){
        this.servico.atualizar(midia, idMidia);
    }

    @GetMapping
    public List<MidiaRetornadoDTO> encontrarTodos() {
        return this.servico.encontrarTodos();
    }

    @GetMapping("/{idMidia}")
    public MidiaRetornadoDTO encontrarPorId(@PathVariable("idMidia") Long idMidia) {
        return this.servico.encontrarPorId(idMidia);
    }
}
