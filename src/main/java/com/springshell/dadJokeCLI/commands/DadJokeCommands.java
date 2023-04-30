package com.springshell.dadJokeCLI.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@ShellComponent
public class DadJokeCommands {
	
	
	@ShellMethod(key="joke", value="I will fetch a random dad joke")
	public String getRandomDadJoke() {
		return "";
	}

}
