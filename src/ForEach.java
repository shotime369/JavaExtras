public class ForEach {
    public static void main(String[] args) {
       // int[] numbers = {0, 1, 2, 3, 4, 5};
        // Iterate over the elements of the 'numbers' array
        //for (int printme : numbers) {
        //    System.out.println(printme);
        //}
        //print up to 4th place in array counting up one each time
        //for (int i = 0; i < 4; i++){
        //    System.out.println(numbers[i]);
        //}
        //start at 1 until under 5th place, increase by two each time
        //for (int i = 1; i < 5; i+=2){
          //  System.out.println(numbers[i]);
        //}
        //int[] numbers2 = {4, 5, 6, 7};
        //int square = numbers2 * numbers2;
        //System.out.println(square);



        int[] arr = { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
        for(int item : arr){
        int square = item * item;
        System.out.println(square);

    }
    }
}

