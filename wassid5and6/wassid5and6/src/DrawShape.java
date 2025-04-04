public class DrawShape {

    // Method to draw a square of plus signs
    public static String drawShape(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - 1) {
                    sb.append('+').append(' ');
                } else {
                    sb.append('+');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    // Method to draw a rectangle of 'X' characters with spaces inside
    public static String drawShape(int width, int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    sb.append('X');
                } else if (j == 0 || j == width - 1) {
                    sb.append('X');
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    // Method to draw a rectangle of a given character with spaces inside
    public static String drawShape(int width, int height, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    sb.append(c);
                } else if (j == 0 || j == width - 1) {
                    sb.append(c);
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    // Method to draw a rectangle of a given string with alternating characters
    public static String drawShape(int width, int height, String str) {
        StringBuilder sb = new StringBuilder();
        char c1 = str.charAt(0); // First character
        char c2 = str.length() > 1 ? str.charAt(1) : ' '; // Second character or space if not provided
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    sb.append(c1);
                } else if (j == 0 || j == width - 1) {
                    sb.append(c1);
                } else {
                    sb.append(c2);
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
