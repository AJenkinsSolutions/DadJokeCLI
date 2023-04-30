package com.springshell.dadJokeCLI.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {
	
	@ShellMethod(key= "hello" , value= "I will say hello")
	public String hello(@ShellOption(defaultValue = "World") String args) {
		return "Hello " + args;
	}
	
	
	@ShellMethod(key= "goodbye" , value= "I will say goodbye")
	public String goodbye() {
		return "Goodbbye";
	}
	
}
