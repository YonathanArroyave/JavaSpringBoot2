package com.aluracursos.screenmacths.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)//por defecto viene el false hace referencia a que si no mapeo no me ida el resto de valores de la api

public record DatosTemporadas(@JsonAlias ("Season") Integer numero, 
                             @JsonAlias ("Episodes") List<DatosEpisodio> episodios){ 

}