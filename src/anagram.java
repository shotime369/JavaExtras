import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int lengthA = A.length();
        int i;
        int p;

        String small = A.substring(0,1);
        for (i = 0; i <= lengthA-1; i++) {
            String str = A.substring(i, i + 1);
            if (small.compareTo(str) > 0)
                small = str;
        }
        //System.out.println(small); this bit works lol


        StringBuilder strbuild2 = new StringBuilder();
        String gram = small;
        strbuild2.append(small);
        //System.out.println(strbuild2);
        //this bit works lol

        for (p = 0; p <= lengthA-1; p++)
        {
            if (gram.compareTo(A.substring (p,p+1)) <= 0) {
                strbuild2.append(A.substring (p,p+1));
                gram=A.substring (p,p+1);
            }
            System.out.println(strbuild2);
        }
    }
}

