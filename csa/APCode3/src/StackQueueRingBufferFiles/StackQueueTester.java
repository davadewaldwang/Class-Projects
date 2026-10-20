
//dava dewald-wang
//StackQueueTester
//In this file, you will write the methods that will thoroughly test your StackList and QueueList

// My recommendation:  Uncomment them ONE AT A TIME, write that method and test it in your StackQueueTesterRunner.java runner before starting the next method


public class StackQueueTester
{


	public String stringDump(QueueList<String> q)
	{
		String result = "";
		while (!q.isEmpty())
			result += q.remove() + " "; //add removed value to result
		if (result.length() > 0)
			result = result.substring(0, result.length() - 1); //remove last space
		return result;
	}
	
	public String stringDump(StackList<String> s)
	{
		String result = "";
		while (!s.isEmpty() && s.peek() != null)
			result += s.pop() + " "; //add popped value to result
		if (result.length() > 0)
			result = result.substring(0, result.length() - 1); //remove last space
		return result;
	}

	public void removeName(QueueList<String> q, String name)
	{
        QueueList<String> temp = new QueueList<>();
		while (!q.isEmpty())
		{
            if (!q.peek().equals(name))
                temp.add(q.remove()); //add value to temp queue if not to be removed
            else
                q.remove(); //remove if equal
		}

        while (!temp.isEmpty())
        {
            q.add(temp.remove()); //add values back into q
        }
	}
	
	public boolean stackSearch(StackList<String> s, String name)
	{
		boolean result = false;
		StackList<String> temp = new StackList<>();
		while (!s.isEmpty())
		{
			temp.push(s.pop()); //put each value from s into temp
			if (temp.peek().equals(name))
				result = true; //if last value put in = name then return true
		}
		while (!temp.isEmpty()) //after puttin values back into s
		{
			s.push(temp.pop());
		}
		return result;
	}

	public QueueList<String> splitString(String s)
	{
		QueueList<String> result = new QueueList<>();
		String[] words = s.split(" "); //array of each word in s
		for (String n : words)
		{
			if (n.indexOf(".") != -1) //if there is period
			{
				String word = "";
				for ( int i = 0; i < n.length(); i++)
				{
					if (n.charAt(i) != '.') //only add if not a period
						word += n.charAt(i);
				}
				result.add(word);
			}
			else
				result.add(n); //add each word to result
		}
		return result;
	}
	
	public QueueList<String> longestWords(QueueList<String> q)
	{
		QueueList<String> result = new QueueList<>();
		QueueList<String> temp = new QueueList<>();
		int biggest = q.peek().length(); //default biggest as length of first string
		while (!q.isEmpty())
		{
			if (q.peek().length() >= biggest)
				biggest = q.peek().length(); //find length biggest string in q
			temp.add(q.remove());
		}
		while (!temp.isEmpty())
		{
			if (temp.peek().length() == biggest)
				result.add(temp.peek()); //add string to result if its as long as biggest string
			q.add(temp.remove()); //add back to q
		}
		return result;
	}
	//public StackList<String> findDuplicates(StackList<String> s, QueueList<String> q)	{	} //BONUS
}