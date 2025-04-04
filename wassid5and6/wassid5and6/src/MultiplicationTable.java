public class MultiplicationTable {
    public static void main(String[] args) {
        // Print the header
        System.out.print("Multiplication Table\n   ");
        for (int j = 1; j <= 9; j += 2) {
            System.out.printf("%4d", j);
        }
        System.out.println("\n-----------------------------");

        // Generate and print the multiplication table
        for (int i = 2; i <= 9; i += 2) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= 9; j += 2) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
