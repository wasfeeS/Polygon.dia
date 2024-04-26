import java.util.Scanner;

class Pentagon extends Polygon {
    private double diagonal, height;

    public Pentagon() {
        super();
        this.diagonal = 0;
        this.height = 0;
    }

    public Pentagon(String name, double diagonal, double height) {
        super(name);
        this.diagonal = diagonal;
        this.height = height;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double pentArea() {
        return 0.5 * diagonal * height;
    }

    public double pentPeri() {
        return 5 * diagonal;
    }
}
