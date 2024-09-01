package models;

public class Circle {
    private double radius;
    private double circumference;
    private double area;

    //Empty constructor
    public Circle() {
    }

    public Circle(double radius, double circumference, double area) {
        this.radius = radius;
        this.circumference = circumference;
        this.area = area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
