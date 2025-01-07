package com.aluracursos.screenmacths.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStream {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda", "carlos", "martica");

        nombres.stream()
                .sorted()//acomoda alfabeticmente // se puedden buscar todos los ejmplos de como ordenar o buscar cosas dentro del arelo
                .forEach(System.out::println);
    }
}