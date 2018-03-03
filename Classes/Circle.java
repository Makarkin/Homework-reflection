package Classes;

public class Circle extends Shape {

    private double radius;

    public String toString() {
        return "Circle";
    }

    public double lengthOfCircle() {
        return 2 * Math.PI * radius;
    }

    public double areaOfRound() {
        return Math.PI * radius * radius;
    }

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
