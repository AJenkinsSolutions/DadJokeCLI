package com.springshell.dadJokeCLI.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.springshell.dadJokeCLI.model.DadJokeResponse;

public interface DadJokeClient {
	
	//GET https://icanhazdadjoke.com/
	
	@HttpExchange(method = "GET")
	DadJokeResponse random();

	
	
}
