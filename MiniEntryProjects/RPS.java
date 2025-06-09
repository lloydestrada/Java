package MiniEntryProjects;

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
        String playAgain = "Yes";

        //GET CHOICE
        do{
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            //RANDOM CHOICE OF PC
            PCChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice:  " + PCChoice );

            //CHECK
            if(playerChoice.equals(PCChoice)){
                System.out.println("It's a tie!");
            } else if(playerChoice.equals("rock") && PCChoice.equals("scissors") ||
                    (playerChoice.equals("paper") && PCChoice.equals("rock") ||
                            (playerChoice.equals("scissors") && PCChoice.equals("paper")))){

                System.out.println("You Win!");
            } else{
                System.out.println("You Lose!");
            }

            //PLAY AGAIN
            System.out.print("Play Again Y/N: ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        //MESSAGE
        System.out.println("--------------------");
        System.out.println("Thanks for playing!");
        System.out.println("--------------------");

        scanner.close();
    }
}
