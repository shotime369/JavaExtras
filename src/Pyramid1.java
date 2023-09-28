public class Pyramid1 {
        public static void main(String[] args) {
            int rows = 5; // You can change the number of rows as desired

            for (int i = 1; i <= rows; i++) {
                // Print spaces before asterisks
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Print asterisks
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                // Move to the next line
                System.out.println();
            }
        }
    }


