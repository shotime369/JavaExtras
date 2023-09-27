public class Nestedloops{
        public static void main(String []args){
            //print the first number in the pair eg 2 of 23
            //goes up to 4
            for(int i = 1; i <= 4; i++) {
                //Nested loop - print the second number
                //goes up to 5
                for(int j = 1; j <= 5; j++) {
                    System.out.print(i + "" + j);
                    // tab space the output
                    System.out.print("\t");
                }
                System.out.println();
            }
        }
    }


