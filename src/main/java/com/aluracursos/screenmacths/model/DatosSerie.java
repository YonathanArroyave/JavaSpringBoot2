package com.aluracursos.screenmacths.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)//por defecto viene el false hace referencia a que si no mapeo no me ida el resto de valores de la api

public record DatosSerie(@JsonAlias ("Title") String titulo, //el recod es inmutable, no ncesita constructor ni getni set 
                        @JsonAlias("totalSeasons")Integer totalTemporadas,
                        @JsonAlias("imdbRating") String evaluacion,
                        @JsonAlias("Poster")String poster,
                        @JsonAlias("Genre") String genero,
                        @JsonAlias("Actors")String actores,
                        @JsonAlias("Plot")String sinopsis) {
} 