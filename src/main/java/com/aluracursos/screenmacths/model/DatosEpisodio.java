package com.aluracursos.screenmacths.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)//por defecto viene el false hace referencia a que si no mapeo no me ida el resto de valores de la api

public record DatosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode") Integer numeroEpisodio,
                            @JsonAlias("imdbRating")String evaluacion,
                            @JsonAlias("Released")String fechaDeLanzamiento) {

}