import dao.StudentDao;
import models.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDao students = new StudentDao();
        Scanner sc = new Scanner(System.in);

        String menu = "1. Agregar estudiante\n" +
                "2. Buscar estudiante estudiante\n" +
                "3. Mostrar estudiantes\n" +
                "4. Salir\n" +
                "Seleccione una opcion: ";

        int option = 0;

        while (option != 4) {
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String name = sc.next();
                    System.out.println("Ingrese la edad del estudiante: ");
                    int age = sc.nextInt();
                    System.out.println("Ingrese el email del estudiante: ");
                    String email = sc.next();
                    Student student = new Student(name, age, email);
                    students.store(student);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nameToFind = sc.next();
                    students.findByName(nameToFind);
                    break;
                case 3:
                    students.showStudents();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;

            }

        }
    }
}