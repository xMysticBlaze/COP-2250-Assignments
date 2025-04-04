public class Triangletest {
    public static void main(String[] args) {
        // Test default constructor
        Triangle triangle1 = new Triangle();
        System.out.println("Triangle 1:");
        System.out.println("Side1: " + triangle1.getSide1());
        System.out.println("Side2: " + triangle1.getSide2());
        System.out.println("Side3: " + triangle1.getSide3());
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Perimeter: " + triangle1.getPerimeter());

        // Test parameterized constructor
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("\nTriangle 2:");
        System.out.println("Side1: " + triangle2.getSide1());
        System.out.println("Side2: " + triangle2.getSide2());
        System.out.println("Side3: " + triangle2.getSide3());
        System.out.println("Area: " + triangle2.getArea());
        System.out.println("Perimeter: " + triangle2.getPerimeter());
    }
}