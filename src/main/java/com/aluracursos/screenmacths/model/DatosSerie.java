package com.aluracursos.screenmacths.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)//por defecto viene el false hace referencia a que si no mapeo no me ida el resto de valores de la api

public record DatosSerie(@JsonAlias ("Title") String titulo, //el recod es inmutable, no ncesita constructor ni getni set 
                        @JsonAlias ("totalSeasons") Integer totalDeTemporadas, //recibe el dato de la api y lo mapea lo que se necesita
                        @JsonAlias("imdbRating") String evaluacion){

}