import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class hack2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int A = 1;
        while (scanner.hasNext()) {
            String input = scanner.next(); // Read the next token
            System.out.println(A + " " + input);
            A++;
        }
        // Close the Scanner when done
        scanner.close();
    }

}

