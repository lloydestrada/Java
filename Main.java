import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //int[] numbers = {1, 2, 3, 6, 8, 9, 11,};
        String [] cars = {"Honda", "Mitsubishi", "Ford", "Toyota", "BMW", "Subaru", "Suzuki"};

        String target;
        boolean isFound = false;

        System.out.print("Enter the Car brand you want to find: ");
        target = scanner.nextLine();

        for(int i = 0; i < cars.length; i++){
            if(cars[i].equals(target)) {
                System.out.println("Element found: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Nothing found");
        }

        scanner.close();
    }
}
