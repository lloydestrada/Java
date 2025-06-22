package MiniEntryProjects.HangmanGame;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        //HangmanGame

        String word = "burger";

        Scanner sc = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');


        }
        System.out.println("-----------------------------");
        System.out.println("Welcome to Java Hangman Game!");
        System.out.println("-----------------------------");

        System.out.print("Word: ");

        for(char c : wordState){

            System.out.print(c + " ");
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
