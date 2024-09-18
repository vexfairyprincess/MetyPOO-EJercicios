package dao;

import interfaces.Sesion9;
import models.Student;

import java.util.ArrayList;

public class StudentDao implements Sesion9{
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        Student student = (Student) object;
        try{
            students.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByName(String name) {
        try{
            for(Student student : students){
                if (student.getName().equals(name)){
                    System.out.println(student);
                }
            }
            System.out.println("No se encontro el estudiante " + name);
        } catch (Exception e) {
            System.out.println("Error al buscar el estudiante " + e.getMessage());

        }
    }
    public void showStudents() {
        for(Student student : students){
            System.out.println(student);
        }
    }
}