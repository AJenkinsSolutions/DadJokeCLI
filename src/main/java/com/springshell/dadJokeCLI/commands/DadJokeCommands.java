package com.springshell.dadJokeCLI.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import com.springshell.dadJokeCLI.client.DadJokeClient;
import com.springshell.dadJokeCLI.model.DadJokeResponse;


@ShellComponent
public class DadJokeCommands {
	
	
	@Autowired
	DadJokeClient djClient;
	
	@ShellMethod(key="joke", value="I will fetch a random dad joke")
	public String getRandomDadJoke() {
		
		DadJokeResponse random = djClient.random();
		
		
		return random.joke();
	}

}
