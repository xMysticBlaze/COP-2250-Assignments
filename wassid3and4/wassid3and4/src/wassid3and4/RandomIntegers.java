/**
 Abdul Wassid 2506642
 */

package wassid3and4;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate two random integers between 25 and 75 (inclusive)
        int num1 = 25 + rand.nextInt(51); // (0 to 50) + 25 = (25 to 75)
        int num2 = 25 + rand.nextInt(51); // (0 to 50) + 25 = (25 to 75)

        // Print the generated integers
        System.out.println("First random integer: " + num1);
        System.out.println("Second random integer: " + num2);

        // Calculate and print the positive difference without using Math.abs()
        int difference;
        if (num1 > num2) {
            difference = num1 - num2;
        } else {
            difference = num2 - num1;
        }

        System.out.println("The positive difference between the two integers is: " + difference);
    }
}

