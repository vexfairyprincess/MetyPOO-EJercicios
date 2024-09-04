package models;

public class Admission {

    public Admission(){

    }

    /**
     * @param student
     */
    // Metodo para verificar si el estudiante es candidato a beca
    public void calcScholarship(Student student){
        student.setScholarship(student.getAverage() >= 80);
    }
}
