package com.johnmsaylor.tpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WebformApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebformApplication.class)
				.properties("port=8080")
				.build()
				.run(args);
	}

}
