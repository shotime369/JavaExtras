import java.util.Formatter;
import java.util.Scanner;

public class outputformatting {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                System.out.println("================================");
                for(int i=0;i<3;i++){
                    String s=sc.next();
                    int x=sc.nextInt();
                    //left justified and 15 spaces
                    String s1=String.format("%-15s", s);
                    //3 digit padded with zeroes
                    System.out.format(s1 + "%03d", x);
                    //new line
                    System.out.printf("%n");
                }
                System.out.println("================================");

            }
        }


