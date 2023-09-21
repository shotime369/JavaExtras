import java.util.Scanner;
public class PeachBoxCounter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of peaches= ");
        int numOfPeach= input.nextInt();
        for( int numshipped = 0; numshipped < numOfPeach; numshipped += 20)
        {System.out.format("shipped %d peaches so far\n", numshipped);}


    }
}
