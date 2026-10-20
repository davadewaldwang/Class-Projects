import java.util.LinkedList;

// dava dewald-wang
// StackList.java
// Write your own Stack using a LinkedList as the private variable

public class StackList<E>
{ 
    private LinkedList<E> list;
    
    public StackList()
    {
        list = new LinkedList<>(); 
    }

    public void push (E x)
    {
        list.addLast(x);
    }

    public E pop()
    {
        return list.removeLast();
    }

    public E peek()
    {
        return list.getLast();
    }

    public boolean isEmpty()
    {
        return (list.size() == 0);
    }
}