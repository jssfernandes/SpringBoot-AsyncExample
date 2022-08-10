package br.com.jssfernandes.async.example.services;

import br.com.jssfernandes.async.example.models.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;

@Service
public class PokemonService {
    private static final Logger LOG = LoggerFactory.getLogger(PokemonService.class);

    private final RestTemplate restTemplate;

    public PokemonService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<Pokemon> getById(String id) throws InterruptedException {
        LOG.info("Pokemon: {}", id);
        String url = String.format("https://pokeapi.co/api/v2/pokemon/%s", id);
        Pokemon results = restTemplate.getForObject(url, Pokemon.class);
        // Atraso artificial de 1s para fins de demonstração
//        Thread.sleep(1000L);
        return CompletableFuture.completedFuture(results);
    }
}
