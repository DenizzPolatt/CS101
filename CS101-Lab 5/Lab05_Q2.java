import java.util.Scanner;
import java.util.Random;
/**
 * Lab05_Q2
 */
public class Lab05_Q2 {

    public static void main(String[] args) {
        
        System.out.println("Starting the game with the following deck: ");

        String deck = "";
        for(int i = 1; i < 10; i++) 
        {
            for(int j = 0; j < 4; j++) 
            {
                String card = Integer.toString(i);
                System.out.print(card);
                deck += card;
            }
        }
        System.out.println();
        System.out.println("Dealer is now dealing cards...");
        System.out.println("Player's hand: ");
        Random rand = new Random();

        String playersHand = "";

        for(int i = 0; i < 2; i++) 
        {
            int randomChoice = rand.nextInt(deck.length());
            char playersCard = deck.charAt(randomChoice);
            playersHand += playersCard;

            deck = deck.substring(0, randomChoice) + 
                deck.substring(randomChoice +1);
        }
        System.out.print(playersHand); //players starting hand printed 

        System.out.println();
        System.out.println("Dealer's hand: ");

        String dealersHand = "";
        for(int i = 0; i < 2; i++)
        {
            int randomChoice = rand.nextInt(deck.length());
            char dealersCard = deck.charAt(randomChoice);
            dealersHand += dealersCard;

            deck = deck.substring(0, randomChoice) + 
                deck.substring(randomChoice + 1);
        }
        System.out.print(dealersHand.substring(0, 1) + "?"); // dealers starting hand printed

        Scanner in = new Scanner(System.in);

        int playerSum = 0;
        for(;;) {

            System.out.println("\nPlease enter your choice: ");
            System.out.println("1) Hit \n2) Stand");
            int hitOrStandMenu = in.nextInt();


            if(hitOrStandMenu == 1)
            {
                System.out.println(
                    "\nHit! Dealer is giving the player a card...");
                
                int randomChoice = rand.nextInt(deck.length());
                char playersCard = deck.charAt(randomChoice);
                playersHand += playersCard;

                System.out.println("Player's hand: " + playersHand);

                deck = deck.substring(0, randomChoice) + 
                deck.substring(randomChoice + 1);

                playerSum = 0;
                for(int i = 0; i < playersHand.length(); i++)
                {
                    char playersCardsValues = playersHand.charAt(i);
                    int cardDigits = 
                        Integer.parseInt(String.valueOf(playersCardsValues));
                    playerSum += cardDigits;
                }

                if(playerSum == 21) {
                    System.out.println("Player scored 21. Player wins!");
                    System.out.println("Ending the game with the following deck: ");
                    System.out.println(deck);
                    System.exit(0);
                }
                else if(playerSum > 21) {
                    System.out.println("Player scored over 21. Player lost!");
                    System.out.println("Ending the game with the following deck: ");
                    System.out.println(deck);
                    System.exit(0);
                }
            }

            else if(hitOrStandMenu == 2) {
                System.out.println(
                    "\nStand! Player's turn is now over. Player's hand sums to " 
                    + playerSum +".");
                break;
            }
        }

        System.out.println("\nDealer is drawing cards...");
        int dealerSum = 0;
        for(;;) {
            int randomChoice = rand.nextInt(deck.length());
            char dealersCard = deck.charAt(randomChoice);
            dealersHand += dealersCard;

            deck = deck.substring(0, randomChoice) + 
            deck.substring(randomChoice + 1);
            
            System.out.println("Dealer's hand: " + dealersHand);

            dealerSum = 0;
            for(int i = 0; i < dealersHand.length(); i++) {
                char dealersCardsValues = dealersHand.charAt(i);
                int dealerCardDigits = Integer.parseInt(String.valueOf(dealersCardsValues));
                dealerSum += dealerCardDigits;
            }

            if(21 > dealerSum && dealerSum > playerSum) {
                System.out.println("Dealer scored more than player. Dealer wins!");
                System.out.println("Ending the game with the following deck: ");
                System.out.println(deck);
                break;
            }

            else if(dealerSum > 21) {
                System.out.println("Dealer scored over 21. Dealer lost!");
                System.out.println("Ending the game with the following deck: ");
                System.out.println(deck);
                break;
            }
            
            else if(dealerSum == 21) {
                System.out.println("Dealer scored 21. Dealer wins!");
                System.out.println("Ending the game with the following deck: ");
                System.out.println(deck);
                break;
            }
        }

        
    }
}