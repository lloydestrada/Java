package Test.Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        /* Generics in Java are a feature that allows classes, interfaces,
        and methods to operate on objects of various types while providing compile-time type safety.*/

        /*ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");*/

        Box<String> box = new Box<>();

        box.setItem("Banana");

        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("Apple", 60.21);

        System.out.println(product.getItem());
    }
}
