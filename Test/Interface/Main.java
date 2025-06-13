package Test.Interface;

public class Main {
    public static void main(String[] args){


        //Interface - Blueprint for a class that specifies a set of abstract methods that implementing class must DEFINE
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        fish.flee();
        fish.hunt();


        hawk.hunt();

        rabbit.flee();
    }
}
