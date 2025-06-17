package Test.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //ArrayList = resizable array that stores object (using autoboxing).
        // (NOTE) -> Arrays are fixed, but arraylist can change.

        /*ArrayList<String> lists = new ArrayList<>();

        lists.add("Lloyd");
        lists.add("Sky");
        lists.add("Abakada");

        Collections.sort(lists);

        for(String list : lists){
            System.out.println(list);
        }*/


        //EXERCISE

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter Food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }

        System.out.println(foods);

        scanner.close();

    }
}
