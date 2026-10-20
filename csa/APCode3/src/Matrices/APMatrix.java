//dava dewald-wang
//apmatrix assignment

public class APMatrix
{
    KeyboardReader reader = new KeyboardReader();
    private int[][] myMatrix;
    //constructors
    APMatrix(int R, int C, boolean enter)
    {
        myMatrix = new int[R][C]; //create new 2d array
        if (enter)
        {
            for (int i = 0; i < myMatrix.length; i++)
            {
                for (int j = 0; j < myMatrix[0].length; j++)
                {
                    myMatrix[i][j] = reader.readInt(); //read in values
                }
            }
        }
    }
    APMatrix(int[][] copyMe)
    {
        myMatrix = copyMe;//new int[copyMe.length][copyMe[0].length]; //create new 2d array
        // for (int i = 0; i < myMatrix.length; i++)
        // {
        //     for (int j = 0; j < myMatrix[0].length; j++)
        //     {
        //         myMatrix[i][j] = copyMe[i][j]; //copy values over
        //     }
        // }
        myMatrix[0][0] = 2;
    }
    
    //accessor methods
    private int getRows()
    {
        return myMatrix.length;
    }

    private int getColumns()
    {
        return myMatrix[0].length;
    }


    public int sumCross(int r, int c)
    {
        int sum = 0;
        for (int i = 0; i < getRows(); i++)
        {
            for (int j = 0; j < getColumns(); j++)
            {
                if (i == r-1 || j == c-1) // -1 because user dumb
                    sum += myMatrix[i][j]; //add value in matrix cell to sum if in correct row or column
            }
        }
        return sum;
    }

    public APMatrix matrixMultiply(APMatrix m1)
    {
        if (this.getColumns() != m1.getRows()) //if columns of m1 are not same number as rows of m2
        {
            System.out.println("Cannot be multiplied");
            return null;
        }
        APMatrix result = new APMatrix(getRows(), m1.getColumns(), false); //new matrix of size rows of 1 x columns of 2
        for (int i = 0; i < getRows(); i++) //rows in new matrix
        {
            for (int j = 0; j < m1.getColumns(); j++) //columns in next matrix
            {
                int sum = 0;
                for (int k = 0; k < getColumns(); k++) //old matrices
                {
                    sum += myMatrix[i][k] * m1.myMatrix[k][j]; //sum values in each row of this * values in each column of m1
                }
                result.myMatrix[i][j] = sum; //set values in new matrix
            }
        } 
        return result;
    }

    public APMatrix removeCross(int r, int c)
    {
        if (r > getRows() || c > getColumns()) //outside of array bounds
        {
            System.out.println("No existing row/column");
            return this;
        }
        APMatrix result = new APMatrix(getRows()-1, getColumns()-1, false); //new matrix 1 column and row smaller
        for (int i = 0, y = 0; i < getRows(); i++, y++) //i this, y result
        {
            if (i == r-1)
            {
                y--; //now everything after removed row shifts up 1
                continue;
            }
            for (int j = 0, z = 0; j < getColumns(); j++, z++) //j this, z result
            {
                if (j == c-1)
                {
                    z--; //now everything after removed column shifts left 1
                    continue;
                }
                result.myMatrix[y][z] = myMatrix[i][j];
            }
        }
        return result;
    }

    public String toString()
    {
        String s1 = "";
        for (int[] i : myMatrix) //if for loop, then i < getRows
        {
            for (int j : i) //if for loop, then j < getColumns
            {
                s1 += j + "\t";
            }
            s1 += "\n";
        }
        return s1;
    }
}
