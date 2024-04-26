import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter Triangle details:");
        System.out.print("Name: ");
        String triangleName = scanner.nextLine();
        System.out.print("Type: ");
        String triangleType = scanner.nextLine();
        System.out.print("Side 1: ");
        double triangleSide1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double triangleSide2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double triangleSide3 = scanner.nextDouble();
        System.out.print("Base ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Height ");
        double triangleHeight = scanner.nextDouble();
        scanner.nextLine(); 

        Triangle triangle = new Triangle(triangleName, triangleType, triangleSide1, triangleSide2, triangleSide3, triangleBase, triangleHeight);

        
        System.out.println("\nEnter Quadrilateral details:");
        System.out.print("Name: ");
        String quadName = scanner.nextLine();
        System.out.print("Height: ");
        double quadHeight = scanner.nextDouble();
        System.out.print("Base: ");
        double quadBase = scanner.nextDouble();
        scanner.nextLine(); 

        Quadrilateral quadrilateral = new Quadrilateral(quadName, quadHeight, quadBase);

        
        System.out.println("\nEnter Pentagon details:");
        System.out.print("Name: ");
        String pentName = scanner.nextLine();
        System.out.print("Diagonal: ");
        double pentDiagonal = scanner.nextDouble();
        System.out.print("Height: ");
        double pentHeight = scanner.nextDouble();
        scanner.nextLine(); 

        Pentagon pentagon = new Pentagon(pentName, pentDiagonal, pentHeight);

        
        System.out.println("\nTriangle Details:");
        System.out.println("Name: " + triangle.getName());
        System.out.println("Type: " + triangle.getType());
        System.out.println("Side 1: " + triangle.getSide1());
        System.out.println("Side 2: " + triangle.getSide2());
        System.out.println("Side 3: " + triangle.getSide3());
        System.out.println("Triangle Area: " + triangle.triArea());
        System.out.println("Triangle Perimeter: " + triangle.triPeri());

        
        System.out.println("\nQuadrilateral Details:");
        System.out.println("Name: " + quadrilateral.getName());
        System.out.println("Height: " + quadrilateral.getHeight());
        System.out.println("Base: " + quadrilateral.getBase());
        System.out.println("Quadrilateral Area: " + quadrilateral.quadArea());
        System.out.println("Quadrilateral Perimeter: " + quadrilateral.quadPeri());

        
        System.out.println("\nPentagon Details:");
        System.out.println("Name: " + pentagon.getName());
        System.out.println("Diagonal: " + pentagon.getDiagonal());
        System.out.println("Height: " + pentagon.getHeight());
        System.out.println("Pentagon Area: " + pentagon.pentArea());
        System.out.println("Pentagon Perimeter: " + pentagon.pentPeri());
        scanner.close();
    }
}
