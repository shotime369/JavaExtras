import java.util.Arrays;
import java.util.Scanner;

public class Arrayday7 {




    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //input length
        int n = sc.nextInt();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Split the input string into individual integers
        String[] inputArray = input.split(" ");
        // Create an array to store the integers
        int[] numbers = new int[n];
        // Convert and store the integers in the array
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        //System.out.print(Arrays.toString(numbers));

        //int [] intArray1 = new int[n];

        //for(int p=0; p < intArray1.length; p++){
           // int x = sc.nextInt();
           // intArray1 [p] = x;

printArrayReverse(numbers);
    }
    public static void printArrayReverse (int[] array){
        for (int i=array.length-1; i>=0; i--) {
            int item = array[i];
            System.out.print(item +" ");
        }
    }
    }
