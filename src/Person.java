public class Person {
    //properties
    int age;
    int height;
    String name;
    //constructor

public Person(int myAge){
    this.age = myAge;
}

public Person(){
    this(28);
}

//methods
    public void walk(int speed){
        if (speed > 10) {
            System.out.println("walking...");
        }
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    private void takeShower (){
        System.out.println("Taking a shower...");
    }


}








