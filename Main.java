import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 6, 8, 9, 11,};

        int target = 2;

        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]) {
                System.out.println("Element found: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Nothing found");
        }
    }
}
