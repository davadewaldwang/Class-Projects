/* You do not need to import anything for this assignment.  

Your SRC folder should contain four files:
1. lastname_HeapPriorityQueueRunner.java - your runner file
2. HeapPriorityQueue.java -- this is your Heap
3. MaxPriorityQueue.java -- this is an interface
4. KeyboardReader.java

You will use an array of Comparables to simulate a binary tree that is a heap.  So much fun!!!

When you have added all of the required methods, you should remove the // from line 1 of the HeapPriorityQueue so that it implements the MaxPriorityQueue interface

Good luck!
*/

public class DewaldWang_HeapPriorityQueueRunner
{
    public static void main(String[] args)
    {
        HeapPriorityQueue fatpig = new HeapPriorityQueue(8);
        fatpig.add(41);
        //fatpig.add(60);
        fatpig.add(19);
        fatpig.add(32);
        fatpig.add(10);
        fatpig.add(9);
        fatpig.add(14);
        //fatpig.add(14);
        fatpig.add(33);
        fatpig.add(10);

        System.out.println(fatpig);
        System.out.println("count: " + fatpig.getCount());
        System.out.println("max: " + fatpig.peekMax());
        System.out.println("isFull: " + fatpig.isFull());
        System.out.println("isEmpty: " + fatpig.isEmpty());
        //System.out.println("removeMax: " + fatpig.removeMax() + " hpq: " + fatpig);
        while (!fatpig.isEmpty())
        {
            System.out.println(fatpig.removeMax() + "\t " + fatpig);
            
        }

    //     HeapPriorityQueue a = new HeapPriorityQueue(30);
    //     a.add(5);
    //     a.add(6);
    //     a.add(5);
    //     a.add(7);
    //     a.add(5);
    //     a.add(4);
    //     a.add(5);
    //     a.add(3);
    //     a.add(5);
    //     a.add(1);
    //     a.add(1);
    //     a.add(1);
    //     a.add(1);
    //     a.add(2);
    //     a.add(2);
    //     a.add(2);
    //     a.add(2);
    //     System.out.println("\nSTUDENT OUTPUT:");
    //     while (!a.isEmpty() )
 	//    {
 	//      System.out.print(a.removeMax() + " ");  
 	//    }
    //     System.out.println("\n\nIf STUDENT OUTPUT above matches this:");
    //     System.out.println("7 6 5 5 5 5 5 4 3 2 2 2 2 1 1 1 1" +
    //     "\n\ngive 1/1 point.");   
    }
}
