import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char operator;
        double firsNum, secondNum, result;


        System.out.println("---------------------------------------");
        System.out.println("Welcome to the mini calculator project");
        System.out.println("---------------------------------------");


        System.out.println("Choose an operator (+, -, *, /)");
        operator = sc.next().charAt(0);

        // first Number
        System.out.print("Enter your first number: ");
        firsNum = sc.nextDouble();

        //second Number
        System.out.print("Enter your second number: ");
        secondNum = sc.nextDouble();

        switch (operator){
            case '+' ->{
                    result = firsNum + secondNum;
                    System.out.println(firsNum + " + " + secondNum + " = " + result);
                    break;
            }

            case '-' ->{
                result = firsNum - secondNum;
                System.out.println(firsNum + " + " + secondNum + " = " + result);
                break;
            }

            case '*' ->{
                result = firsNum * secondNum;
                System.out.println(firsNum + " + " + secondNum + " = " + result);
                break;
            }

            case '/' ->{

                if(firsNum == 0 || secondNum == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    result = firsNum / secondNum;
                    System.out.println(firsNum + " + " + secondNum + " = " + result);
                    break;
                }
            }

            default -> {
                System.out.println("Invalid Input");
            }
        }

        sc.close();
    }
}
