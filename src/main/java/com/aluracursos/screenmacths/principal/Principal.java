package com.aluracursos.screenmacths.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aluracursos.screenmacths.model.DatosSerie;
import com.aluracursos.screenmacths.model.DatosTemporadas;
import com.aluracursos.screenmacths.service.ConsumoAPI;
import com.aluracursos.screenmacths.service.ConvierteDatos;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private final String URL_BASE = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=cbbae2fe";

    public void muestraElMenu() {
        System.out.println("Por favor escribe la serie serie a buscar: ");
        var nombreSerie = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);
        //
        List<DatosTemporadas> temporadas = new ArrayList<>();
        for (int i = 1; i <= datos.totalDeTemporadas(); i++) {
            json = consumoAPI.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + "&Season="+i+API_KEY);
            var datosTemporadasDatosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadasDatosTemporadas);
            
        }
            temporadas.forEach(System.out::println);
    }
}
