package br.com.hinto.util.carga;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import br.com.hinto.entidade.Genero;
import br.com.hinto.enumeracao.TipoMidia;
import br.com.hinto.servico.impl.GeneroServiceImpl;
import br.com.hinto.servico.impl.MidiaServicoImpl;

@Configuration
public class CargaMidiaAnime {
	
	@Value("${url.base.busca.api}")
	private String URL_BASE_BUSCA;
	
	@Value("${url.base.anime.api}")
	private String URL_BASE_ANIME;
	
	private final Logger LOG = LoggerFactory.getLogger(CargaMidiaAnime.class);
	
	@Autowired
	private MidiaServicoImpl servico;
	@Autowired
	private GeneroServiceImpl generoServico;
	
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			//busca primeiramente os top animes
			AnimeJSON jsonMidia = restTemplate.getForObject(this.URL_BASE_BUSCA.concat("?order_by=score&limit=5"), AnimeJSON.class);
			LOG.info(jsonMidia.toString());
			//lista um por um os resultados retornados da API
			jsonMidia.getResults().forEach(midia -> {
				//busca os generos de cada top anime encontrado
				AnimeJSON jsonGenero = restTemplate.getForObject(this.URL_BASE_ANIME.concat(midia.getMal_id().toString()), AnimeJSON.class);
				
				midia.setTipo(TipoMidia.ANIME);
				//mapeia os generos DTO para Genero
				List<Genero> generos = jsonGenero.getGenres().stream()
						.map(genero -> this.generoServico.toGenero(genero))
						.collect(Collectors.toList());
				
				midia.setGeneros(generos);
				
				this.servico.salvar(midia);
			});
		};
	}
}
