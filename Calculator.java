import java.util.*;

public class Calculator {
    
        static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        

        double firstNumber = 0;
        double secondNumber = 0;
        int options;
        boolean isRunning = true;

        while(isRunning) {

            System.out.println("---------------------------------------");
            System.out.println("Welcome to the mini calculator project");
            System.out.println("---------------------------------------");

            System.out.println("Select an operator");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit");

            System.out.print("Enter your options: ");
            options = sc.nextInt();

            switch (options){
                case 1 -> add();
            }

        }

    }

    static double add(double a, double b){

    }
}
