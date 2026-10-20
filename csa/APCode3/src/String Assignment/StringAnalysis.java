import java.util.ArrayList;

public class StringAnalysis {
    private String myString;
    private ArrayList<String> myStringList; //arraylist of each word
    private String[] myStringArray; //array of each letter

    //constructor
    public StringAnalysis(String s)
    {
        myString = s;
        //word arraylist
        int j = 0; //letter counter
        int i = 0; //arraylist cell counter
        myStringList = new ArrayList<>();
        while (j < s.length()) //while looping through string
        {
            String word = ""; //to add to arraylist
            while (j < s.length())
            {
                if (s.substring(j, j+1).equals(" ") || s.substring(j, j+1).equals("."))
                {
                    j++; //move to next letter
                    break; //new word
                }
                word += s.substring(j, j+1); //add letter to word
                j++;
            }
            myStringList.add(i, word); //add word to arraylist
            i++; //next cell
        }

        //letter array
        myStringArray = new String[s.length()];
        for (int index = 0; index < s.length(); index++)
        {
            myStringArray[index] = s.substring(index, index+1);
        }
    }

    public String toString()
    {
        return myString;
    }

    public ArrayList<String> getArrayList()
    {
        return myStringList;
    }

    public String[] getArray()
    {
        return myStringArray;
    }

    public void showArrayList()
    {
        for (String i : myStringList)
        {
            System.out.println(i); //print each arraylist cell on new line
        }
    }

    public void showArray()
    {
        for (String i : myStringArray)
        {
            System.out.print(i + " "); //print each array cell with space between
        }
    }


    public int getNumVowels()
    {
        int count = 0;
        for (String i : myStringArray)
        {
            if ("aeiouAEIOU".indexOf(i) != -1) //if there is an index in aeiou that is i
                count++;
        }
        return count;
    }

    public boolean isAlphabetized()
    {
        for (int i = 0; i < myStringList.size()-1; i++)
        {
            if (myStringList.get(i).compareToIgnoreCase(myStringList.get(i+1)) > 0) //not sorted if word is greater than word after it
                return false;
        }
        return true;
    }

    public boolean isPalindrome()
    {
        for (int i = 0; i < myStringArray.length-1; i++)
        {
            if (!myStringArray[i].equals(myStringArray[myStringArray.length-2-i]))
                return false; //not palindrome if letter isnt same as opposite side (length-2 because period)
        }
        return true;
    }

    public int wordCount(int choice, String str)
    {
        int count = 0;
        if (choice == 1)
        {
            for (String i : myStringList)
            {
                if (i.equalsIgnoreCase(str))
                {
                    count++;
                }
            }
            return count;
        }
        if (choice == 2)
        {
            int arr = 0;
            while (arr < myStringArray.length) //loop through letters in array
            {
                boolean isWord = true;
                int string;
                for (string = 0; string < str.length() && arr < myStringArray.length; string++, arr++) //loop through letters in string
                {
                    if (!str.substring(string, string+1).equalsIgnoreCase(myStringArray[arr]))
                    {
                        isWord = false; //if corresponding letters not equal know its not the word
                        arr++; //continue through array
                        break;
                    }
                }
                if (isWord && arr != myStringArray.length)
                    count++;
                if (arr == myStringArray.length && string == str.length())
                    count++;
            }
        }
        if (choice == 3)
        {
            for (int word = 0; word < myStringList.size(); word++) //loop through words in arraylist
            {
                if (hasWord(myStringList.get(word), str))
                    count++;
            }
        }
        return count;
    }

    public static boolean hasWord(String s1, String s2) //helper method
    {
        for (int i = 0; i <= s1.length()-s2.length(); i++)
        {
            if(s1.substring(i, i+s2.length()).equalsIgnoreCase(s2))
                return true;
        }
        return false;
    }
}
