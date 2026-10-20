// dava dewald-wang
// RingBufferQueue.java
// Write this class LAST.  Use your RingBufferQueue FRQ to complete this class 

public class RingBufferQueue
{ 
	private char[] characters;
	private int front;
	private int rear;	

	public RingBufferQueue(int capacity)
	{ 
		characters = new char[capacity + 1];
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
		
	public void flush()
	{
		front = rear;
	}

	public  boolean add(char ch)
	{
		if (front - rear == 1 || rear - front == characters.length - 1) //check if full
			return false;
		characters[rear] = ch;
		rear++;
		if (rear == characters.length)
			rear = 0;
		return true;
	}

	public char remove()
	{
		if (isEmpty())
			return ' ';
		char result = characters[front]; //char to be removed
		if (front == characters.length - 1) //check if front is in last slot
		{
			front = 0;
			return result;
		}
		front++;
		return result;
	}

	public char peek()
	{
		if (isEmpty())
			return '!';
		return characters[front];
	}

	public int getFront()
	{
		return front;
	}

	public int getRear()
	{
		return rear;
	}
}