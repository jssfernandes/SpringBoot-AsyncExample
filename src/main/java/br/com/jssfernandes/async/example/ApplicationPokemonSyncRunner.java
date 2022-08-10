package br.com.jssfernandes.async.example;

import br.com.jssfernandes.async.example.models.Pokemon;
import br.com.jssfernandes.async.example.services.PokemonSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationPokemonSyncRunner implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationPokemonSyncRunner.class);

    private final PokemonSyncService pokemonService;

    public ApplicationPokemonSyncRunner(PokemonSyncService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Override
    public void run(String... args) throws Exception {
        // inicio do processamento
        long start = System.currentTimeMillis();

        // realizando requisições sincronas
        Pokemon pokemon1 = pokemonService.getByIdSync("23");
        Pokemon pokemon2 = pokemonService.getByIdSync("24");
        Pokemon pokemon3 = pokemonService.getByIdSync("25");
        Pokemon pokemon4 = pokemonService.getByIdSync("26");
        Pokemon pokemon5 = pokemonService.getByIdSync("27");
        Pokemon pokemon6 = pokemonService.getByIdSync("28");
        Pokemon pokemon7 = pokemonService.getByIdSync("29");
        Pokemon pokemon8 = pokemonService.getByIdSync("30");
        Pokemon pokemon9 = pokemonService.getByIdSync("31");
        Pokemon pokemon10 = pokemonService.getByIdSync("32");
        Pokemon pokemon11 = pokemonService.getByIdSync("33");
        Pokemon pokemon12 = pokemonService.getByIdSync("34");
        Pokemon pokemon13 = pokemonService.getByIdSync("35");
        Pokemon pokemon14 = pokemonService.getByIdSync("36");
        Pokemon pokemon15 = pokemonService.getByIdSync("37");
        Pokemon pokemon16 = pokemonService.getByIdSync("38");
        Pokemon pokemon17 = pokemonService.getByIdSync("39");
        Pokemon pokemon18 = pokemonService.getByIdSync("40");
        Pokemon pokemon19 = pokemonService.getByIdSync("41");
        Pokemon pokemon20 = pokemonService.getByIdSync("42");
        Pokemon pokemon21 = pokemonService.getByIdSync("43");
        Pokemon pokemon22 = pokemonService.getByIdSync("44");

        // imprimindo alguns resultados, incluindo o tempo decorrido
        LOG.info("-- " + pokemon1.toString());
        LOG.info("-- " + pokemon2.toString());
        LOG.info("-- " + pokemon3.toString());
        LOG.info("-- " + pokemon4.toString());
        LOG.info("-- " + pokemon5.toString());
        LOG.info("-- " + pokemon6.toString());
        LOG.info("-- " + pokemon7.toString());
        LOG.info("-- " + pokemon8.toString());
        LOG.info("-- " + pokemon9.toString());
        LOG.info("-- " + pokemon10.toString());
        LOG.info("-- " + pokemon11.toString());
        LOG.info("-- " + pokemon12.toString());
        LOG.info("-- " + pokemon13.toString());
        LOG.info("-- " + pokemon14.toString());
        LOG.info("-- " + pokemon15.toString());
        LOG.info("-- " + pokemon16.toString());
        LOG.info("-- " + pokemon17.toString());
        LOG.info("-- " + pokemon18.toString());
        LOG.info("-- " + pokemon19.toString());
        LOG.info("-- " + pokemon20.toString());
        LOG.info("-- " + pokemon21.toString());
        LOG.info("-- " + pokemon22.toString());
        LOG.info("Tempo decorrido sincrono: " + (System.currentTimeMillis() - start));
    }
}
