package Test.Enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Enums are special kind of class that represent a fixed set of constants

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch (day){

                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is Weekday");

                case SATURDAY, SUNDAY -> System.out.println("It is Weekend");

            }
        }

        catch (IllegalArgumentException e){
            System.out.println("Enter a valid day");
        }

        scanner.close();
    }
}
