package notaUAM;

import modelos.Estudiante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\u001B[32m");
        System.out.println("UAM");

        //Crear objeto
        Estudiante est = new Estudiante();
        String cif, nombres, apellidos, asignatura;
        int corte1, corte2, corte3, nf;
        Scanner sc = new Scanner(System.in);

        System.out.println("Añade los datos");

        System.out.print("CIF: ");
        cif = sc.nextLine();

        System.out.print("NOMBRES: ");
        nombres = sc.nextLine();

        System.out.print("APELLIDOS: ");
        apellidos = sc.nextLine();

        System.out.print("ASIGNATURA: ");
        asignatura = sc.nextLine();

        System.out.print("CORTE 1: ");
        corte1 = Integer.parseInt(sc.nextLine());

        System.out.print("CORTE 2: ");
        corte2 = Integer.parseInt(sc.nextLine());

        System.out.print("CORTE 3: ");
        corte3 = Integer.parseInt(sc.nextLine());

        est.setCif(cif);
        est.setNombres(nombres);
        est.setApellidos(apellidos);
        est.setAsignatura(asignatura);
        est.setCorte1(corte1);
        est.setCorte2(corte2);
        est.setCorte3(corte3);

        nf = est.obtNotaFinal();
        System.out.println("\nNota Final: " + nf);
        System.out.println("Estado del curso: " + est.evalNotaFinal());
        System.out.println("Estado de convocatoria: " + est.evalConvocatoria());
    }
}