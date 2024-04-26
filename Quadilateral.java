import java.util.Scanner;

class Quadrilateral extends Polygon {
    private double height, base;

    public Quadrilateral() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Quadrilateral(String name, double height, double base) {
        super(name);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double quadArea() {
        return height * base;
    }

    public double quadPeri() {
        return 2 * (height + base);
    }
}