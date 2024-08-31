import java.util.Scanner;
import java.util.*;
 
public class Main 
{
    public static void main(String[] args) 
    {
        
        String anotherCard, playAgain;
        int nextCard, card1, card2, dealerCard1, dealerCard2;
        int cardealerTotal, dealerTotal;
   
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Shall we play a game?");
        playAgain = keyboard.next();
      
     
      
     
      do
      {
        cardealerTotal = 0;
        dealerTotal = 0;
         
         dealerCard1 = random.nextInt(10) + 1;
         dealerCard2 = random.nextInt(10) + 1;
         dealerTotal = dealerCard1 + dealerCard2;
          
         
         card1 = random.nextInt(10) + 1;
         card2 = random.nextInt(10) + 1;
         cardealerTotal = card1 + card2;
          

         System.out.println("Dealer shows: " + dealerCard1);
         System.out.println("First Cards: " + card1 + ", " + card2);
         System.out.println("Total: "+ cardealerTotal);
         System.out.println("Another Card (y/n)?: ");
         anotherCard = keyboard.next();
          
         while ("y".equals(anotherCard))
            {
             nextCard = random.nextInt(10) + 1;
             cardealerTotal += nextCard;
             System.out.println("Card: " + nextCard);
             System.out.println("Total: " + cardealerTotal);
              
             if (cardealerTotal > 21)
             {
             System.out.println("You busted, Dealer wins");
             System.out.println("Wanna play again? (y/n):");
             playAgain = keyboard.next();
             cardealerTotal = 0;
             dealerTotal = 0;
             dealerCard1 = random.nextInt(10) + 1;
             dealerCard2 = random.nextInt(10) + 1;
             dealerTotal = dealerCard1 + dealerCard2;
             card1 = random.nextInt(10) + 1;
             card2 = random.nextInt(10) + 1;
             cardealerTotal = card1 + card2;
             System.out.println("Dealer shows: " + dealerCard1);
             System.out.println("First Cards: " + card1 + ", " + card2);
             System.out.println("Total: "+ cardealerTotal);
             
             }
             
             if (cardealerTotal == 21)
             {
                 System.out.println("You win");
                 break;
             }
              
             if (cardealerTotal < 21)
             {
                System.out.println("Another Card (y/n)?: ");
                anotherCard = keyboard.next();
             }
             
            }  
            if(cardealerTotal==21)
            {
                break;
            }
             
            while ("n".equals(anotherCard))
            {
                System.out.println("Dealer had: " + dealerTotal);
                System.out.println("You had: " + cardealerTotal);    
                 
                if (dealerTotal < cardealerTotal && cardealerTotal < 21)
                {
                    System.out.println("Yay you win!");
                     
                }   
                     
                if (dealerTotal > cardealerTotal && dealerTotal < 21)
                {
                    System.out.println("You lose!");
                }
                    
                System.out.println("Play again? (y/n)");
                playAgain = keyboard.next();
                    
                if(playAgain.equalsIgnoreCase("y"))
                {
                    anotherCard = "";
                }
            }  
      }
        while (playAgain.equals("y"));
    }
}