import java.io.IOException;
import java.util.ArrayList; 

/*
Your project requires six files:
lastname_ArraysRunner.java - runner file to test ProcessArrays objects
KeyboardReader.java
ProcessArrays.java -- this is the primary class file
Student.java -- Requires one TINY change. You should probably do this first
StudentArrayFile.txt - contains sample  values the ProcessArrays constructor will put in the array
StudentListFile.txt - contains sample values the ProcessArrays cconstructor will put in the ArrayList


Good luck!
*/

class DewaldWang_ArraysRunner
{
    public static void main(String[] args) throws IOException
    {
        ProcessArrays jim = new ProcessArrays();
        ProcessArrays bob = new ProcessArrays(new Student[0], jim.gpaSort());
        System.out.println(jim.getTruants());
        System.out.println(bob);
        int[][] a = new int[4][3];
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                a[i][j] = i + j;
            }
        }
        System.out.println(jim.largest(a));
        int[] b = jim.countDigits();
        for (int i : b)
            System.out.print(i + " ");
        System.out.println();
        jim.makeMeLaugh();
    }
}