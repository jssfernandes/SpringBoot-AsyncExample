package br.com.jssfernandes.async.example;

import br.com.jssfernandes.async.example.models.Pokemon;
import br.com.jssfernandes.async.example.services.PokemonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.concurrent.CompletableFuture;

@Component
public class ApplicationPokemonRunner implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationPokemonRunner.class);

    private final PokemonService pokemonService;

    public ApplicationPokemonRunner(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Override
    public void run(String... args) throws Exception {
        // inicio do processamento
        long start = System.currentTimeMillis();

        // adicionando multiplas requisições asynchronous
        CompletableFuture<Pokemon> pokemon1 = pokemonService.getById("1");
        CompletableFuture<Pokemon> pokemon2 = pokemonService.getById("2");
        CompletableFuture<Pokemon> pokemon3 = pokemonService.getById("3");
        CompletableFuture<Pokemon> pokemon4 = pokemonService.getById("4");
        CompletableFuture<Pokemon> pokemon5 = pokemonService.getById("5");
        CompletableFuture<Pokemon> pokemon6 = pokemonService.getById("6");
        CompletableFuture<Pokemon> pokemon7 = pokemonService.getById("7");
        CompletableFuture<Pokemon> pokemon8 = pokemonService.getById("8");
        CompletableFuture<Pokemon> pokemon9 = pokemonService.getById("9");
        CompletableFuture<Pokemon> pokemon10 = pokemonService.getById("10");
        CompletableFuture<Pokemon> pokemon11 = pokemonService.getById("11");
        CompletableFuture<Pokemon> pokemon12 = pokemonService.getById("12");
        CompletableFuture<Pokemon> pokemon13 = pokemonService.getById("13");
        CompletableFuture<Pokemon> pokemon14 = pokemonService.getById("14");
        CompletableFuture<Pokemon> pokemon15 = pokemonService.getById("15");
        CompletableFuture<Pokemon> pokemon16 = pokemonService.getById("16");
        CompletableFuture<Pokemon> pokemon17 = pokemonService.getById("17");
        CompletableFuture<Pokemon> pokemon18 = pokemonService.getById("18");
        CompletableFuture<Pokemon> pokemon19 = pokemonService.getById("19");
        CompletableFuture<Pokemon> pokemon20 = pokemonService.getById("20");
        CompletableFuture<Pokemon> pokemon21 = pokemonService.getById("21");
        CompletableFuture<Pokemon> pokemon22 = pokemonService.getById("22");

        // Juntando todos os tópicos para que possamos esperar até que todos estejam prontos
        CompletableFuture.allOf(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6, pokemon7, pokemon8, pokemon9, pokemon10, pokemon11, pokemon12, pokemon13, pokemon14, pokemon15, pokemon16, pokemon17, pokemon18, pokemon19, pokemon20, pokemon21, pokemon22).join();

        // imprimindo alguns resultados, incluindo o tempo decorrido
        LOG.info("--> " + pokemon1.get());
        LOG.info("--> " + pokemon2.get());
        LOG.info("--> " + pokemon3.get());
        LOG.info("--> " + pokemon4.get());
        LOG.info("--> " + pokemon5.get());
        LOG.info("--> " + pokemon6.get());
        LOG.info("--> " + pokemon7.get());
        LOG.info("--> " + pokemon8.get());
        LOG.info("--> " + pokemon9.get());
        LOG.info("--> " + pokemon10.get());
        LOG.info("--> " + pokemon11.get());
        LOG.info("--> " + pokemon12.get());
        LOG.info("--> " + pokemon13.get());
        LOG.info("--> " + pokemon14.get());
        LOG.info("--> " + pokemon15.get());
        LOG.info("--> " + pokemon16.get());
        LOG.info("--> " + pokemon17.get());
        LOG.info("--> " + pokemon18.get());
        LOG.info("--> " + pokemon19.get());
        LOG.info("--> " + pokemon20.get());
        LOG.info("--> " + pokemon21.get());
        LOG.info("--> " + pokemon22.get());

        LOG.info("Tempo decorrido assincrono: " + (System.currentTimeMillis() - start));
    }
}
