package com.challenge.WC.Sample;

import org.springframework.shell.command.annotation.Command;
import org.springframework.stereotype.Component;

@Component
@Command(group = "Sample Commands")
public class Sample {

	@Command(command = "hello")
	public String printHello() {
		return "Hello World";
	}
}
