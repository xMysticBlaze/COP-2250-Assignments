import java.util.Random;

public class DiceRollSimulation {
    public static void main(String[] args) {
        int[] rolls = new int[6000000];  // Array to hold 6 million dice rolls
        int[] results = new int[6];      // Array to hold the count of each dice face (1 to 6)
        
        Random rand = new Random();

        // Simulate rolling the dice 6 million times
        for (int i = 0; i < rolls.length; i++) {
            int roll = rand.nextInt(6) + 1;  // Generate a random number between 1 and 6
            rolls[i] = roll;                 // Store the roll in the array
            results[roll - 1]++;             // Increment the count for the rolled number
        }

        // Display the results
        for (int i = 0; i < results.length; i++) {
            System.out.println("Number of " + (i + 1) + "s : " + results[i]);
        }

        // Calculate the difference between the largest and smallest counts
        int max = results[0];
        int min = results[0];
        for (int count : results) {
            if (count > max) {
                max = count;
            }
            if (count < min) {
                min = count;
            }
        }

        System.out.println("Difference between Largest and Smallest is :" + (max - min));
    }
}
