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
    }

    public Triangle(String name, String type, double side1, double side2, double side3, double base, double height) {
        super(name);
        this.type = type;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        return side1;
    }

    public void setBase(double base) {
        this.side1 = side1;
    }

    public double getHeight() {
        return side1;
    }

    public void setHeight(double height) {
        this.side1 = side1;
    }

    public double triArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double triPeri() {
        return side1 + side2 + side3;
    }
}
