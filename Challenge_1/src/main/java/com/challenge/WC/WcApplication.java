package com.challenge.WC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@EnableCommand
public class WcApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WcApplication.class);
		app.setAdditionalProfiles("shell");
		app.setWebApplicationType(WebApplicationType.NONE); // <--- KEY LINE
		app.run(args);
	}

}
