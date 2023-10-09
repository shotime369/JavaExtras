import java.util.Scanner;
public class factorialwithrecursion {
    public static int factorial(int n) {
        //base case
        if (n <= 1) {
            return n;
        }
        //recursive case
        //example 3 * (2) + (1)
        else {
            return n * factorial(n-1);
        }
    }
}

