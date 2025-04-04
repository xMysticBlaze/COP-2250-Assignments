/**
 Abdul Wassid 2506642
 */

package wassid3and4;

import java.util.Scanner;

public class DetermineSeason {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Prompt user to enter month and day
			System.out.print("Enter a month (1 - 12): ");
			int month = scanner.nextInt();
			System.out.print("Enter a day (1 - 31): ");
			int day = scanner.nextInt();

			String season = getString(month, day);

			// Output the season
			System.out.println("The computer outputs: " + season);
		}
    }

    private static String getString(int month, int day) {
        String season = "";

        // Determine the season based on month and day
        if ((month == 12 && day >= 21) || (month == 1) || (month == 2) || (month == 3 && day < 20)) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5 || month == 6 && day < 21) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8 || month == 9 && day < 22) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11 || month == 12) {
            season = "Fall";
        }
        return season;
    }
}
