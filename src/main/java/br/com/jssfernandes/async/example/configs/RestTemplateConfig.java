package br.com.jssfernandes.async.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        final RestTemplate restTemplate = new RestTemplate();
//        final HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        restTemplate.setRequestFactory(httpRequestFactory);
        return restTemplate;
    }
}
