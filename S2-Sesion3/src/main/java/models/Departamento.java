package models;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;


    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public Departamento() {
        profesores = new ArrayList<Profesor>();
    }

    public Departamento(String nombre, List<Profesor> profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
