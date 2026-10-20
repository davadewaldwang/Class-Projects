//McKeen --
//HeapProjectTestingMcKeen
//Runner file for Testing Heap assignment
public class HeapProjectTestingMcKeen
{
  public static void main(String[]args)
  {
    KeyboardReader reader = new KeyboardReader();
    int casenum = 1;
    int selection = 0;
    MaxPriorityQueue h;
    MaxPriorityQueue a;
    boolean banswer;
    
    do
    { 
      // These options are for the Heap Assignment    
      System.out.println("\n\n\n################################################");
      System.out.println("Welcome to the Heap Assignment Test Cases Menu");
      System.out.println("\n1.) Test Group A"+ 
      "\n2.) Test Group B"+
      "\n3.) Test Group C"+
      "\n4.) Test Group D"+
      "\n\n0.) Exit ");
      System.out.println("################################################");
      selection = reader.readInt("Enter a selection: ");
      
/////////////////////////////////////////////////////////////////////////////////////////////////
      //Test Cases -- Group A       
      if (selection == 1)
      {
    
        casenum = 1;
        h = new HeapPriorityQueue(3);
        //Case One
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- add 10, 20, 15 on a 3 element Heap:");
    
    //    System.out.println("\tAdding 10");
        h.add(10);   // removed deprecated h.add(new Integer(10))
    //    System.out.println(h);
    
    //    System.out.println("\tAdding 20");
        h.add(20);
    //    System.out.println(h);
    
    //    System.out.println("\tAdding 15");
        h.add(15);
        System.out.println("\nSTUDENT OUTPUT:");
        System.out.println(h);
        
        System.out.println("\nIf STUDENT OUTPUT is in EXACTLY this sequence \n20, 10, 15");
        System.out.println("give 0.5/0.5 point.");
        casenum++;
        reader.pause();
        
        //Case Two
        casenum = 2;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Automatically attempting to add past the end of the Heap\n");
        System.out.println("The program used the boolean result of the add method.\n");
        banswer = h.add(4);
        System.out.println("\nPLEASE RECORD THE FOLLOWING GRADE:\n\n");
        if (!banswer)
        {
          System.out.println("\n\nAUTO: Test passed for 0.5/0.5 point.");
          System.out.println("(There is probably also an error message stating that the heap is full.) ");
        }
        else
          System.out.println("AUTO: Test failed for 0/0.5 point");
          
        casenum++;
        reader.pause();
    
        //Case Three
        casenum = 3;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Automatically checking if the heap is full (when it is)\n");
        System.out.println("The program used the boolean result of the isFull method.\n");
        System.out.println("PLEASE RECORD THE FOLLOWING GRADE:");
        if (h.isFull() )
          System.out.println("AUTO: Test passed for 1/1 point");
        else
          System.out.println("AUTO: Test failed for 0/1 point");
        casenum++;
        reader.pause();
    
        //Case Four
        casenum = 4;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Removing all three elements from the Heap");
        System.out.println("\nSTUDENT OUTPUT:");
        System.out.println("First element removed:  " + h.removeMax());
        System.out.println("Second element removed:  " + h.removeMax());
        System.out.println("Third element removed:  " + h.removeMax());
        System.out.println("\nIf STUDENT OUTPUT shows removal in this sequence:");
        System.out.println("First element removed:  20" );
        System.out.println("Second element removed:  15");
        System.out.println("Third element removed:  10");
        System.out.println("give 1/1 point.");
        casenum++;
        reader.pause();
    
        //Case Five
        casenum = 5;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Trying to remove from an empty heap");
        System.out.println("\nSTUDENT OUTPUT:");
        System.out.println(h.removeMax());
        System.out.println("\nIf STUDENT OUTPUT shows a warning that the heap is empty followed by a null");
        System.out.println("give 1/1 point.");
        casenum++;
        reader.pause();
    
        //Case Six
        casenum = 6;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Automatically Testing isEmpty\n");
        System.out.println("The program used the boolean result of the isEmpty method.\n");
        System.out.println("PLEASE RECORD THE FOLLOWING GRADE:");       
        if (h.isEmpty())
          System.out.println("AUTO: Test passed for 1/1 point.");
        else
          System.out.println("AUTO: Test failed for 0/1 point");
        casenum++;
        reader.pause();
      }
/////////////////////////////////////////////////////////////////////////////////////////////////
      else if (selection == 2)
      {
        casenum = 7;
        //Case Seven
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a new nine element heap");
        a = new HeapPriorityQueue(9);
        a.add(20);
        a.add(10);
        a.add(15);
        a.add(14);
        a.add(40);
        a.add(30);
        a.add(50);
        a.add(15);
        a.add(45);
        System.out.println("Nine elements were added:  20, 10, 15, 14, 40, 30, 50, 15, 45.");
        System.out.println("\nIf STUDENT OUTPUT above gives no error messages");
        System.out.println("give 1/1 point.");
        casenum++;
        reader.pause();
    
        
        //Case 8
        casenum = 8;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Cases 8a and 8b");
        System.out.println("********");
        System.out.println("Test -- Removing two values");
        System.out.println("\nSTUDENT OUTPUT:");
        System.out.println("First element removed: "+ a.removeMax());   
 	   System.out.println("Second element removed: "+ a.removeMax());  
        System.out.println("\nIf STUDENT OUTPUT shows:");
        System.out.println("First element removed:  50    give 1/1 point for 8a");
        System.out.println("Second element removed:  45    give 1/1 point for 8b");
        casenum++;
        reader.pause();
      
        //Case 9
        casenum = 9;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Retesting isFull (when the heap is NOT full)");
        System.out.println("\nRECORD THE FOLLOWING GRADE:");
        if (a.isFull() )
          System.out.println("AUTO: Test failed for 0/1 point");
        else
          System.out.println("AUTO: Test passed for 1/1 point");
        casenum++;
        reader.pause();
        
        //Case 10
        casenum = 10;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Retesting isEmpty (when the heap is NOT empty)");
        System.out.println("\nRECORD THE FOLLOWING GRADE:");
        if (a.isEmpty() )
          System.out.println("AUTO: Test failed for 0/1 point");
        else
          System.out.println("AUTO: Test passed for 1/1 point");
        casenum++;
        reader.pause();
    
        //Case 11
        casenum = 11;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Removing remaining items and retesting isEmpty (until the heap is empty)");
        System.out.println("\nSTUDENT OUTPUT:");
 	   System.out.println("Removed: ");  
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above is in this sequence:");
        System.out.println("40 30 20 15 15 14 10" +
        " \ngive 1/1 point.");   
        casenum++;
        reader.pause();
      }
/////////////////////////////////////////////////////////////////////////////////////////////////
      else if (selection == 3)
      {
        casenum = 12;
        //Case 12
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a heap made up of 10 identical String values");
        a = new HeapPriorityQueue(10);
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        a.add("X");
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        System.out.println("X X X X X X X X X X" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
    
        
        //Case 13
        casenum = 13;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a 10 element heap entered from smallest to largest");
        a = new HeapPriorityQueue(10);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        System.out.println("10 9 8 7 6 5 4 3 2 1" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
    
    
        //Case 14
        casenum = 14;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a 10 element heap entered from largest to smallest");
        a = new HeapPriorityQueue(10);
        a.add(10);
        a.add(9);
        a.add(8);
        a.add(7);
        a.add(6);
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        System.out.println("10 9 8 7 6 5 4 3 2 1" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
        
        //Case 15
        casenum = 15;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a 1 element heap");
        a = new HeapPriorityQueue(1);
        a.add(7.777);
 
        banswer = a.add(8.888);
        System.out.println("\n\n\nSTUDENT OUTPUT:");
 	   System.out.print("1. ");
 	   System.out.println(banswer);  
 	   System.out.println("2. " + a.removeMax() + " ");  
 	   System.out.print("3. ");
        a.removeMax();
        
        System.out.println("\nSTUDENT OUTPUT above should be:");
        System.out.println("1.  false");
        System.out.println("2.  7.777");
        System.out.println("3.  An error message stating that the heap is empty");
        
        System.out.println("If so, give 1/1 point.");    
        casenum++;
        reader.pause();
        
        //Case 16
        casenum = 16;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a 5 element heap with only two unique values");
        a = new HeapPriorityQueue(5);
        a.add(7);
        a.add(9);
        a.add(7);
        a.add(9);
        a.add(7);
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        System.out.println("9 9 7 7 7" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
 
        //Case 17
        casenum = 17;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Testing a 100 element heap with a mix of values");
        a = new HeapPriorityQueue(100);
        a.add(5);
        a.add(6);
        a.add(5);
        a.add(7);
        a.add(5);
        a.add(4);
        a.add(5);
        a.add(3);
        a.add(5);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        System.out.println("7 6 5 5 5 5 5 4 3 2 2 2 2 1 1 1 1" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
      }
/////////////////////////////////////////////////////////////////////////////////////////////////
      else if (selection == 4)
      {
        casenum = 18;
        //Case 18
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Inserting 25 consecutive descending values into a size 50 heap");
        a = new HeapPriorityQueue(50);
        for (int i = 25; i >= 1; i--)
        {
          a.add(i);
        }
        
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        for (int i = 25; i >= 1; i--)
        {
          System.out.print(i + " ");
        }
        System.out.println("" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
 
        //Case 19
        casenum = 19;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Inserting 25 consecutive ascending values into a size 50 heap");
        a = new HeapPriorityQueue(50);
        for (int i = 1; i <= 25; i++)
        {
          a.add(i);
        }
        
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        for (int i = 25; i >= 1; i--)
        {
          System.out.print(i + " ");
        }
        System.out.println("" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
 
        //Case 20
        casenum = 20;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Inserting 24 consecutive ascending values with duplicates into a size 50 heap");
        a = new HeapPriorityQueue(50);
        for (int i = 1; i <= 8; i++)
        {
          for (int j = 1; j <= 3; j++)
            a.add(i);
        }
        
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        for (int i = 8; i >= 1; i--)
        {
          for (int j = 1; j <= 3; j++)
            System.out.print(i + " ");
        }
        System.out.println("" +
        "\n\ngive 1/1 point.");    
        casenum++;
        reader.pause();
 
        //Case 21
        casenum = 21;
        System.out.println("\n\n\n\n\n********");
        System.out.println("Case " + casenum );
        System.out.println("********");
        System.out.println("Test -- Inserting 24 consecutive descending values with duplicates into a size 50 heap");
        a = new HeapPriorityQueue(50);
        for (int i = 8; i >= 1; i--)
        {
          for (int j = 1; j <= 3; j++)
            a.add(i);
        }
        
        System.out.println("\nSTUDENT OUTPUT:");
        while (!a.isEmpty() )
 	   {
 	     System.out.print(a.removeMax() + " ");  
 	   }
        System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
        for (int i = 8; i >= 1; i--)
        {
          for (int j = 1; j <= 3; j++)
            System.out.print(i + " ");
        }
        System.out.println("" +
        "\n\ngive 1/1 point.");    
        reader.pause();
        
				//Case 22 - INDEPENDENT CASE
				casenum = 22;
				System.out.println("\n\n\n\n\n********");
				System.out.println("Case " + casenum );
				System.out.println("********");
				System.out.println("Test -- Testing toString and Efficiency");
				a = new HeapPriorityQueue(50);
	
				a.add(20);
				a.add(10);
				a.add(19);
				a.add(5);
				a.add(9);
				a.add(18);
				a.add(18);
				
				
				System.out.println("\nSTUDENT OUTPUT:");
				System.out.println(a);

				System.out.println("\n\nIf STUDENT OUTPUT above matches this sequence:");
				System.out.println("20, 10, 19, 5, 9, 18, 18");
				System.out.println("Commas and formatting do NOT matter.");

				System.out.println("" +
				"\n\ngive 1/1 points.");		
				casenum++;
				reader.pause();

 				//Case 23 - INDEPENDENT CASE
				casenum = 23;
				System.out.println("\n\n\n\n\n********");
				System.out.println("Case " + casenum );
				System.out.println("********");
				System.out.println("Test -- Testing comma placement");
				a = new HeapPriorityQueue(50);
	
				a.add(5);
				a.add(4);
				a.add(3);
				a.add(2);
				a.add(1);

				
				
				System.out.println("\nSTUDENT OUTPUT:");
				System.out.println(a);

				System.out.println("\n\nIf STUDENT OUTPUT above matches this sequence:");
				System.out.println("5, 4, 3, 2, 1");
				System.out.println("and only has commas BETWEEN the numbers.");

				System.out.println("" +
				"\n\ngive 1/1 points.");		
				casenum++;
				reader.pause();
       
      }
/////////////////////////////////////////////////////////////////////////////////////////////////
      else if (selection == 0)
      {
      
        System.out.println("\n\n\nThank you for testing with Mr. McKeen's automated test program.");
        System.out.println("I hope that it has been at least as enjoyable for you to use \nas it was for him to write.");
        System.out.println("\n\nPlease complete the final items on the grading sheet.");
        System.out.println("Do not forget to write a good Grader's Comparison. Brag a little. Or concede defeat.  \n\n");
      }
    }while (selection != 0);  // end of while loop
  }
}
 
 



