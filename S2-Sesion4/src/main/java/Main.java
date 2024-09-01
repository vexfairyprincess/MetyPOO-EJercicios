import models.Calculadora;
import models.Circle;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido");
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        Circle circle = new Circle(radio);
        Calculadora calc = new Calculadora();
        JOptionPane.showMessageDialog(null, "El área del círculo es "
                + calc.calcularArea(circle));

    }
}