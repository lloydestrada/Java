package MiniEntryProjects;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char operator;
        double firstNum, secondNum, result;
        boolean isRunning = true;


        while(isRunning){
            System.out.println("---------------------------------------");
            System.out.println("Welcome to the mini calculator project");
            System.out.println("---------------------------------------");


            System.out.println("Choose an operator (+, -, *, /) or press 5 to exit. ");
            operator = sc.next().charAt(0);

            if(operator == '5'){
                isRunning = false;
                continue;
            }

            // first Number
            System.out.print("Enter your first number: ");
            firstNum = sc.nextDouble();

            //second Number
            System.out.print("Enter your second number: ");
            secondNum = sc.nextDouble();

            switch (operator){
                case '+' ->{
                    result = firstNum + secondNum;
                    System.out.println(firstNum + " + " + secondNum + " = " + result);
                    break;
                }

                case '-' ->{
                    result = firstNum - secondNum;
                    System.out.println(firstNum + " - " + secondNum + " = " + result);
                    break;
                }

                case '*' ->{
                    result = firstNum * secondNum;
                    System.out.println(firstNum + " * " + secondNum + " = " + result);
                    break;
                }

                case '/' ->{

                    if(secondNum == 0){
                        System.out.println("Cannot divide by zero");
                    }else{
                        result = firstNum / secondNum;
                        System.out.println(firstNum + " / " + secondNum + " = " + result);

                    }
                    break;
                }
                default ->
                    System.out.println("Invalid Input");
            }
        }
        System.out.println("MiniEntryProjects.Calculator is now closed!");
        System.out.println("Thank You!");
        sc.close();
    }
}
