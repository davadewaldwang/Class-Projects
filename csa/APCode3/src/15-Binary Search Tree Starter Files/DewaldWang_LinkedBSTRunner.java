import java.util.List;
import java.util.ArrayList;

/*  

Your repl should contain four files:
1. lastname_LinkedBSTRunner.java - your runner file
2. TreeNode.java
3. LinkedBST.java ** This is your Binary Search Tree
4. KeyboardReader.java

This assignment is VERY similar to AnimalList.  You should spend some time looking at your AnimalList class before you start.

Good luck!
*/

class DewaldWang_LinkedBSTRunner 
{
    public static void main(String[] args) 
    {
        KeyboardReader reader = new KeyboardReader();
        int selection = 0;
        LinkedBST soImABoss = new LinkedBST();
        while (selection != 99)
        {
            System.out.println();
            System.out.println("1. add node");
            System.out.println("2. preorder traverse");
            System.out.println("3. inorder traverse");
            System.out.println("4. postorder traverse");
            System.out.println("5. delete node");
            System.out.println("6. search");
            System.out.println("7. count leaves");
            System.out.println("8. path length");
            System.out.println("9. count nodes");
            System.out.println("42. hard coded tree");
            System.out.println("99. Automated Tests Cases");
            System.out.println("0. quit");
            selection = reader.readInt("Selection:\t");
            System.out.println();
            if (selection == 1)
            {
                if (soImABoss.addNode(reader.readLine("Value:\t")))
                    System.out.println("Successfully added");
                else
                    System.out.println("Unsuccessfully added: duplicate value");
            }
            else if (selection == 2)
            {
                System.out.println(soImABoss.preOrder());
            }
            else if (selection == 3)
            {
                System.out.println(soImABoss.inOrder());
            }
            else if (selection == 4)
            {
                System.out.println(soImABoss.postOrder());
            }
            else if (selection == 5)
            {
               System.out.println(soImABoss.deleteNode(reader.readLine("Value to delete:\t")));
            }
            else if (selection == 6)
            {
                if (soImABoss.search(reader.readLine("Value to search:\t")))
                    System.out.println("Found");
                else
                    System.out.println("Not in tree");
            }
            else if (selection == 7)
            {
                System.out.println(soImABoss.countLeaf());
            }
            else if (selection == 8)
            {
                System.out.println(soImABoss.pathLength(reader.readLine("Value to cound to:\t")));
            }
            else if (selection == 9)
            {
                System.out.println(soImABoss.countNode());
            }
            else if (selection == 42)
            {
                soImABoss.addNode("5");
                soImABoss.addNode("2");
                soImABoss.addNode("4");
                soImABoss.addNode("7");
                soImABoss.addNode("1");
                soImABoss.addNode("9");
                //System.out.println(soImABoss.deleteNode(24));
                //System.out.println(soImABoss.preOrder());
            }
            else if (selection == 99)
            {
// PASTE ALL OF THIS CODE INTO YOUR OPTION 99
KeyboardReader reader1 = new KeyboardReader();
LinkedBST treeterter;
int selection1;
int casenum;
boolean result = false; // records addNode return
boolean result1 = false;
boolean result2 = false;
List answerTree;

do
{ 
  // These options are for Part III -- delete and recursive methods   
  System.out.println("Welcome to the LinkedBST Automated Test Cases Sub Menu");
  System.out.println("\n1.) Test Group A -- Removing leaves"+
  "\n2.) Test Group B -- Removing root node from small trees"+
  "\n3.) Test Group C -- More complex trees"+
  "\n0.) Exit ");
  selection1 = reader1.readInt("Enter a selection: ");
  
  //Test Cases -- Group A       
  if (selection1 == 1)
  {
    treeterter = new LinkedBST();
    casenum = 1;  //used to increment the case number
    //Test Cases -- Group A       
    System.out.println("Test Group A\n\n");
            
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Add 10, 5, 15, 3, 6, 12, 20 to an empty tree and delete 3 ***\n");
    treeterter.addNode(10);
    treeterter.addNode(5);
    treeterter.addNode(15);
    treeterter.addNode(3);
    treeterter.addNode(6);
    treeterter.addNode(12);
    treeterter.addNode(20);
    treeterter.deleteNode(3);


    System.out.println("The CORRECT display is: \n[5, 6, 10, 12, 15, 20]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    //casenum++;
    
    //2
    casenum = 2;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** delete 6 from the same tree ***\n");
    treeterter.deleteNode(6);


    System.out.println("The CORRECT display is: \n[5, 10, 12, 15, 20]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    
    //3
    casenum = 3;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** delete 12 from the same tree ***\n");
    treeterter.deleteNode(12);


    System.out.println("The CORRECT display is: \n[5, 10, 15, 20]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;


    //4
    casenum = 4;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** delete 20 from the same tree ***\n");
    treeterter.deleteNode(20);


    System.out.println("The CORRECT display is: \n[5, 10, 15]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;




    //5
    casenum = 5;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** delete 5 from the same tree ***\n");
    treeterter.deleteNode(5);


    System.out.println("The CORRECT display is: \n[10, 15]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;


    //6
    casenum = 6;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** delete 15 from the same tree ***\n");
    treeterter.deleteNode(15);


    System.out.println("The CORRECT display is: \n[10]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;


    //7
    casenum = 7;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** delete 10 from the same tree ***\n");
    treeterter.deleteNode(10);


    System.out.println("The CORRECT display is: \n[]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
  }
  //Test Cases -- Group B       
  else if (selection1 == 2)
  {
    treeterter = new LinkedBST();
    casenum = 1;  //used to increment the case number
    //Test Cases -- Group B       
    System.out.println("Test Group B\n\n");
            
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Add 10 to an empty tree and delete 10 ***\n");
    result1 = treeterter.addNode(10);
    result2 = treeterter.deleteNode(10);


    System.out.println("The CORRECT display is: \ntrue true []\n");
    System.out.println("The STUDENT's display is: \n" + result1 + " " + result2 + " " + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    
    //2
    casenum = 2;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 5, 15 to the tree and deleting 5***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(5);
    treeterter.addNode(15);
    treeterter.deleteNode(5);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[10, 15]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    
    //3
    casenum = 3;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 5, 15 to the tree and deleting 15***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(5);
    treeterter.addNode(15);
    treeterter.deleteNode(15);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[5, 10]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "


              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;


    //4
    casenum = 4;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 5, 15 to the tree and deleting 10***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(5);
    treeterter.addNode(15);
    treeterter.deleteNode(10);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[5, 15]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    //5
    casenum = 5;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 5, to the tree and deleting 10***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(5);
    treeterter.deleteNode(10);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[5]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    //6
    casenum = 6;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 5, to the tree and deleting 5***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(5);
    treeterter.deleteNode(5);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[10]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    
    //7
    casenum = 7;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 15, to the tree and deleting 10***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(15);
    treeterter.deleteNode(10);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[15]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    //8
    casenum = 8;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 10, 15, to the tree and deleting 15***\n");
    treeterter = new LinkedBST();
    treeterter.addNode(10);
    treeterter.addNode(15);
    treeterter.deleteNode(15);
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[10]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give .5/.5 point.\n\n");
    reader1.pause();
    casenum++;
    //2  When done




  }
  //Test Cases -- Group C       
  else if (selection1 == 3)
  {
    treeterter = new LinkedBST();
    casenum = 1;  //used to increment the case number
    //Test Cases -- Group C       
    System.out.println("Test Group C\n\n");
            
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Nasty test cases ***\n");
    System.out.println("*** Add 1, 0, 9, 7, 3, 8, 2, 4, 6, 5 to an empty tree and countLeaf ***\n");
    treeterter.addNode(1);
    treeterter.addNode(0);
    treeterter.addNode(9);
    treeterter.addNode(7);
    treeterter.addNode(3);
    treeterter.addNode(8);
    treeterter.addNode(2);
    treeterter.addNode(4);
    treeterter.addNode(6);
    treeterter.addNode(5);


    System.out.println("The CORRECT display is: \n4\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.countLeaf()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;
    
    //2
    casenum = 2;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Nasty test cases ***\n");
    System.out.println("*** Add 1, 0, 9, 7, 3, 8, 2, 4, 6, 5 to an empty tree and delete 7 ***\n");
    treeterter.deleteNode(7);


    System.out.println("The CORRECT display is: \n[0, 1, 2, 3, 4, 5, 6, 8, 9]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;
    
    //3
    casenum = 3;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Nasty test cases ***\n");
    System.out.println("*** delete 9 ***\n");


    treeterter.deleteNode(9);


    System.out.println("The CORRECT display is: \n[0, 1, 2, 3, 4, 5, 6, 8]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;


    //4
    casenum = 4;
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Nasty test cases ***\n");
    System.out.println("*** delete 3 ***\n");


    treeterter.deleteNode(3);


    System.out.println("The CORRECT display is: \n[0, 1, 2, 4, 5, 6, 8]\n");
    System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;
  }
  //Test Cases -- Old Group A
  //Part I and II
  else if (selection1 == 11)
  {
    treeterter = new LinkedBST();
    casenum = 1;  //used to increment the case number
    //Test Cases -- Group A       
    System.out.println("Test Group A\n\n");
            
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 5 to an empty tree ***\n");
    result = treeterter.addNode(5);


    System.out.println("The CORRECT display is: \ntrue\n");
    System.out.println("The STUDENT's display is: \n" + result + "\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;
    
    //2
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Adding 3, 4, 2, and 7 to the tree ***\n");
    if(treeterter.addNode(3))
      System.out.println("3 was successfully added.");
    if(treeterter.addNode(4))
      System.out.println("4 was successfully added.");
    if(treeterter.addNode(2))
      System.out.println("2 was successfully added.");
    if(treeterter.addNode(7))
      System.out.println("7 was successfully added.");


    System.out.println("\nCase " + casenum + ": If 3, 4, 2, and 7 were successfully added, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;
    
    //3
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Displaying preOrder ***\n");
    answerTree = treeterter.preOrder();


    System.out.println("The CORRECT display is:   \t[5, 3, 2, 4, 7]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;
    
    //4
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Displaying inOrder ***\n");
    answerTree = treeterter.inOrder();


    System.out.println("The CORRECT display is:   \t[2, 3, 4, 5, 7]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;


    //5
    System.out.println("\nCASE " + casenum + ": ");
    System.out.println("*** Displaying postOrder ***\n");
    answerTree = treeterter.postOrder();


    System.out.println("The CORRECT display is:   \t[2, 4, 3, 7, 5]\n");
    System.out.println("The STUDENT's display is: \t" + answerTree + "\n");


    System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
              + "give 1/1 point.\n\n");
    reader1.pause();
    casenum++;


  }
  else if (selection1 == 0)
  {
    //When done
    System.out.print("\nI hope that this has been a pleasant testing experience.\n");
    System.out.print("\nCongratulations on creating your first Binary Search Tree!\n");
    System.out.print("\nThis program will terminate when you ");
    reader1.pause();
    System.exit(0);


    
  }     
}while (selection1 != 0);


            }
            else if (selection == 0)
                break;
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}