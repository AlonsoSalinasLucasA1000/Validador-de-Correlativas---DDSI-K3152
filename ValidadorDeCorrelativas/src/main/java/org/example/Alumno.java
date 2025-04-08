package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno
{
    private String nombre;
    private Integer DNI;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMateriasAprobadas(Materia ... materias)
    {
        Collections.addAll(this.materiasAprobadas,materias);
    }

    // getters and setters
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public Integer getDNI()
    {
        return DNI;
    }
    public void setDNI(Integer DNI)
    {
        this.DNI = DNI;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
