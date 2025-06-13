package Java_OOP.RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Runtime or Dynamic Polymorphism - When the method that gets executed is decided
        //                                  at runtime based on the actual type of object

        Scanner scanner = new Scanner(System.in);
        Animal animal;


        System.out.print("Would you like a dog or a cat? (1. Dog 2. Cat)");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();

        }else{

         animal = new Cat();
         animal.speak();

        }
    }
}
