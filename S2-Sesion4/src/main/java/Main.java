import models.Calculadora;
import models.Circle;
import models.Cuenta;
import models.Serie;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while(!salir) {
            System.out.println("Menú de opciones");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Crear una cuenta");
            System.out.println("3. Crear un serie");
            System.out.println("4. Salir");
            System.out.print("---> ");
            int opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                //Calcular el area de un ciruclo
                        JOptionPane.showMessageDialog(null, "Bienvenido");
                        double radio, area;
                        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
                        Circle circle = new Circle(radio);
                        Calculadora calc = new Calculadora();
                        JOptionPane.showMessageDialog(null, "El área del círculo es "
                                + calc.calcularArea(circle));
                    break;
                case 2:
                //Crear una cuenta
                    String titular;
                    System.out.print("Ingrese el titular de la cuenta: ");
                    titular = sc.nextLine();
                    System.out.print("Ingrese la cantidad inicial: ");
                    double cantidad = sc.nextDouble();
                    Cuenta cuenta = new Cuenta(titular, cantidad);
                    System.out.println("Cuenta creada: " + cuenta);
                    break;
                case 3:
                //Crear Serie
                    System.out.print("Ingrese el nombre de la serie: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese la número de temporadas: ");
                    int numeroDeTemporadas = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el género de la serie: ");
                    String genero = sc.nextLine();
                    System.out.print("Ingrese el nombre del creador de la serie: ");
                    String creador = sc.nextLine();

                    Serie serie = new Serie(titulo, numeroDeTemporadas, genero, creador);
                    System.out.println("Serie creada: " + serie);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese una opción razonable");
            }
        }
    }
}