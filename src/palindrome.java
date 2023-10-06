import java.util.Scanner;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int lengthA = A.length();
        int i;
        StringBuilder strbuild = new StringBuilder(A.substring(lengthA-1));
        //System.out.println(A.substring(lengthA-1));
        for (i=lengthA-2; i > -1; i--) {
            strbuild.append(A.charAt(i));
        }
        String rev = String.valueOf(strbuild);
        if (A.equalsIgnoreCase(rev)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        }
    }


