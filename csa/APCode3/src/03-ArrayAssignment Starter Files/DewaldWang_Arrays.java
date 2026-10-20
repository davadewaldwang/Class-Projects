// dava dewald-wang
// dewaldwang_Arrays.java
// practice with arrays

// IMPORTANT FOR THE FUTURE
// Every assignment should have three items listed at the top:  Your name, the name of the 
// assignment, and a brief description of the assignment

//import java.util.Scanner; // You will need this line if you use Scanner instead of KeyboardReader

public class DewaldWang_Arrays 
{
  static KeyboardReader reader = new KeyboardReader();
  public static void main(String[] args) 
  {
    //Scanner reader = new Scanner(System.in);
    

    int selection = 0;
    
    while (selection != 99)
    {
      System.out.println();
      System.out.println("Select one of the following:");
      System.out.println("1.\tMax Min Average");
      System.out.println("2.\tHigh Values");
      System.out.println("3.\tNames & Stars");
      System.out.println("99.\tStop");
      System.out.println();

      selection = reader.readInt("Selection:\t");

      System.out.println();

      switch(selection)
      {
        case 1:
          minMaxAvg();
          break;
        case 2:
          highValues();
          break;
        case 3:
          namesStars();
        default:
          if (selection == 99)
            System.out.println("harshini eats toes");
      }
    }
  }

  public static void minMaxAvg()
  {
    int[] array1 = new int[10];

    //puts user values into array1
    System.out.println("Enter 10 numbers:");
    for (int i = 0; i < 10; i++)
    {
      array1[i] = reader.readInt((i + 1) + ":\t");
    }
    int min = array1[0], max = array1[0];
    double avg = 0;
    for (int i = 0; i < 10; i++)
    {
      if (array1[i] < min) //new min value if number is greater than prev min
        min = array1[i];
      if (array1[i] > max) //new max value if greater than prev max
        max = array1[i];
      avg += array1[i]; //sum numbers
    }
    avg /= (double)array1.length; //divide total by n to get average

    System.out.println("Minimum value:\t" + min);
    System.out.println("Maximum value:\t" + max);
    System.out.println("Average:\t" + avg);
    System.out.print("List of values:\t");
    for (int i = 0; i < array1.length - 1; i++)
    {
      System.out.print(array1[i] + ", ");
    }
    System.out.println(array1[array1.length - 1]);
  }

  public static void highValues()
  {
    //how big is array
    int total = reader.readInt("How many numbers would you like to enter:\t");
    System.out.println("Enter your " + total + " numbers:");

    int[] array2 = new int[total];
    
    //puts user values into array2
    for  (int i = 0; i < total; i++)
    {
      array2[i] = reader.readInt((i + 1) + ":\t");
    }
    System.out.print("List of values:\t");
    for (int i = 0; i < array2.length - 1; i++)
    {
      System.out.print(array2[i] + ", ");
    }
    System.out.println(array2[array2.length - 1]);
    System.out.println("There were a total of " + total + " values values.");

    int first = array2[0], second, third;
    int secondInd;

    //determine biggest number
    for (int i = 0; i < array2.length; i++)
    {
      if (array2[i] > first)
        first = array2[i];
    }

    System.out.println();

    //intitialize second
    if (first == array2[0]) 
    {
      second = array2[1];
      secondInd = 1;
    }
    else 
    {
      second = array2[0];
      secondInd = 0;
    }

    //determine second biggest number
    for (int i = secondInd; i < array2.length; i++)
    {
      if (array2[i] == first)
        continue;
      if (array2[i] > second)
      {
        second = array2[i];
        secondInd = i;
      }
    }
  
    //initialize third
    if (first != array2[0] && second != array2[0])
      third = array2[0];
    else
    if (first == array2[1] || second == array2[1])
      third = array2[2];
    else
      third = array2[1];
    
    //determine third biggest number
    for (int i = 0; i < array2.length; i++)
    {
      if (array2[i] == first || array2[i] == second)
        continue;
      if (array2[i] > third)
        third = array2[i];
    }

    //highest number sequences
    System.out.print("The highest number was in sequence # ");
    for (int i = 0; i < array2.length; i++)
    {
      if (array2[i] == first)
        System.out.print((i + 1) + " ");
    }
    System.out.println();
    //second highest
    System.out.print("The second highest number was in sequence # ");
    for (int i = 0; i < array2.length; i++)
    {
      if (array2[i] == second)
        System.out.print((i + 1) + " ");
    }
    System.out.println();
    //third highest
    System.out.print("The third highest number was in sequence # ");
    for (int i = 0; i < array2.length; i++)
    {
      if (array2[i] == third)
        System.out.print((i + 1) + " ");
    }
  }

  public static void namesStars()
  {
    String[] names = new String[40];
    int[] grades = new int[40];

    System.out.println("Enter student names and grades, enter \"stop\" when finished");
    String inp = "";
    int ind = 0;

    while (ind < 40)
    {
      inp = reader.readLine("Enter name " + (ind + 1) + "\t");
      if (inp.equalsIgnoreCase("stop")) //sentinel
        break;
      names[ind] = inp; //name at index n is input
      grades[ind] = reader.readInt("Enter grade " + (ind + 1) + "\t"); //grade at index n is input
      ind++;
    }

    int highest = grades[0];
    int sum = 0;
    //determine highest and sum
    for (int i = 0; i < 40; i++)
    {
      if (grades[i] > highest)
        highest = grades[i];
      sum += grades[i];
    }
    //highest indices stored in star
    boolean[] star = new boolean[40];
    for (int i = 0; i < 40; i++)
    {
      if (grades[i] == highest)
        star[i] = true;
    }
    //display names/grades
    for (int i = 0; i < ind; i++)
    {
      if (star[i] == true)
        {
          System.out.println("** " + names[i] + " **");
          System.out.println("** " + grades[i] + " **");
        }
      else
      {
      System.out.println(names[i]);
      System.out.println(grades[i]);
      }
    }
    double mean = (double)sum / ind;
    System.out.println("Difference between mean (" + mean + ") and highest score (" + highest + "):\t" + (highest - mean));
  }
}