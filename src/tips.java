import java.util.Scanner;

public class tips {
    public static void main(String []argh) {
        Scanner input = new Scanner(System.in);
        double mealCost = input.nextDouble();
        int tipPercent = input.nextInt();
        int taxPercent = input.nextInt();

        double mealTip = (mealCost / 100 * tipPercent);
        double mealTax = (mealCost / 100 * taxPercent);

        double Total = (mealCost + mealTip + mealTax);
        System.out.format("%.0f%n", Total);

    }
}
