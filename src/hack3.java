import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class hack3 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        {
            try
            {
                int b = sc.nextInt();
                int h = sc.nextInt();
                if (b > 0 && h > 0) {
                    int a = b * h;
                    System.out.println(a);
                }
                else throw new Exception("java.lang.Exception: Breadth and height must be positive");
        } catch (Exception e){
            System.out.println(e.getMessage());
            }
        }
    }
}