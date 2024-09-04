package models;

public class Student {
    private boolean isScholarship;
    private float average;
    private String cif;
    private String career;
    private String firstName;
    private String lastName;

    //Constructor vacio
    public Student(){

    }

    //Constructor con todos los atributos
    public Student(boolean isScholarship, float average, String cif, String career, String firstName, String lastName) {
        this.isScholarship = isScholarship;
        this.average = average;
        this.cif = cif;
        this.career = career;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getters y Setters
    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public boolean isScholarship() {
        return isScholarship;
    }

    public void setScholarship(boolean scholarship) {
        isScholarship = scholarship;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}