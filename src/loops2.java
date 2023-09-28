import java.util.*;
import java.io.*;

public class loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0 ; i<t ; i++){

            int ans = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int line=0 ; line<n ; line++) {
                if (line == 0)
                {
                     ans = ans + (a + ((int)Math.pow(2,line) * b));
                    System.out.format("%d ", ans);
                } else {
                    ans = ans + ((int)Math.pow(2,line) * b);
                    System.out.format("%d ", ans);
                }
            }
            System.out.println();
        }

    }

}

