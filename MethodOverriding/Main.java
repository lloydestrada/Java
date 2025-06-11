package MethodOverriding;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        dog.move();
        bird.move();
        fish.move();

    }
}
