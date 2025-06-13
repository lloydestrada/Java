package MiniEntryProjects;

import java.util.Scanner;

public class PrimeAndComposite {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.print("Enter the number: ");
        choice = scanner.nextInt();

        if(choice <= 1){
            System.out.println("This is a prime number");
        }
        else if (isPrime(choice)){
            System.out.println(choice + " is a prime number");
        }else{
            System.out.println(choice + " is a composite number");
        }

        scanner.close();
    }

    public static boolean isPrime(int num){
        if(num <= 3 ) return  num > 1;
        if(num % 2 == 0 || num % 3 == 0) return false;

        for(int i = 5; i * i <= num; i+=6){
            if(num % i == 0 || num % ( i + 2) == 0)
                return false;
        }
        return  true;
    }
}
