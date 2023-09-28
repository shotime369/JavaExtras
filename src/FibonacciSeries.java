public class FibonacciSeries {
    public static void main(String[] args) {
        int iter = 1, firstnum = 0, secondnum = 1, sum=0;
        while (iter <= 15){
            System.out.print(firstnum + " ");
            sum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = sum;
            iter++;

    }
}
}

//fibonacci : F(n) = F(n-1) + F(n-2) for n > 1