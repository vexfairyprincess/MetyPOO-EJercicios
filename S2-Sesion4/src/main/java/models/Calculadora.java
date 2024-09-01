package models;

public class Calculadora {

    public double calcularArea(Circle circle){
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
