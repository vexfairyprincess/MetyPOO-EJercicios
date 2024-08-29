package models;

import java.util.ArrayList;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(String titulo){
        libros.add(new Libro(titulo));
    }

    private class Libro{
        private String titulo;

        public Libro(String titulo){
            this.titulo = titulo;
        }
    }
    //Constructor vacio
    public Biblioteca() {
    }

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void mostrarLibros() {
        System.out.println("Libros disponibles: ");
        for (Libro libro : libros) {
            System.out.println("-" + libro.getTitulo());
        }
        System.out.println("*".repeat(13));
    }
}