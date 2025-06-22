package Test.MethodOverriding;

public class Main {
    public static void main(String[] args){


        //method overriding = subclass provide its own method that is already defined.
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        dog.move();
        bird.move();
        fish.move();

    }
}
