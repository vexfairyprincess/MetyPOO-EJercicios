package models;

public class Admission {

    public Admission(){

    }

    /**
     * @param student
     */

    public void calcScholarship(Student student){
        if(student.getAverage() >= 80){
            student.setScholarship(true);
        } else {
            student.setScholarship(false);
        }
    }
}
