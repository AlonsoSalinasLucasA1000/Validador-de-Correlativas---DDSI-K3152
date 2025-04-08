package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {

    private Alumno matias;
    private Materia paradigmas, discreta, algoritmos, diseño, ingles1, ingles2;

    @BeforeEach
    public void inicializacion()
    {
        matias = new Alumno(45123949, "Matias");
        paradigmas = new Materia("Paradigmas de Programación");
        discreta = new Materia("Matemática Discreta");
        algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        diseño = new Materia("Diseño de Sistemas de Informacion");
        ingles1 = new Materia("Inglés Técnico I");
        ingles2 = new Materia("Inglés Técnico II");

        ingles2.agregarCorrelativas(ingles1);
        paradigmas.agregarCorrelativas(algoritmos);
        paradigmas.agregarCorrelativas(discreta);
        diseño.agregarCorrelativas(paradigmas);
        matias.agregarMateriasAprobadas(algoritmos,discreta);
    }


    @Test
    @DisplayName("Test - Inscripción Aprobada")
    public void correlativasCorrectas()
    {
        Inscripcion inscripcion1 = new Inscripcion(matias,12);
        inscripcion1.agregarMaterias(paradigmas);
        inscripcion1.agregarMaterias(ingles1);

        Assertions.assertTrue(inscripcion1.aprobada());
    }

    @Test
    @DisplayName("Test - Inscripción NO aprobada")
    public void correlativasIncorrectas()
    {
        Inscripcion inscripcion2 = new Inscripcion(matias,14);
        inscripcion2.agregarMaterias(paradigmas);
        inscripcion2.agregarMaterias(ingles2);

        Assertions.assertFalse(inscripcion2.aprobada());
    }


}