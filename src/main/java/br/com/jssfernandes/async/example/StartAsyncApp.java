package br.com.jssfernandes.async.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class StartAsyncApp {
    public static void main(String[] args) {
        SpringApplication.run(StartAsyncApp.class, args).close();
    }
}
