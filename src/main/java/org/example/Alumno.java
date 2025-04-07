package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    String nombre;
    String apellido;
    Integer legajo;
    List<Materia> materiasAprobadas;


    public void aprobarMateria(Materia materia)
    {
        materiasAprobadas.add(materia);
        return;
    }

    public Boolean TieneAprobada(Materia materia)
    {
        if(materiasAprobadas.contains(materia))
        {return Boolean.TRUE;}
        else {return Boolean.FALSE;}
    }

    public Alumno(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }
}
