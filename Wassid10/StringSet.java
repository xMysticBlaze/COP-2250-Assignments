package Wassid10;
public class StringSet {
    private String[] strings;
    private int currentElements;

    public StringSet() {
        strings = new String[10];
        currentElements = 0;
    }

    public boolean add(String newStr) {
        if (currentElements >= 10) {
            return false;
        }
        strings[currentElements] = newStr;
        currentElements++;
        return true;
    }

    public int size() {
        return currentElements;
    }

    public int numChars() {
        int totalChars = 0;
        for (int i = 0; i < currentElements; i++) {
            totalChars += strings[i].length();
        }
        return totalChars;
    }

    public int countStrings(String subStrToFind) {
        int count = 0;
        for (int i = 0; i < currentElements; i++) {
            if (strings[i].contains(subStrToFind)) {
                count++;
            }
        }
        return count;
    }

    public void pop() {
        if (currentElements > 0) {
            strings[currentElements - 1] = null;
            currentElements--;
        }
    }
}
