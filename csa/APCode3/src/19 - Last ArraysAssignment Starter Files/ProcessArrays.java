// dava dewald-wang

import java.util.*;
import java.io.*;

public class ProcessArrays 
{
    private Student[] studentArray;  // you may change these names if you like
    private ArrayList<Student> studentList;

    public ProcessArrays() throws IOException
    {
        File arrFile = new File("StudentArrayFile.txt");
        File listFile = new File("StudentListFile.txt");
        Scanner arrScan = new Scanner(arrFile); //create new scanner objects to read through files
        Scanner listScan = new Scanner(listFile);
        studentArray = new Student[arrScan.nextInt()];
        studentList = new ArrayList<>();
        for (int i = 0; i < studentArray.length; i++)
        {
            studentArray[i] = new Student(arrScan.next(), arrScan.nextInt(), arrScan.nextDouble());
        }
        while (listScan.hasNextLine())
        {
            studentList.add(new Student(listScan.next(), listScan.nextInt(), listScan.nextDouble()));
        }
        arrScan.close();
        listScan.close();
    }

    public ProcessArrays(Student[] arr, ArrayList<Student> list)
    {
        studentArray = arr;
        studentList = list;
    }

    public String toString()
    {
        String result = "";
        for (Student i : studentArray)
            result += i;
        for (Student j : studentList)
            result += j;
        return result;
    }

    public ArrayList<Student> gpaSort()
    {
        ArrayList<Student> result = new ArrayList<>();
        for (int j = 0; j < studentArray.length; j++) //add students in array to new arraylist
        {
            result.add(studentArray[j]);
        }
        for (int i = 0; i < studentList.size(); i++) //add students in arraylist to new arraylist
        {
            result.add(studentList.get(i));
        }
        mergeSort(result); //sort result by gpa
        return result;
    }

    public ArrayList<String> getTruants()
    {
        ArrayList<String> result = new ArrayList<>();
        int max = Integer.MIN_VALUE; 
        for (Student i : studentArray)
        {
            if (i.getDaysAbsent() > max) //find max in both studentlist and studentarray
                max = i.getDaysAbsent();
        }
        for (Student i : studentList)
        {
            if (i.getDaysAbsent() > max)
                max = i.getDaysAbsent();
        }
        for (Student i : studentArray)
        {
            if (i.getDaysAbsent() == max) //add max values to result
                result.add(i.getName());
        }
        for (Student i : studentList)
        {
            if (i.getDaysAbsent() == max)
                result.add(i.getName());
        }
        return result;
    }

    public int largest(int[][] twoDArray)
    {
        int maxR = rowSum(twoDArray, 0); //set max row and col sum to first ones
        int maxC = colSum(twoDArray, 0);
        for (int r = 1; r < twoDArray.length; r++)
        {
            if (rowSum(twoDArray, r) > maxR)
                maxR = rowSum(twoDArray, r); //find max row sum
        }
        for (int c = 1; c < twoDArray[0].length; c++)
        {
            if (colSum(twoDArray, c) > maxC)
                maxC = colSum(twoDArray, c);//find max col sum
        }
        return maxC + maxR; //return sum of col and row
    }

    public int[] countDigits()
    {
        int[] result = new int[10];//array with cell for each digit 0-9
        for (Student i : studentArray) //loop through array
        {
            int digit = i.getDaysAbsent();
            if (digit == 0)
                result[0]++;
            while (digit != 0) //do until leftmost digit counted
            {
                result[digit % 10]++; //+1 for rightmost digit
                digit /= 10; //cut off rightmost digit woah
            }
        }
        for (Student i : studentList) //do same as above for arraylist
        {
            int digit = i.getDaysAbsent();
            if (digit == 0)
                result[0]++;
            while (digit != 0)
            {
                result[digit % 10]++;
                digit /= 10;
            }
        }
        return result;
    }

    public void makeMeLaugh()
    {
        System.out.println("a cs student is writing a letter to their crush " +
                            "before lecture. the student next to them grabbed their note.\n" +
                            "the first student said: \"hey, you can't see that! it's private!\"\n" +
                            "the second student responded: \"but we're in the same class!\"");
                                
    }

    private static void mergeSort(ArrayList<Student> list)
    {
        if (list.size() < 2) //stopping condition when arrays are length 1
            return;
        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();
        int i;
        for (i = 0; i < list.size()/2; i++) //add first half of list to left
        {
            left.add(list.get(i));
        }
        for (i=i; i < list.size(); i++)//second half to right
        {
            right.add(list.get(i));
        }
        mergeSort(left); //do until lefts and rights are length 1
        mergeSort(right);
        
        merge(list, left, right); //merge lefts and rights together
    }

    private static void merge(ArrayList<Student> list, ArrayList<Student> left, ArrayList<Student> right)
    {
        ArrayList<Student> merged = new ArrayList<>(); //new arraylist of merged values
        for (int i = 0; i < left.size(); i++) //put all left values in merged
        {
            merged.add(left.get(i));
        }
        int index = 0;
        while(right.size() > 0 && index < merged.size()) //go through merged adding first value in right in its place
        {                                                //left and right guaranteed to be sorted so can use first value of right
            if (right.get(0).getGPA() > merged.get(index).getGPA())
                merged.add(index, right.remove(0));
            index++;
        }
        for (int i = 0; i < right.size(); i++) //add remaining values in right to merged
        {
            merged.add(right.get(i));
        }
        for (int i = 0; i < merged.size(); i++) //replace list values with sorted values in merged
        {
            list.set(i, merged.get(i));
        }
    }

    private static int rowSum(int[][] arr, int row) //calculate sum of values in given row
    {
        int result = 0;
        for (int c = 0; c < arr[0].length; c++)
        {
            result += arr[row][c];
        }
        return result;
    }

    private static int colSum(int[][] arr, int col) //sum of values in given column
    {
        int result = 0;
        for (int r = 0; r < arr.length; r++)
        {
            result += arr[r][col];
        }
        return result;
    }
}