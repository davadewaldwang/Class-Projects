// You will need to add your QueueList class to the folder that contains this files
// Write your war game in a file entitled lastname_WarGameRunner.java

import java.util.ArrayList;

public class WarGame { 
    
    public static void generateDecks(int deckSize, QueueList<Integer> deck1, QueueList<Integer> deck2)
    {
    	// Make sure the deckSize is a multiple of four
    	deckSize = (deckSize / 4) * 4;
    	
    	// Create the entire deck and fill it with the four suits
    	ArrayList<Integer> bigDeck = new ArrayList<Integer>();
    	for (int i = 0; i < deckSize; i++)
    		bigDeck.add(i % (deckSize / 4));
    	
      // Deal the cards
      while (!bigDeck.isEmpty())
      {
        deck1.add(bigDeck.remove((int)(Math.random()*bigDeck.size())));
        deck2.add(bigDeck.remove((int)(Math.random()*bigDeck.size())));
      }
    }
}