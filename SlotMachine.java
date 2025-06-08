import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args){

        //SLOT MACHINE

        //Variables
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        //Welcome Message
        System.out.println("-----------------------------");
        System.out.println("Welcome to the slot machine!");
        System.out.println("Symbols: 🍇 🍊 🍌 🍒 🍎 ");
        System.out.println("-----------------------------");

        //Play if balance > 0
        while(balance > 0){

            //Enter the amount of bet
            System.out.println("Your current balance is: ₱" + balance);
            System.out.print("Bet amount: ");
            bet = sc.nextInt();
            break;

        }

        //Verify bet is greater than the balance

        //Verify if bet is > 0

        //Subtract bet from balance

        //SPIN ROW

        //Print Emojis(Row)

        //Get payout

        //Ask to play again

        //Exit Message

        sc.close();
    }
}
