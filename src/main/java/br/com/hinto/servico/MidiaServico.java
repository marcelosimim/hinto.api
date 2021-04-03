package br.com.hinto.servico;



import br.com.hinto.entidade.dto.MidiaAnimeCriadoDTO;
import br.com.hinto.entidade.dto.MidiaRetornadoDTO;

import java.util.List;

public interface MidiaServico {
    public MidiaRetornadoDTO salvar(MidiaAnimeCriadoDTO dto);
    public void deletar(Long idMidia);
    public MidiaRetornadoDTO atualizar(MidiaAnimeCriadoDTO midia, Long idMidia);
    public List<MidiaRetornadoDTO> encontrarTodos();
    public MidiaRetornadoDTO encontrarPorId(Long idMidia);
}
