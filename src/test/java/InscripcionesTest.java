import org.example.Alumno;
import org.example.Inscripcion;
import org.example.Materia;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InscripcionTest {

    @Test
    void inscripcionAprobadaSiTodasLasMateriasEstanAprobadas() {
        Alumno alumno = new Alumno("Lucía", "Gómez", 1001);
        Materia matematica = new Materia("Matemática");
        Materia fisica = new Materia("Física");

        alumno.aprobarMateria(matematica);
        alumno.aprobarMateria(fisica);

        Inscripcion inscripcion = new Inscripcion(1, alumno, List.of(matematica, fisica));

        assertTrue(inscripcion.aprobada());
    }

    @Test
    void inscripcionNoAprobadaSiFaltaUnaMateria() {
        Alumno alumno = new Alumno("Carlos", "Luna", 1002);
        Materia matematica = new Materia("Matemática");
        Materia quimica = new Materia("Química");

        alumno.aprobarMateria(matematica);

        Inscripcion inscripcion = new Inscripcion(2, alumno, List.of(matematica, quimica));

        assertFalse(inscripcion.aprobada());
    }

    @Test
    void tieneAprobadaDevuelveTrueSiMateriaFueAprobada() {
        Alumno alumno = new Alumno("Ana", "Rodríguez", 1003);
        Materia biologia = new Materia("Biología");

        alumno.aprobarMateria(biologia);

        assertTrue(alumno.TieneAprobada(biologia));
    }

    @Test
    void tieneAprobadaDevuelveFalseSiMateriaNoFueAprobada() {
        Alumno alumno = new Alumno("Diego", "Martínez", 1004);
        Materia historia = new Materia("Historia");

        assertFalse(alumno.TieneAprobada(historia));
    }
}