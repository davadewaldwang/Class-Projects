//dava dewald-wang

public class HeapPriorityQueue implements MaxPriorityQueue
{
    private Comparable[] heapArray;
    private int count;
    private int maxSize;

    public HeapPriorityQueue(int max)
    {
        heapArray = new Comparable[max + 1]; //array max+1 because dont use 0
        count = 0;
        maxSize = max;
    }

    public boolean add(Comparable val)
    {
        if (isFull())
        {
            System.out.println("Error: full heap");
            return false; //cant add if full
        }
        heapArray[count + 1] = val; //add to next empty cell
        count++;
        for (int i = count; i > 1; i /= 2)
        {
            if (val.compareTo(heapArray[i/2]) > 0) //if value added bigger than parent need to swap
            {
                heapArray[i] = heapArray[i/2];
                heapArray[i/2] = val;
            }
        }
        return true;
    }

    public boolean isEmpty()
    {
        return heapArray[1] == null;
    }

    public Comparable removeMax()
    {
        if (isEmpty())
        {
            System.out.println("Error: empty heap");
            return null; //cant remove from nothing
        }
        Comparable remove = heapArray[1]; //store max to return
        heapArray[1] = heapArray[count]; //place last value in max
        heapArray[count] = null; //remove max
        count--;
        //System.out.println(heapArray[1]);
        int index = 1;
        while (index <= count)
        {
            Comparable temp = heapArray[index]; //store to swap
            if (index*2+1 <= count)
            {
                if (heapArray[index*2+1].compareTo(heapArray[index*2]) > 0) //right child bigger than left child
                {
                    if (temp.compareTo(heapArray[index*2+1]) < 0) //&& temp smaller than right child
                    {  
                        heapArray[index] = heapArray[index*2+1]; //swap with right child
                        heapArray[index*2+1] = temp;
                        index = index*2+1;
                    }
                    else
                        break;
                }
                else
                if (temp.compareTo(heapArray[index*2]) < 0) //&& temp smaller than left child
                {  
                    heapArray[index] = heapArray[index*2]; //swap with left child
                    heapArray[index*2] = temp;
                    index = index*2;
                }
                else
                    break; //in proper place
            }
            else //no right child
            if (index*2 <= count && temp.compareTo(heapArray[index*2]) < 0) //if there is left child thats bigger than temp
            {
                heapArray[index] = heapArray[index*2]; //swap with left child
                heapArray[index*2] = temp;
                index *= 2;
            }
            else
                break; //in proper place
        }
        return remove;
    }

    public Comparable peekMax()
    {
        return heapArray[1]; //first value - 0 not used
    }

    public String toString()
    {
        String result = "";
        for (int i = 1; i <= count; i++)
        {
            result += heapArray[i] + " ";
        }
        return result;
    }

    public boolean isFull()
    {
        return count == maxSize;
    }

    public int getCount()
    {
        return count;
    }
}