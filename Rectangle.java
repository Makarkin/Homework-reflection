package Classes;

import Annotation.ProbeAnnotation;

public class Rectangle extends Square {

    private double a;
    private double b;

    public String toString() {
        return "Rectangle";
    }

    public double getPerimeter() {
        return 2*(a+b);
    }

    @ProbeAnnotation
    public double getArea() {
        return a*b;
    }

    public Rectangle() {
        a = 1;
        b = 1;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
