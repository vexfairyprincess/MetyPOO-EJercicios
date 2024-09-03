package models;

public class Cuenta {
    private String titular;
    private double cantidad;

    //Constructor vacio
    public Cuenta() {}

    //Constructor solo titular
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;}
    //Constructor con ambos campos
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;}
    //Getters y Setters
    public String getTitular() {
        return titular;}

    public void setTitular(String titular) {
        this.titular = titular;}

    public double getCantidad() {
        return cantidad;}

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;}

    //Metodo para ingresar dinero en la cuenta
    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    //Metodo para retirar dinero de la cuenta
    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}