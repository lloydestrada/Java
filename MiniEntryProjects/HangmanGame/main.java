package MiniEntryProjects.HangmanGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        //HangmanGame

        String filePath = "C:\\Users\\iamll\\Self Study\\Java\\Java_MiniEntryProjects\\MiniEntryProjects\\HangmanGame\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                    words.add(line.trim());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find the file");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));


        Scanner sc = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');


        }
        System.out.println("-----------------------------");
        System.out.println("Welcome to Java Hangman Game!");
        System.out.println("-----------------------------");

       while(wrongGuesses < 6){

           System.out.println(getHangManArt(wrongGuesses));

           System.out.print("Word: ");

           for(char c : wordState){

               System.out.print(c + " ");
           }

           System.out.println();

           System.out.print("Guess a letter: ");
           char guess = sc.next().toLowerCase().charAt(0);

           if(word.indexOf(guess) >= 0){
               System.out.println("Nice one, you guess it!\n");

               for(int i = 0; i < word.length(); i++){
                   if(word.charAt(i) == guess){
                       wordState.set(i, guess);
                   }
               }

               if(!wordState.contains('_')){

                   System.out.println(getHangManArt(wrongGuesses));
                   System.out.println("You WIN!!");
                   System.out.println("The word was: " + word);
                   break;
               }
           }
           else{
               wrongGuesses++;
               System.out.println("Wrong!\n");

           }
       }

       if(wrongGuesses >= 6){
           System.out.println(getHangManArt(wrongGuesses));
           System.out.println("Game Over");
           System.out.println("The Word was: " + word);
       }

        sc.close();
    }

    static String getHangManArt(int wrongGuesses){

        return switch (wrongGuesses){

            case 0 -> """
                    
                    
                    
                    
                    """;
            case 1 -> """
                    
                        O
                    
                    
                    """;
            case 2 -> """
                    
                        O
                        |
                    
                    
                    """;
            case 3 -> """
                    
                        O
                       /|
                    
                    
                    """;
            case 4 -> """
                    
                        O
                       /|\\
                    
                    
                    """;
            case 5 -> """
                    
                        O
                       /|\\
                       /
                    
                    """;
            case 6 -> """
                    
                        O
                       /|\\
                       / \\
                    
                    """;
            default -> "";
        };

    }

}
