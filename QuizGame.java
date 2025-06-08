import java.util.*;

 class QuizGame {

   public static void main(String[] args){

        //Quiz Game

       //Question using array
       String[] questions = {"Who is the father of java?",
                             "What part is called the brain of the computer?",
                             "What year is google created?",
                             "Who is the father of Artificial Intelligence (AI)?",
                             "Who is the richest man alive?"};

       //Options using array
       String[][] options = {{"1. James Gosling", "2. Dennis Ritchie", "3. Jaime Gosling", "4. Guido van Rossum"},
                             {"2. Hard Drive", "2. RAM", "3. GPU", "4. CPU"},
                             {"3. 1995", "2. 1996", "3. 2002", "4. 1998"},
                             {"4. Alan Turing", "2. John McCarthy", "3. Marvin Kinsky", "4. Geoffrey Hinton"},
                             {"5. Mark Zuckerberg", "2. Bill Gates", "3. Elon Musk", "4. Jeff Bezos"}};


       //Declare variables
       int[] answers = {1, 4, 4, 2, 3};
       int score = 0;
       int guess;

       Scanner sc = new Scanner(System.in);

       //welcome message
       System.out.println("**************************");
       System.out.println("Welcome to the Quiz Game!");
       System.out.println("**************************");

       //Question (loop)
       for(int i =0; i < questions.length; i++){
           System.out.println(questions[i]);

           //Options
           for(String option : options[i]){
               System.out.println(option);
           }

           //Get guess from user
           System.out.print("Enter your guess: ");
           guess = sc.nextInt();

           //check our guess
           if(guess == answers[i]){
               System.out.println("---------");
               System.out.println("PERFECT!");
               System.out.println("---------");
               score++;
           }
           else{
               System.out.println("---------");
               System.out.println("WRONG!");
               System.out.println("---------");
           }
       }

       //display final score
       System.out.println("Final Score: " + score + " out of " + questions.length);

       sc.close();
    }
}
