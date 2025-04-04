package wassid12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class wassid12 {

    public static final String URL_STRING = "https://www.oracle.com/technetwork/java/javase/downloads/index.html";

    public static void main(String[] args) {
        URL url;
        Scanner page = null;
        try {
            url = new URL(URL_STRING);
            page = new Scanner(url.openStream());
        } catch (MalformedURLException e) {
            System.out.println("The URL is malformed: " + e + "\n" + URL_STRING);
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Failed to open Scanner on URL: " + e + "\n" + URL_STRING);
            System.exit(0);
        }
        
        boolean found = false;
        while (page.hasNext() && !found) {
            String line = page.nextLine();
            if (line.contains("JDK Development Kit")) {
                System.out.println(line.trim());
                found = true;
            }
        }
        page.close();
    }
}
