package org.example;

import java.util.ArrayList;
import java.util.List;
public class Materia {
    String nombre;
    List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }
}
