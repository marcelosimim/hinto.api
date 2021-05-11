package br.com.hinto.servico;

import java.util.List;

import br.com.hinto.entidade.Midia;
import br.com.hinto.entidade.dto.MidiaAnimeCriadoDTO;
import br.com.hinto.entidade.dto.MidiaFilmeCriadoDTO;
import br.com.hinto.entidade.dto.MidiaRetornadoDTO;

public interface MidiaServico {
    public MidiaRetornadoDTO salvar(MidiaAnimeCriadoDTO dto);
    public MidiaRetornadoDTO salvar(MidiaFilmeCriadoDTO dto);
    public void deletar(Long idMidia);
    public MidiaRetornadoDTO atualizar(MidiaAnimeCriadoDTO midia, Long idMidia);
    public List<MidiaRetornadoDTO> encontrarTodos();
    public MidiaRetornadoDTO encontrarPorId(Long idMidia);
    public Midia toMidia(MidiaRetornadoDTO dto);
    public Midia findById(Long midiaID);
    public List<MidiaRetornadoDTO> buscarPorString(String stringBusca);
}
