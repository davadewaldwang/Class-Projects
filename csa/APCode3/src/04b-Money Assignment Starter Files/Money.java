//Money.java
//dava dewald-wang
//This simple class consists of only 2 instance variables, containing dollars and cents values.
//It is both incomplete and incorrect.
//Your task:  Complete, fix it, and thoroughly test it in the MoneyRunner file (Main).

public class Money             
{
	static KeyboardReader reader = new KeyboardReader();

	// private instance variables
	private int myDollars;
	private int myCents;
	
	// default constructor method -- no parameters
	public Money()
	{
		myDollars = 0;
		myCents = 0;
	}
	// constructor method to input dollars and cents
	public Money(int newDollars, int newCents)
	{
		myDollars = newDollars;
		myCents = newCents;
		this.normalize();
	}

	//Accessor methods -- return the private variable values
	public int getDollars()
	{
		return myDollars;
	}
	
	public int getCents()
	{
		return myCents;
	}
	
	//  One Money parameter add method
	//  This method combines the totals in this and the parameter amount
	//Money mango = joe.add(mustard);
	public Money add(Money amount)
	{
		Money result = new Money();
		
		result.myDollars = this.myDollars + amount.myDollars;		
    	result.myCents = this.myCents + amount.myCents;
		
		result.normalize();
		return result;
	}
	// 	Two int parameter add method  -- YOU WILL ADD THIS AND MUCH MORE!!!
	//  This method gets passed dollars and cents instead of a Money object
	public Money add(int d, int c)
	{
		Money result = new Money();
		
		result.myDollars = this.myDollars + d;		
    	result.myCents = this.myCents + c;
		
		result.normalize();
		return result;
	}

	//one Money parameter subtract method
	public Money subtract(Money m)
	{
		Money result = new Money();

		result.myDollars = this.myDollars - m.myDollars;
		result.myCents = this.myCents - m.myCents;

		result.normalize();
		return result;
	}

	//two int parameter subtract method
	public Money subtract(int d, int c)
	{
		Money result = new Money();

		result.myDollars = this.myDollars - d;
		result.myCents = this.myCents - c;

		result.normalize();
		return result;
	}

	//multiply method
	public Money multiply(int f)
	{
		Money result = new Money();

		result.myDollars = this.myDollars * f;
		result.myCents = this.myCents * f;

		result.normalize();
		return result;
	}

	//This method should fix the problem of myCents > 99 or myCents < 0
	//Think carefully about which methods should call normalize()
	//COMPLETING THIS METHOD IS THE MAIN PART OF THIS ASSIGNMENT
	private void normalize()
	{
		if (this.myCents < 0)
		{
			this.myDollars += this.myCents / 100 - 1; //subtract whole dollar amount (-1 because round down)(add because negative cents)
			this.myCents = 100 + this.myCents % 100; //subtract remaining cents from 100 to get new cents
		}
		if (this.myCents > 99)
		{
			this.myDollars += this.myCents / 100; //add amount of full dollars in cents to dollars
			this.myCents %= 100; //how many cents left over
		}

		if (this.myDollars < 0) //set amount to 0 if negative
		{
			this.myDollars = 0;
			this.myCents = 0;
		}
		
	}

	//This method (sometimes incorrectly) displays the values to the screen 
	// THIS METHOD REQUIRES ONLY A SMALL MODIFICATION TO WORK PROPERLY
	public void print()
	{
		if (myCents < 10 && myCents >= 0)
			System.out.println("$" + myDollars + ".0" + myCents);
		else
			System.out.println("$" + myDollars + "." + myCents);
	}

	
	// This method (sometimes incorrectly) converts the object to a String and returns it	
	// THIS METHOD REQUIRES ONLY A SMALL MODIFICATION TO WORK PROPERLY
	public String toString()
	{
		String s1;
		if (myCents < 10 && myCents >= 0)
			s1 = "$" + myDollars + ".0" + myCents;
		else
			s1 = "$" + myDollars + "." + myCents;
		return s1;
	}

	static void SortMoney()
	{

		int n = reader.readInt("Number to sort:\t");//array size
		Money[] money = new Money[n];
		System.out.println();
		System.out.println("Enter values:");
		for (int i = 0; i < n; i++)//read in values for objects in array
		{
			int d = reader.readInt((i + 1) + ".\t$:");
			int c = reader.readInt("\t¢:");
			money[i] = new Money(d,c); //create new money object at each cell with inputted dollars and cents
		}

		Money temp = new Money();

		for (int i = 0; i < n-1; i++)//bubble sort
		{
			for (int j = 0; j < n-1 - i; i++)
			{
				if (money[i].myDollars > money[i+1].myDollars || money[i].myDollars == money[i+1].myDollars && money[i].myCents > money[i+1].myCents)
				{
					//swap values if first amount less than second
					temp = money[i];
					money[i] = money[i+1];
					money[i+1] = temp;
				}
			}
		}

		System.out.print("Sorted array:\t");
		for (int i = n-1; i >= 0; i--)
		{
			System.out.print(money[i] + " ");
		}
	}
}






