package br.com.jssfernandes.async.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import java.util.concurrent.Executor;

@Configuration
public class BeanConfig {
	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(42);
		executor.setMaxPoolSize(42);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("Async-");
		executor.initialize();
		return executor;
	}
}
