package com.aluracursos.screenmacths.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    public String obtenerDatos(String url) {
        // Crear cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        
        // Crear solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        
        try {
            // Enviar solicitud y obtener respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            // Retornar el cuerpo de la respuesta
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException("Error al realizar la solicitud HTTP: " + e.getMessage(), e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restablecer el estado de interrupción del hilo
            throw new RuntimeException("La solicitud fue interrumpida: " + e.getMessage(), e);
        }
    }
}
