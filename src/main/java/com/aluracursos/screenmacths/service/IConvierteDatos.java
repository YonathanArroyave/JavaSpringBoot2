package com.aluracursos.screenmacths.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}