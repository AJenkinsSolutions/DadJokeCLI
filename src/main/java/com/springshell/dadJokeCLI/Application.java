package com.springshell.dadJokeCLI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.springshell.dadJokeCLI.client.DadJokeClient;

@SpringBootApplication
public class Application {
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}
	//this will turn our empty interface client into a full implementation
	@Bean
	DadJokeClient dadJokeClient() {
		WebClient client = WebClient.builder()
				.baseUrl("https://icanhazdadjoke.com/")
				.defaultHeader("Accept", "application/json")

				.build();
		
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
		return factory.createClient(DadJokeClient.class);
	}

}
