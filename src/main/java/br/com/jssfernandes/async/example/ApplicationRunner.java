//package br.com.jssfernandes.async.example;
//
//import br.com.jssfernandes.async.example.models.MovieModel;
//import br.com.jssfernandes.async.example.services.MovieService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.CompletableFuture;
//
//@Component
//public class ApplicationRunner implements CommandLineRunner {
//    private String varTestes;
//    private static final Logger LOG = LoggerFactory.getLogger(ApplicationRunner.class);
//
//    private final MovieService movieService;
//
//    public ApplicationRunner(MovieService movieService) {
//        this.movieService = movieService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Start the clock
//        long start = System.currentTimeMillis();
//
//        // Kick of multiple, asynchronous lookups
//        CompletableFuture<MovieModel> page1 = movieService.lookForMovie("58611129-2dbc-4a81-a72f-77ddfc1b1b49");
//        CompletableFuture<MovieModel> page2 = movieService.lookForMovie("2baf70d1-42bb-4437-b551-e5fed5a87abe");
//        CompletableFuture<MovieModel> page3 = movieService.lookForMovie("4e236f34-b981-41c3-8c65-f8c9000b94e7");
//
//        CompletableFuture<MovieModel> page4 = movieService.lookForMovie("12cfb892-aac0-4c5b-94af-521852e46d6a");
//        CompletableFuture<MovieModel> page5 = movieService.lookForMovie("ea660b10-85c4-4ae3-8a5f-41cea3648e3e");
//        CompletableFuture<MovieModel> page6 = movieService.lookForMovie("ebbb6b7c-945c-41ee-a792-de0e43191bd8");
//        CompletableFuture<MovieModel> page7 = movieService.lookForMovie("1b67aa9a-2e4a-45af-ac98-64d6ad15b16c");
//        CompletableFuture<MovieModel> page8 = movieService.lookForMovie("ff24da26-a969-4f0e-ba1e-a122ead6c6e3");
//        CompletableFuture<MovieModel> page9 = movieService.lookForMovie("0440483e-ca0e-4120-8c50-4c8cd9b965d6");
//        CompletableFuture<MovieModel> page10 = movieService.lookForMovie("45204234-adfd-45cb-a505-a8e7a676b114");
//        CompletableFuture<MovieModel> page11 = movieService.lookForMovie("dc2e6bd1-8156-4886-adff-b39e6043af0c");
//        CompletableFuture<MovieModel> page12 = movieService.lookForMovie("90b72513-afd4-4570-84de-a56c312fdf81");
//        CompletableFuture<MovieModel> page13 = movieService.lookForMovie("cd3d059c-09f4-4ff3-8d63-bc765a5184fa");
//        CompletableFuture<MovieModel> page14 = movieService.lookForMovie("112c1e67-726f-40b1-ac17-6974127bb9b9");
//        CompletableFuture<MovieModel> page15 = movieService.lookForMovie("758bf02e-3122-46e0-884e-67cf83df1786");
//        CompletableFuture<MovieModel> page16 = movieService.lookForMovie("2de9426b-914a-4a06-a3a0-5e6d9d3886f6");
//        CompletableFuture<MovieModel> page17 = movieService.lookForMovie("45db04e4-304a-4933-9823-33f389e8d74d");
//        CompletableFuture<MovieModel> page18 = movieService.lookForMovie("67405111-37a5-438f-81cc-4666af60c800");
//        CompletableFuture<MovieModel> page19 = movieService.lookForMovie("578ae244-7750-4d9f-867b-f3cd3d6fecf4");
//        CompletableFuture<MovieModel> page20 = movieService.lookForMovie("5fdfb320-2a02-49a7-94ff-5ca418cae602");
//        CompletableFuture<MovieModel> page21 = movieService.lookForMovie("d868e6ec-c44a-405b-8fa6-f7f0f8cfb500");
//        CompletableFuture<MovieModel> page22 = movieService.lookForMovie("790e0028-a31c-4626-a694-86b7a8cada40");
//
//        // Join all threads so that we can wait until all are done
////        CompletableFuture.allOf(page1, page2, page3).join();
//        CompletableFuture.allOf(page1, page2, page3, page4, page5, page6, page7, page8, page9, page10, page11, page12, page13).join();
////        CompletableFuture.allOf(page1, page2, page3, page4, page5, page6, page7, page8, page9, page10, page11, page12, page13, page14, page15, page16, page17, page18, page19, page20, page21, page22).join();
//
//        // Print results, including elapsed time
//        LOG.info("Tempo decorrido: " + (System.currentTimeMillis() - start));
//        LOG.info("--> " + page1.get());
//        LOG.info("--> " + page2.get());
//        LOG.info("--> " + page3.get());
//        LOG.info("--> " + page4.get());
//        LOG.info("--> " + page5.get());
//        LOG.info("--> " + page6.get());
//        LOG.info("--> " + page7.get());
//    }
//}
