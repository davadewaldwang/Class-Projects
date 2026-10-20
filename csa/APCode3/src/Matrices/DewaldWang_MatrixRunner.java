public class DewaldWang_MatrixRunner {
    public static void main(String[] args)
    {
         int[][] matrix = {{1,2,3,2}, {4,-55,6,1}};
        // int[][] other = {{1,4,2,4}, {2,1,1,2}, {3,5,5,3}};
        // APMatrix gurt = new APMatrix(matrix);
        // APMatrix yo = new APMatrix(other);
        // APMatrix bruh = new APMatrix(2,2,true);
        
        // System.out.println(gurt);
        // System.out.println(gurt.sumCross(1, 1));

        // System.out.println(yo);
        // System.out.println(gurt.matrixMultiply(yo));
        // System.out.println(yo.removeCross(1, 1));
        // System.out.println(bruh.removeCross(1, 1));
        // System.out.println(bruh.sumCross(1, 1));
        //APMatrix bruh = new APMatrix(matrix);
        //System.out.println(bruh);
        for (int[] i : matrix)
        {
            for (int j : i)
                System.out.print(j + "  ");
            System.out.println();
        }
    }
}
