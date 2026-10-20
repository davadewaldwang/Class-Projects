import java.util.ArrayList;

// FamilyMapRunner
// PUT BOTH OF YOUR NAMES RIGHT HERE:
//
// Playing with a map

// This runner DOES NOT NEED TO BE CHANGED.  
// If you have completed FamilyMap.java correctly,
// this should allow two team members to enter
// their family information into the map
// and display the map to the screen.

public class FamilyMapRunner{
	
	public static void main(String [] args)
	{
		FamilyMap family = new FamilyMap(); 
				
		family.addFamily();
		family.addFamily();
		
		family.showAll();
		

	}
}