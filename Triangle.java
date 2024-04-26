import java.util.Scanner;

class Triangle extends Polygon {
    private String type;
    private double side1, side2, side3, base, height;

    public Triangle() {
        super();
        this.type = "";
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
        this.base = 0;
        this.height = 0;
    }

    public Triangle(String name, String type, double side1, double side2, double side3, double base, double height) {
        super(name);
        this.type = type;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double triArea() {
        double s = (base*height) / 2;
        return s;
    }

    public double triPeri() {
        return side1 + side2 + side3;
    }
}
