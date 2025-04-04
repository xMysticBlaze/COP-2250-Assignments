package Wassid10;
public class StringBuilder {
    public static void main(String[] args) {
        final int MAX = 50000;
        long startTime, endTime;

        // Original String concatenation
        startTime = System.currentTimeMillis();
        String test = "";
        for (int i = 0; i < MAX; i++) {
            test += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + "ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder testSB = new StringBuilder();
        for (int i = 0; i < MAX; i++) {
            testSB.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");
    }

	private void append(int i) {
		// TODO Auto-generated method stub
		
	}
}
