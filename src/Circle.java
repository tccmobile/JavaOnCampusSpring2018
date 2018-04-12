public class Circle extends Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius,2.0);
    }
}
