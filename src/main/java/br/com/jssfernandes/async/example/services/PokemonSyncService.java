package br.com.jssfernandes.async.example.services;

import br.com.jssfernandes.async.example.models.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonSyncService {
    private static final Logger LOG = LoggerFactory.getLogger(PokemonSyncService.class);

    @Value("${url.requisicao}")
    private String urlRequest;
    private final RestTemplate restTemplate;

    public PokemonSyncService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Pokemon getByIdSync(String id) {
        LOG.info("Pokemon: {}", id);
        String url = String.format(urlRequest, id);
//        Pokemon results = restTemplate.exchange(url, HttpMethod.GET, null, Pokemon.class).getBody();
        Pokemon results = restTemplate.getForObject(url, Pokemon.class);
        return results;
    }
}
