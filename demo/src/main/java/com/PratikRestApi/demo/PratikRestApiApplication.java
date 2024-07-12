package com.PratikRestApi.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PratikRestApiApplication implements CommandLineRunner {

	ProdDB prodDB;

	public static void main(String[] args) {
		SpringApplication.run(PratikRestApiApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

	}
}
