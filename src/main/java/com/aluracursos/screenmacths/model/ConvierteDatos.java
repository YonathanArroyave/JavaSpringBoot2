package com.aluracursos.screenmacths.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper(); //pasa del json a instancias java

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) { // aca se indica de pasa de json -> classe generica
        try {
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}