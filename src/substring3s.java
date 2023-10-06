import java.util.Scanner;

public class substring3s {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int i;
        int length = s.length();
        System.out.println(s.substring(0,k));
for (i=2; i<=length; i++){
    System.out.println(s.substring((k*i-k),k*i));

}
    }
}

