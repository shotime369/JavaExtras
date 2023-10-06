import java.util.Scanner;

public class day6_oddevenprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       while (N-->0){
            String S = sc.next();
            char[] chars = S.toCharArray();
            for (int i = 0; i < S.length(); i = i + 2) {

                System.out.print(chars[i]);
            }
            System.out.print(" ");
            for (int p = 1; p < S.length(); p = p + 2) {

                System.out.print(chars[p]);
            }
            System.out.print("\n");
        }
    }
    }

