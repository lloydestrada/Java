import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args){

        //SLOT MACHINE

        //Variables
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[][] grid;
        String spinAgain;
        String name;

        //Welcome Message
        System.out.println("-----------------------------");
        System.out.println("Welcome to the slot machine!");
        System.out.println("Symbols: 🍇 🍊 🍌 🍒 🍎 ");
        System.out.println("-----------------------------");

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        //Play if balance > 0
        while(balance > 0){

            //Enter the amount of bet
            System.out.println("\nYour current balance is: ₱" + balance);
            System.out.print("Bet amount: ");
            bet = sc.nextInt();
            sc.nextLine();

            //Verify bet is greater than the balance
            if(bet > balance){
                System.out.println("-----------------------------");
                System.out.println("INSUFFICIENT FUNDS!");
                System.out.println("-----------------------------");
                continue;
            }
            //Verify if bet is > 0
            else if (bet <= 0) {
                System.out.println("*******************************");
                System.out.println("Bet must be greater than 0!");
                System.out.println("Your bet: " + bet);
                System.out.println("*******************************");
                continue;
            }
            else {
                //Subtract bet from balance
                balance -= bet;
            }

            System.out.println("\nSpinning...");
            grid = spinGrid();
            printGrid(grid);
            payout = getPayout(grid, bet);

            if(payout > 0){
                System.out.println("You won ₱" + payout);
                balance += payout;
            }else{
                System.out.println("Sorry you didn't get anything");
            }

            //Ask to play again
            System.out.println("Spin Again? (Y/N): ");
            spinAgain = sc.nextLine().toUpperCase();
            if(!spinAgain.equals("Y")){
                break;
            }
        }

        //Exit Message
        System.out.println("Thank you " + name + " for playing!");
        System.out.println("Final Balance: ₱" + balance);
        sc.close();
    }

    //Spin Row method
    static String[][] spinGrid(){

        //Print Emojis(Row)
        String[] symbols = {"🍇", "🍊", "🍌", "🍒", "🍎", "7️⃣" };
        String[][] grid = new String[3][3];
        Random random = new Random();

        for(int row =0; row < 3; row++){
            for(int col = 0; col < 3; col++){

                grid[row][col] = symbols[random.nextInt(symbols.length)];
            }
        }
        return grid;
    }

    static void printGrid(String[][] grid){
        System.out.println("-------------------------");
        for(int i = 0; i < 3; i++){
            System.out.println("     " + String.join(" | ", grid[i]));
        }
        System.out.println("-------------------------");
    }


    static int getPayout(String[][] grid, int bet){

        //Check all rows
        for(int i = 0; i < 3; i++){
            if (grid[i][0].equals(grid[i][1]) && grid[i][1].equals(grid[i][2])){
                return getSymbolPayout(grid[i][0], bet, true);
            }
        }

        //check columns
        for(int i =0; i < 3; i++){
            if (grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i])){
                return getSymbolPayout(grid[0][i], bet, true);
            }
        }

        //check diagonals
        if (grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2])) {
            return getSymbolPayout(grid[0][0], bet, true);
        }
        if (grid[0][2].equals(grid[1][1]) && grid[1][1].equals(grid[2][0])) {
            return getSymbolPayout(grid[0][2], bet, true);
            }

        return 0;
    }

    static int getSymbolPayout(String symbol, int bet, boolean fullMatch){
            int multiplier = switch (symbol){

                case "🍎" -> fullMatch ? 300 : 200;
                case "🍒" -> fullMatch ? 450 : 300;
                case "🍌" -> fullMatch ? 600 : 450;
                case "🍇" -> fullMatch ? 900 : 700;
                case "🍊" -> fullMatch ? 1500 : 1000;
                case "7️⃣" -> fullMatch ? 5000 : 2500;
                default -> 0;
            };
        return bet * multiplier;
    }
}
