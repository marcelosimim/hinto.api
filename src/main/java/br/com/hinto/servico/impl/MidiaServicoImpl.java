package br.com.hinto.servico.impl;

import br.com.hinto.entidade.dto.MidiaCriadoDTO;
import br.com.hinto.entidade.dto.MidiaRetornadoDTO;
import br.com.hinto.entidade.Midia;
import br.com.hinto.excecao.DadosIncorretosException;
import br.com.hinto.servico.MidiaServico;
import br.com.hinto.repositorio.MidiaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MidiaServicoImpl implements MidiaServico {
    @Autowired
    private MidiaDAO dao;


    private MidiaRetornadoDTO toDTO(Midia midia){
        return new MidiaRetornadoDTO(midia);
    }

    private Midia toMidia(MidiaCriadoDTO dto) {
        Midia midia = new Midia();

        midia.setId(null);
        //midia.setAfinidade(dto.getAfinidade());
        midia.setDataLancamento(dto.getStart_date());
        midia.setTipo(dto.getTipo());
        midia.setImagemURL(dto.getImage_url());
        midia.setSinopse(dto.getSynopsis());
        midia.setTitulo(dto.getTitle());
        midia.setArtistas(dto.getArtistas());
        midia.setGeneros(dto.getGeneros());

        return midia;
    }

    @Override
    public MidiaRetornadoDTO salvar(MidiaCriadoDTO dto) {
        Midia midia = this.toMidia(dto);
        this.dao.saveAndFlush(midia);

        return this.toDTO(midia);
    }

    @Override
    public void deletar(Long idMidia) {
        this.encontrarPorId(idMidia);

        this.dao.deleteById(idMidia);
    }

    @Override
    public MidiaRetornadoDTO atualizar(MidiaCriadoDTO midia, Long idMidia) {
        this.encontrarPorId(idMidia);

        Midia midiaEntidade = this.dao.findById(idMidia).get();
        midiaEntidade = this.atualizar(midia, midiaEntidade);

        this.dao.saveAndFlush(midiaEntidade);

        return this.toDTO(midiaEntidade);
    }

    @Override
    public List<MidiaRetornadoDTO> encontrarTodos() {
        List<MidiaRetornadoDTO> midias = this.dao.findAll().stream()
                .map(midia -> new MidiaRetornadoDTO(midia))
                .collect(Collectors.toList());

        return midias;
    }

    @Override
    public MidiaRetornadoDTO encontrarPorId(Long idMidia) {
        Midia midia = this.dao.findById(idMidia).get();

        if (midia == null) {
            throw new DadosIncorretosException("Mídia não encontrada!");
        }
        return this.toDTO(midia);
    }

    private Midia atualizar(MidiaCriadoDTO dto, Midia midia) {
        if (dto.getSynopsis() != null) {
            midia.setSinopse(dto.getSynopsis());
        }
        if (dto.getStart_date() != null) {
            midia.setDataLancamento(dto.getStart_date());
        }
        if (dto.getImage_url() != null) {
            midia.setImagemURL(dto.getImage_url());
        }
        return midia;
    }
}
