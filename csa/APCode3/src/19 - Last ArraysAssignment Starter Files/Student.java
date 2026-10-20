// You should make only ONE VERY SMALL CHANGE to this class so that it
// properly keeps track of the total number of Student objects
// that have been created.
// You should make NO OTHER CHANGES after that.

public class Student  
{
	private String name;
	private int daysAbsent;
	private double gpa;
	
	private static int numStudentsCreated=0;
	
	//precondition: the constructor parameters will always be valid
	public Student(String n, int da, double g) // constructor initializes the instance variable.
	{
		name = n;
		daysAbsent = da;
		gpa = g;
		numStudentsCreated++;
		
	}

	// accessor methods
	public String toString(){
		return name + "\t" + daysAbsent + "\t" + gpa + "\n"; 		
	}

	public String getName(){
		return name;
	}
	
	public int getDaysAbsent(){
		return daysAbsent;
	}

	public double getGPA(){
		return gpa;
	}

	public static int getnumStudentsCreated(){
		 return numStudentsCreated;    
	}

}