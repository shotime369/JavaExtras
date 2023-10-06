import java.util.Scanner;

public class substringcomparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int i;
        int length = s.length();

        String small = s.substring(0,k);
        String large = s.substring(0,k);
        for (i = 0; i <= length - k; i++)
        {
            String str = s.substring(i, i + k);
            if (small.compareTo(str)>0)
                small=str;
            if (large.compareTo(str)<0)
                large=str;

        }
    }
}
//System.out.println(s.substring(0, k));

