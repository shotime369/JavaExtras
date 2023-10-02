import java.io.*;
import java.util.*;

public class hack4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >=-100 && n <=100){
            String strNumber = String.valueOf(n);
            strNumber = ("Good Job");
            System.out.println(strNumber);
        }
       else {
            System.out.println("Wrong answer");
        }

    }
}
