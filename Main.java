public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", "Equilateral", 5, 5, 5);
        System.out.println("Triangle Area: " + triangle.triArea());
        System.out.println("Triangle Perimeter: " + triangle.triPeri());

        Quadrilateral quadrilateral = new Quadrilateral("Quadrilateral", 6, 8);
        System.out.println("Quadrilateral Area: " + quadrilateral.quadArea());
        System.out.println("Quadrilateral Perimeter: " + quadrilateral.quadPeri());

        Pentagon pentagon = new Pentagon("Pentagon", 7, 6);
        System.out.println("Pentagon Area: " + pentagon.pentArea());
        System.out.println("Pentagon Perimeter: " + pentagon.pentPeri());
    }
}
