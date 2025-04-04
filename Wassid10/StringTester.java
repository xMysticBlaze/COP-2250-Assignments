package Wassid10;
import java.util.Random;

public class StringTester {

	public static void main(String[] args) {
		Random random = new Random();
		final int MAX = 100000;
		String test = new String();
		test = "a";

		long startTime = System.currentTimeMillis();
		// add a character
		for (int i = 0; i < MAX; i++) {
			test = test + "a";
		}
		// insert random characters into the test String
		for (int i = 0; i < MAX / 10; i++) {
			int insertPos = (int) (Math.random() * MAX - 1);
			char randomizedCharacter = (char) (random.nextInt(26) + 'a');
			test = test.substring(0, insertPos) + randomizedCharacter + test.substring(insertPos + 1);
		}
		// find the char at position
		for (int i = 0; i < MAX; i++) {
			String ch = test.substring(i);
		}
		// remove a character at the end of the string
		for (int i = 0; i < MAX; i++) {
			test = test.substring(0, test.length() - 1);
			//System.out.println("test " + test);  diagnostic print
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Execution time = " + (endTime - startTime));

	}

}
