import dao.StudentDao;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao students = new StudentDao();

        String menu;

        Student student1 = new Student("Juan", 20, "juan@gmail.com");
        Student student2 = new Student("Maria", 20, "maria@gmail.com");
        Student student3 = new Student("Maura", 20, "maura@gmail.com");
        StudentDao student = new StudentDao();
        if (student.store(student1)) {
            System.out.println("Estudiante almacenado correctamente");
        } else {
            System.out.println("Ocurrio un problema al almacenar al estudiante");
        }

        student.showStudents();
    }

}