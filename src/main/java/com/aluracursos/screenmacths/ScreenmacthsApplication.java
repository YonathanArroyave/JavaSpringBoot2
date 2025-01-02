package com.aluracursos.screenmacths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmacthsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthsApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola mundo desde Spring");
    }

}
