package org.example;

import java.util.List;

public class Inscripcion {
    Integer numeroID;
    Alumno alumno;
    List<Materia> materias;
    public Boolean aprobada()
    {
        for (Materia materia: materias)
        {
            if (!alumno.TieneAprobada(materia))
            {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public Inscripcion(Integer numeroID, Alumno alumno, List<Materia> materias) {
        this.numeroID = numeroID;
        this.alumno = alumno;
        this.materias = materias;
    }
}
