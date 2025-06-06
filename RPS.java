import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args){


        //ROCK PAPER SCISSORS
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String PCChoice;
        String playAgain = "yes";

        //GET CHOICE
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
        }

        //RANDOM CHOICE OF PC
        PCChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice:  " + PCChoice );

        //CHECK


        //PLAY AGAIN

        //MESSAGE

        scanner.close();
    }
}
