package br.com.jssfernandes.async.example.services;

import br.com.jssfernandes.async.example.models.MovieModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;

@Service
public class MovieService {
    private static final Logger LOG = LoggerFactory.getLogger(MovieService.class);

    private final RestTemplate restTemplate;

    public MovieService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<MovieModel> lookForMovie(String movieId) throws InterruptedException {
        LOG.info("Pokemon: {}", movieId);
        String url = String.format("https://ghibliapi.herokuapp.com/films/%s", movieId);
        MovieModel results = restTemplate.getForObject(url, MovieModel.class);
        // Atraso artificial de 1s para fins de demonstração
        Thread.sleep(1000L);
        return CompletableFuture.completedFuture(results);
    }
}
