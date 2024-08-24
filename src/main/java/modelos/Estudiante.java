package modelos;

public class Estudiante {
    private String cif;
    private String nombres;
    private String apellidos;
    private String asignatura;
    private int corte1;
    private int corte2;
    private int corte3;

    //Constructor vacío
    public Estudiante() {
    }

    //Constructor con todos los parametros
    public Estudiante(String cif, String nombres, String apellidos, String asignatura, int corte1, int corte2, int corte3) {
        this.cif = cif;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCorte1() {
        return corte1;
    }

    public void setCorte1(int corte1) {
        this.corte1 = corte1;
    }

    public int getCorte2() {
        return corte2;
    }

    public void setCorte2(int corte2) {
        this.corte2 = corte2;
    }

    public int getCorte3() {
        return corte3;
    }

    public void setCorte3(int corte3) {
        this.corte3 = corte3;
    }

    public int obtNotaFinal(){
        return (int) (corte1 + corte2 + corte3)/3;
    }

    public String evalNotaFinal(){
        int notaFinal = obtNotaFinal();
        if (notaFinal >= 70 && notaFinal <= 100){
            return "Clase aprobada";
        } else if(notaFinal >= 0 && notaFinal < 70){
            return "Clase reprobada";
        } else {
            return "Nota invalida";
        }
    }

    public String evalConvocatoria(){
        int notaFinal = obtNotaFinal();
        if (notaFinal < 0 || notaFinal > 100){
            return "Nota invalida";
        } else if(notaFinal >= 60 && notaFinal <= 69){
            return "Derecho a convocatoria";
        } else{
            return "Sin derecho a convocatoria";
        }
    }
}