public class Animal {
    //properties
    int legs;
    int ears;
    int eyes;
    String family;
    String name;

    //constructor - initialize legs, ears & eyes
    public Animal() {
        this(4, 2, 2);
    }

    //constructor - take values as arguments and set those values
    public Animal(int legs, int ears, int eyes) {
        this.legs = legs;
        this.ears = ears;
        this.eyes = eyes;
    }
    //getter
    public String getFamily() {
        return family;
    }
    //setter
    public void setFamily(String family) {
        this.family = family;
    }
    //getter2
    public String getName() {
        return name;
    }
    //setter2
    public void setName(String name) {
        this.name = name;
    }
    public String getLegs() {
        return String.valueOf(legs);
    }
}

