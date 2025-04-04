public class DrawShapeTester {
    public static void main(String[] args) {
        System.out.println(DrawShape.drawShape(3));          // Draw a square of plus signs
        System.out.println(DrawShape.drawShape(6, 3));       // Draw a rectangle of 'X's with spaces
        System.out.println(DrawShape.drawShape(7, 3, '*'));  // Draw a rectangle of '*' with spaces
        System.out.println(DrawShape.drawShape(8, 4, "XO")); // Draw a rectangle of 'X' and 'O' alternating
        
        // Additional examples
        System.out.println(DrawShape.drawShape(5));          // Draw a square of plus signs
        System.out.println(DrawShape.drawShape(3, 4));       // Draw a rectangle of 'X's with spaces
        System.out.println(DrawShape.drawShape(4, 8, '*'));  // Draw a rectangle of '*' with spaces
        System.out.println(DrawShape.drawShape(5, 10, "YX")); // Draw a rectangle of 'Y' and 'X' alternating
    }
}
