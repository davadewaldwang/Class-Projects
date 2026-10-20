import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class DewaldWang_ArrayList
{
    public static void main(String[] args) throws IOException
    {
        KeyboardReader reader = new KeyboardReader();
        File myFile = new File("FractionValues1.txt");
        Scanner scan = new Scanner(myFile);
        int selection = 0;

        ArrayList<Fraction> fractions = new ArrayList<>();
        
        while (selection != 99) //looping selection menu
        {
            System.out.println("Select from the following:");
            System.out.println("1. Display the list of fractions");
            System.out.println("2. Add a fraction to the end of the list");
            System.out.println("3. Insert a fraction at a specific location");
            System.out.println("4. Remove a fraction from a specific location");
            System.out.println("5. Remove one instance of a fraction by value");
            System.out.println("6. Remove all instances of a fraction by value");
            System.out.println("7. Replace a fraction at a specific location");
            System.out.println("8. Sort list smallest to largest");
            System.out.println("9. Add fractions into the ArrayList from the file FractionValues.txt");
            System.out.println("10. Count consecutive duplicates in the ArrayList");
            System.out.println("99. Stop");

            selection = reader.readInt("Enter a selection:\t");
            System.out.println();

            switch(selection)
            {
                case 1:
                    System.out.println("The list currently contains:");
                    for (int i = 1; i <= fractions.size(); i++)
                    {
                        System.out.println("\t" + i + ".\t" + fractions.get(i-1)); //display each fraction in list with sequence number (1 greater than index)
                    }
                    reader.pause();
                break;
                
                case 2:
                    int num = reader.readInt("Enter numerator of fraction to add: ");
                    int denom = reader.readInt("Enter denominator of fraction to add: ");
                    Fraction newF = new Fraction(num, denom);
                    fractions.add(newF); //add new fraction to arraylist
                    System.out.println("The fraction " + newF + " was added to the end of the list");
                    reader.pause();
                break;

                case 3:
                    num = reader.readInt("Enter numerator of fraction to add: ");
                    denom = reader.readInt("Enter denominator of fraction to add: ");
                    newF = new Fraction(num, denom);
                    int index = reader.readInt("Enter location to insert fraction: ") - 1; //index 1 less than sequence
                    if (index > fractions.size() || index < 0) //error trap if index oob
                    {
                        System.out.println("\nThe fraction " + newF + " was not inserted in the list at location " + (index+1) + " because that is an invalid location");
                        reader.pause();
                        break;
                    }
                    fractions.add(index, newF);
                    System.out.println("The fraction " + newF + " has been inserted in the list at location " + (index+1));
                    reader.pause();
                break;

                case 4:
                    index = reader.readInt("Enter location to remove fraction from: ") - 1;
                    if (index > fractions.size() || index < 0) //error trap
                    {
                        System.out.println("\nThe fraction was not removed at location " + (index+1) + " because that is an invalid location");
                        reader.pause();
                        break;
                    }

                    System.out.println("The fraction " + fractions.get(index) + " was removed at location " + (index+1));
                    fractions.remove(index);//remove fraction
                    reader.pause();
                break;

                case 5:
                    num = reader.readInt("Enter numerator of fraction to remove: ");
                    denom = reader.readInt("Enter denominator of fraction to remove: ");
                    newF = new Fraction(num, denom);
                    boolean removed = false;
                    for (int i = 0; i < fractions.size(); i++)
                    {
                        if (fractions.get(i).equals(newF)) //if equal to each other remove first instance
                        {
                            System.out.println("One instance of the fraction " + newF + " was removed from the list");
                            fractions.remove(i);
                            removed = true;
                            reader.pause();
                            break; //break from loop because only need one instance
                        }
                    }
                    if (!removed) //didnt find fraction
                        System.out.println("The fraction " + newF + " was not found in the list");
                    reader.pause();
                    break;

                case 6:
                    num = reader.readInt("Enter numerator of fraction to remove: ");
                    denom = reader.readInt("Enter denominator of fraction to remove: ");
                    newF = new Fraction(num, denom);
                    removed = false;
                    int count = 0;
                    int n = 0;
                    while(true)
                    {
                        if (fractions.get(n).equals(newF)) //if equal to each other remove
                        {
                            fractions.remove(n);
                            removed = true;
                            count++; //count each instance
                            n--;
                        }
                        if (n >= fractions.size() - 1)
                            break;
                        n++;
                    }
                    if (!removed)
                        System.out.println("The fraction " + newF + " was not found in the list");
                    else
                        System.out.println("All instances of the fraction " + newF + " were removed from the list. It was removed " + count + " time(s)");
                    reader.pause();
                break;

                case 7:
                    index = reader.readInt("Enter location to replace fraction: ") - 1;
                    num = reader.readInt("Enter numerator of fraction to replace: ");
                    denom = reader.readInt("Enter denominator of fraction to replace: ");
                    newF = new Fraction(num, denom);
                    if (index > fractions.size() || index < 0)
                    {
                        System.out.println("\nThe fraction " + newF + " did not replace the fraction at location " + (index+1) + " because that is an invalid location");
                        reader.pause();
                        break;
                    }
                    System.out.println("The fraction " + newF + " replaced the fraction " + fractions.get(index) + " at location " + (index+1) + " in the list");
                    fractions.set(index, newF); //replace fraction
                    reader.pause();
                break;

                case 8:
                    ArrayList<Fraction> dupe = new ArrayList<>(fractions);
                    Fraction temp = new Fraction();
                    for (int i = 0; i < dupe.size()-1; i++)//bubble sort
                    {
                        for (int j = 0; j < dupe.size()-1 - i; j++)
                        {
                            if (dupe.get(j).compareTo(dupe.get(j+1)) == 1)
                            {
                                //swap values if first fraction greater than second
                                temp = dupe.get(j);
                                dupe.set(j, dupe.get(j+1));
                                dupe.set(j+1, temp);
                            }
                        }
                    }
                    System.out.println("Sorted List:\t" + dupe);
                    reader.pause();
                break;

                case 9:
                    count = 0;
                    while (scan.hasNext())
                    {
                        Fraction ts = new Fraction(scan.nextInt(), scan.nextInt()); //new fraction of two next ints in file
                        fractions.add(ts);
                        System.out.println("Fraction " + ts + " added");
                        count++;
                    }
                    System.out.println(count + " fraction(s) successfully added");
                    reader.pause();
                break;

                case 10:
                    count = 0;
                    ArrayList<Integer> streaks = new ArrayList<>(); //store different streaks
                    ArrayList<Fraction> sFractions = new ArrayList<>(); //store each fraction
                    boolean same = false;
                    int streak = 0; //number of consecutive duplicates for each fraction
                    int highestInd = 0; //index in streaks/sFractions of fraction with highest streak
                    for (int i = 0; i < fractions.size()-1; i++)
                    {
                        if (fractions.get(i+1).equals(fractions.get(i)))
                        {
                            count++;
                            streak++;  
                            same = true;       
                        } 
                        else
                            same = false;
                        if (!same || i == fractions.size()-2) //when no longer consecutive
                        {
                            sFractions.add(fractions.get(i)); //store last consecutive fraction
                            streaks.add(streak); //store its streak
                            streak = 0; //start over
                        }      
                    }
                    int max = 0;
                    for (int j = 0; j < streaks.size(); j++) //find index of highest streak in streaks
                    {
                        if (streaks.get(j) > max)
                        {
                            max = streaks.get(j);
                            highestInd = j;
                        }    
                    }
                    System.out.println("Number of consecutive duplicates: " + count);
                    if (max == 0)
                        System.out.println("There was no longest streak");
                    else
                        System.out.println("The longest streak is length " + (max+1) + " of the fraction " + sFractions.get(highestInd));
                    reader.pause();
                break;

                default:
                    if (selection == 99)
                        System.out.println("harshini eats toes");
                break;
            }
        }
    }
}
