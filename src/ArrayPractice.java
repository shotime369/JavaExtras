import java.util.Arrays;

public class ArrayPractice {
    public static void printArray (int[] array){
        System.out.print ("[");
        for (int i=0; i<array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length-1 ) {
                System.out.print(",");
            }
        }
        System.out.println ("]");
        }

    public static void main(String [] args){
        //Index: 0,1,2,3,4
        //Array: (0,5,3,2,1) ---> length 5
        //0,   1,     2
        //bob, sally, max ----> length 3

        int [] intArray1;
        int [] intArray2 = new int[4];
        int [] intArray3 = {5,2,9,1,3};

        intArray2 [0] = 10;
        intArray2 [1] = 8;
        intArray2 [2] = 5;
        intArray2 [3] = 10;

        String [] stringArray1 = {"bananas", "apples", "pears"};

System.out.println(Arrays.toString(intArray2));
System.out.println(Arrays.toString(intArray3));

//custom print out arrays
printArray(intArray2);
printArray(intArray3);
    }
}
