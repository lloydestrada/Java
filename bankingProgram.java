import java.util.*;

public class bankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        // Declaring variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            //Display Menu
            System.out.println("");
            System.out.println("Welcome to the Bank");
            System.out.println("Here are the options");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your options: ");
            choice = scanner.nextInt();
            System.out.println("");

            switch(choice){
                case 1 -> showBalance(balance);

                case 2 ->  balance += deposit();

                case 3 -> balance -= withdraw(balance);

                case 4 -> isRunning=false;

                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("Thank you so much");
        System.out.println("Have a nice day");
        scanner.close();
    }

    //Show Balance
    static void showBalance(double balance){
        System.out.printf("Your balance is %.2f", balance);
    }

    static double deposit(){

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0 ){
            System.out.println("Invalid amount");
            return 0;
        }else{
            return amount;
        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        } else if (amount < 0 ) {
            System.out.println("Invalid amount");
            return 0;
        }else {
            return amount;
        }
    }
}
