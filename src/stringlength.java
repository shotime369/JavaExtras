import java.util.Scanner;

public class stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lengthA = A.length();
        int lengthB = B.length();
        //System.out.println(lengthA + lengthB);
        System.out.println( A.compareTo(B) );
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");}
        // Get the first character and convert it to uppercase
        char A1 = Character.toUpperCase(A.charAt(0));
        // Create a new string with the first character in uppercase
        String result = A1 + A.substring(1);
        char B1 = Character.toUpperCase(B.charAt(0));
        // Create a new string with the first character in uppercase
        String result2 = B1 + B.substring(1);
        // Print the result
        System.out.println(result + " " + result2);
    }
}
