package notaUAM;

import modelos.Estudiante;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\u001B[32m");
        System.out.println("UAM");

        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int opc = 0;

        while (opc != 6) {
            System.out.println("Selecciona una opción");
            System.out.println();
            System.out.println("1. Ejercicio 1 - Clases Estudiante");
            System.out.println("2. Ejercicio 2 - Números pares e impares");
            System.out.println("3. Ejercicio 3 - Grados Celcius a Farenheit");
            System.out.println("4. Ejercicio 4 - Mayor de Tres números");
            System.out.println("5. Ejercicio 5 - Áres de un círculos");
            System.out.println("6. Cerrar el programa");
            System.out.println();
            System.out.print("->");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    main.ejercicio1();
                    break;
                case 2:
                    main.ejercicio2();
                    break;
                case 3:
                    main.ejercicio3();
                    break;
                case 4:
                    main.ejercicio4();
                    break;
                case 5:
                    main.ejercicio5();
                    break;
                case 6:
                    System.out.println("Cerrando el programa");
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }


    public void ejercicio1 () {

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

        public void ejercicio2 () {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            System.out.print("Ingrese el número que desea evaluar: ");
            System.out.println();

            if (num % 2 == 0) {
                System.out.println("El número " + num + "es par.");
            } else {
                System.out.println("El número " + num + "es impares.");
            }
        }

        public void ejercicio3 () {
            Scanner sc = new Scanner(System.in);

            float gradosCelcius;
            System.out.print("Ingrese la temperatura en grados Celcius: ");
            gradosCelcius = sc.nextFloat();

            float gradosFahrenheit = (gradosCelcius * 9 / 5) + 32;
            System.out.println(gradosCelcius + "° Celsius = " + gradosFahrenheit + "° Fahrenheit");
        }

        public void ejercicio4 () {
            Scanner sc = new Scanner(System.in);
            float num1, num2, num3;

            System.out.print("Ingrese el Primer Numero: ");
            num1 = sc.nextFloat();
            System.out.print("Ingrese el Segundo Numero: ");
            num2 = sc.nextFloat();
            System.out.print("Ingrese el Tercer Numero: ");
            num3 = sc.nextFloat();

            float[] numeros = {num1, num2, num3};

            Arrays.sort(numeros);

            float menor = numeros[0];
            float medio = numeros[1];
            float mayor = numeros[2];

            System.out.println("Mayor: " + mayor + " | " + "Medio: " + medio + " | " + "Menor: " + menor);
        }

        public void ejercicio5 () {
            Scanner sc = new Scanner(System.in);

            double pi = Math.PI, radio, area;

            System.out.print("Ingrese el Radio de su Circulo: ");
            radio = sc.nextFloat();

            area = pi * (radio * radio);

            //System.out.println("El Area del Circulo es: " + area );
            System.out.printf("El Area del Circulo es: %.2f %n", area);
        }
}
