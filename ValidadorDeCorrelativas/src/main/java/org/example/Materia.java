package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia
{
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombre)
    {
        this.nombreMateria = nombre;
        correlativas = new ArrayList<>();
    }

    public void agregarCorrelativas(Materia ... materias)
    {
        Collections.addAll(this.correlativas, materias);
    }

    // getter and setter
    public String getNombreMateria()
    {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria)
    {
        this.nombreMateria = nombreMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
