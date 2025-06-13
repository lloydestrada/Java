package MiniEntryProjects;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;


        System.out.println("*******************************");
        System.out.println("Welcome to the Odd/Even Checker");
        System.out.println("*******************************");

        System.out.print("\nEnter the number: ");
        number =  scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("The number you input is Even");
        }
        else if (number % 3 == 0) {
            System.out.println("The number you input is Odd");
        }else {
            System.out.println("Invalid Input");
        }

    }
}
