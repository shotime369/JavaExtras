public class NestedPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i += 2) {
            // Print spaces before asterisks
            for (int k = 0; k < (7 - i / 2); k++) {
                System.out.print(" ");
            }

                // Print asterisks
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                //Go to next line before loop
                System.out.println();

        }
    }
}



