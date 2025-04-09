package org.example;

import java.util.*;

public class Inscripcion
{
    private Integer numeroInscripcion;
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, int numeroInscripcion)
    {
        this.numeroInscripcion = numeroInscripcion;
        this.alumno = alumno;
        materias = new ArrayList<>();
    }

    public void agregarMaterias(Materia ... materias)
    {
        Collections.addAll(this.materias, materias);
    }

    public boolean aprobada()
    {
        return this.materias.stream().allMatch( materia -> new HashSet<>(this.alumno.getMateriasAprobadas()).containsAll(materia.getCorrelativas()));
    } // El hashSet lo coloque por recomendación del IDE, la solución original es: return this.materias.stream().allMatch( materia -> this.alumno.getMateriasAprobadas()).containsAll(materia.getCorrelativas()));
}


/*


obtengo una materia
busco sus correlativas
me fijo si todas las correlativas fueron aprobadas por el alumno
 */