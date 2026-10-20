import java.security.Key;
import java.util.Queue;

public class DewaldWang_WarGameRunner
{
    public static void main(String[] args)
    {
        KeyboardReader reader = new KeyboardReader();
        // int selection;
        // System.out.println("Select one:\n");
        // System.out.println("1. ")
        WarGame war = new WarGame();
        QueueList<Integer> player1 = new QueueList<>();
        QueueList<Integer> player2 = new QueueList<>();
        war.generateDecks(12, player1, player2); //shuffle cards to player 1 and 2

        int turns = 0; //turn counter
        int pileCount = 0;
        StackList<Integer> pile = new StackList<>();

        while (!player1.isEmpty() && !player2.isEmpty())
        {
            displayHand(player2);
            displayHand(player1);
            System.out.println();
            System.out.println("P1:\t" + player1.peek());
            System.out.println("P2:\t" + player2.peek());
            if (player1.peek().equals(player2.peek()))
            {
                System.out.println("WAR!!!");
                //reader.pause();

                for (int i = 0; i < 4 && !player1.isEmpty() && !player2.isEmpty(); i++)
                {
                    if (player1.isEmpty() || player2.isEmpty())
                        break;
                    pile.push(player1.remove());
                    //System.out.print("\t" + pile.peek());
                    pile.push(player2.remove());
                    //System.out.print("\t" + pile.peek());
                    pileCount += 2;
                }
                System.out.println("Pile count:\t" + pileCount);
            } 
            else if (player1.peek() > player2.peek())
            {
                pile.push(player1.remove());
                pile.push(player2.remove());
                while (!pile.isEmpty())
                    player1.add(pile.pop());
                System.out.println("Player 1 wins");
                turns++;
                pileCount = 0;
            }
            else if (player2.peek() > player1.peek())
            {
                pile.push(player1.remove());
                pile.push(player2.remove());
                while (!pile.isEmpty())
                    player2.add(pile.pop());
                System.out.println("Player 2 wins");
                turns++;
                pileCount = 0;
            }
            System.out.println("\nP1 hand count:\t" + handCount(player1));
            System.out.println("P2 hand count:\t" + handCount(player2));
            System.out.println("Turns:\t" + turns);
            reader.pause();
        }

        if (player1.isEmpty())
            System.out.println("Game Over\nPlayer 2 wins");
        else
            System.out.println("Game Over\nPlayer 1 wins");
    }

    public static int handCount(QueueList<Integer> deck)
    {
        int result = 0;
        QueueList<Integer> temp = new QueueList<>();
        while (!deck.isEmpty())
        {
            temp.add(deck.remove());
            result++;
        }
        while (!temp.isEmpty())
            deck.add(temp.remove());
        return result;
    }

    public static void displayHand(QueueList<Integer> hand)
    {
        QueueList<Integer> temp = new QueueList<>();
        int val = 0;
        while (!hand.isEmpty())
        {
            val = hand.remove();
            System.out.print(val + " ");
            temp.add(val);
        }
        while (!temp.isEmpty())
            hand.add(temp.remove());
        System.out.println();
    }
}
