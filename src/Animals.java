public class Animals {
    public static void main(String[] args) {

        Animal cow = new Animal();
        Animal goat = new Animal();
        Animal duck = new Animal(2,2,2);
        Animal spider = new Animal(8,2,12);

        cow.setName("Cow");
        cow.setFamily("Bovidae");
        goat.setName("Goat");
        goat.setFamily("Bovidae");
        duck.setName("Duck");
        duck.setFamily("Anatidae");
        spider.setName("Lucas");
        spider.setFamily("Arachnid");

        System.out.println(cow.getName());
        System.out.println(goat.getName());
        System.out.println(duck.getFamily());
        System.out.println(spider.getFamily());
        System.out.println(spider.getName());
        System.out.println(spider.getLegs());
    }
}
