//dava dewald-wang

public class AnimalList
{
    //instance variables
    private ListNode head;
    private int numAddRemove;

    //constructor
    public AnimalList()
    {
        head = null;
        numAddRemove = 0;
    }

    public void addAnimal(Comparable addValue)
    {
        if (head == null) //if list is empty new animal is head
        {
            head = new ListNode(addValue, null);
            numAddRemove++;
        }
        else
        {
            ListNode current = head;
            while (current != null)
            {
                if (addValue.compareTo(current.getValue()) > 0) //if addValue is lexicographically larger than current value
                {
                    if (current.getNext() != null && addValue.compareTo(current.getNext().getValue()) > 0) //and larger than next value
                    {
                        current = current.getNext(); //value not where it should be so keep iterating
                        continue;
                    }
                    //and if smaller than next value insert in between current and current's next
                    current.setNext(new ListNode(addValue, current.getNext()));
                    numAddRemove++;
                    break;
                }
                //if addValue is smaller than current value insert before current which will only occur at head
                head = new ListNode(addValue, current);
                numAddRemove++;
                break;
            }
            
        }
    }

    public boolean removeAnimal(Comparable searchValue)
    {
        if (head == null) //nothing to search
            return false;
        if (head.getValue().equals(searchValue))
        {
            head = head.getNext(); //new head of list is now old head's next
            numAddRemove++;
            return true;
        }
        ListNode current = head.getNext(); //since already checked head, can start at 2nd node
        ListNode previous = head;
        while (current != null)
        {
            if (current.getValue().equals(searchValue))
            {
                previous.setNext(current.getNext()); //remove current
                numAddRemove++;
                return true;
            }
            current = current.getNext(); //move to next node
            previous = previous.getNext();
        }
        return false;
    }

    public void displayList()
    {
        ListNode current = head;
        while (current != null)
        {
            System.out.println(current.getValue());
            current = (current.getNext()); //move to next node
        }
    }

    public int getnumAddRemove()
    {
        return numAddRemove;
    }
}