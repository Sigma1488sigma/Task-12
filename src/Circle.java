public class Circle {
    final double PI = 3.14159;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return this.PI * this.radius * this.radius;
    }

    public double calculateCircumference() {
        return 2 * this.PI * this.radius;
    }

}
