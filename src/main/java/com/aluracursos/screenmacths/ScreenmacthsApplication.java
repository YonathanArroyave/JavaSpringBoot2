package com.aluracursos.screenmacths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.screenmacths.service.ConsumoAPI;

@SpringBootApplication
public class ScreenmacthsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthsApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obtenerDatos("http://www.omdbapi.com/?t=the+game+of+thrones&apikey=cbbae2fe");
        System.out.println(json);
    }

}
