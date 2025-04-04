/*/
 Abdul Wassid 2506642
 */

import java.util.Scanner;
import java.util.Random;

public class wassid3and4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game introduction0
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");

        // User input
        int userChoice = scanner.nextInt();
        while (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2:");
            userChoice = scanner.nextInt();
        }

        // Computer choice
        int computerChoice = random.nextInt(3);

        // Display choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

 // Helper method to convert choice to string
    private static String choiceToString(int choice) {
        return switch (choice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            case 2 -> "Scissors";
            default -> "Unknown";
        };
    }
}
