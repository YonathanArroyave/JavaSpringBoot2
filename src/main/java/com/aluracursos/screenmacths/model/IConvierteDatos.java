package com.aluracursos.screenmacths.model;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}