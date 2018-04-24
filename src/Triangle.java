public class Triangle implements Shape{

    private int base;
    private int height;


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Triangle() {
        base = height = 0;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        return (1.0/2.0)*base*height;
    }


}
