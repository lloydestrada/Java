package Test.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Exception = An event that interrupts the normal flow of a program
        //              Surround  any dangerous code with try{}, catch{}, and finally{}


        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);

        }
        catch (InputMismatchException e){
            System.out.println("That is not a number!");

        }
        catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        }

        finally {
            scanner.close();
        }
    }
}
