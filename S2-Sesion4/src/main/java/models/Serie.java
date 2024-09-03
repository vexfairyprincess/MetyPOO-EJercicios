package models;

public class Serie {
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //Constructor por defecto
    public Serie() {
        this.titulo = "";
        this.numeroDeTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    // Constructor con título y creador, el resto por defecto
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    // Constructor con todos los atributos excepto entregado
    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    //Getters y Setter de todos los atributos menos de entregado


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDETemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}