package Classes;

public class Square extends Shape {

    private double a;

    public String toString() {
        return "Square";
    }

    public double getPerimeter() {
        return 4*a;
    }

    public double getArea() {
        return a*a;
    }

    public Square() {
        a = 1;
    }

    public Square(double a) {
        this.a = a;
    }
}
