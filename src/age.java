import java.util.*;

public class age {

    public static void amIOld(int age, int ageyear) {
        if (age < 13) {
            System.out.println("You are young");
        } else if (age <= 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are old");
        }
        if (ageyear < 13) {
            System.out.println("You are young");
        } else if (age > 13 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are old");
        }

    }


    public static void yearPasses() {
        //age++;
    }
}



