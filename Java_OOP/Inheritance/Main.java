package Java_OOP.Inheritance;

public class Main {
    public static void main(String[] args){

        //Inheritance = One class inherits the attributes and methods from another class.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println("-------------------");
        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.eat();
        dog.speak();
        System.out.println("-------------------");

        System.out.println("-------------------");
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.eat();
        cat.speak();
        System.out.println("-------------------");


        System.out.println("-------------------");
        System.out.println(plant.isAlive);
        plant.photosynthesize();
        System.out.println("-------------------");

    }
}
