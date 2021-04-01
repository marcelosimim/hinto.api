package br.com.hinto.servico;



import br.com.hinto.entidade.dto.MidiaCriadoDTO;
import br.com.hinto.entidade.dto.MidiaRetornadoDTO;

import java.util.List;

public interface MidiaServico {
    public MidiaRetornadoDTO salvar(MidiaCriadoDTO dto);
    public void deletar(Long idMidia);
    public MidiaRetornadoDTO atualizar(MidiaCriadoDTO midia, Long idMidia);
    public List<MidiaRetornadoDTO> encontrarTodos();
    public MidiaRetornadoDTO encontrarPorId(Long idMidia);
}
