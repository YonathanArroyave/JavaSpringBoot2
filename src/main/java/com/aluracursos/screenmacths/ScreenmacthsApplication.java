package com.aluracursos.screenmacths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.screenmacths.model.DatosEpisodio;
import com.aluracursos.screenmacths.model.DatosSerie;
import com.aluracursos.screenmacths.service.ConsumoAPI;
import com.aluracursos.screenmacths.service.ConvierteDatos;

@SpringBootApplication
public class ScreenmacthsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmacthsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obtenerDatos("http://www.omdbapi.com/?t=breaking+bad&apikey=cbbae2fe");
        System.out.println(json);
        ConvierteDatos conversor = new ConvierteDatos();
        var datos = conversor.obtenerDatos(json, DatosSerie.class);

        System.out.println(datos);

        json = consumoAPI.obtenerDatos("https://www.omdbapi.com/?t=breaking+bad&season=1&episode=1&apikey=cbbae2fe");
        DatosEpisodio episodios = conversor.obtenerDatos(json, DatosEpisodio.class);
        System.out.println(episodios);
    }

}
