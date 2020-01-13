public class MultiDimensionalArray {

    public static void main (String [] args) {

        int[][] myarray1 = {{1, 2, 3}, {4, 5, 6}};
        /*
        1 2 3
        4 5 6
         */
        //first row has index 0
        //first column has index 0
        //myarray1[1][1]= 5

        int[][] myarray2 = {{1, 2}, {3}, {4, 5, 6}};
            /*
            1 2
            3
            4 5 6
             */

        int[][] myarray3 = new int [2][3];
        //2 rows, 3 columns

        int[][] myarray4= new int [3][];

        myarray4 [0] = new int[2];
        //first row will include 2 columns
        myarray4 [1] = new int[1];
        myarray4 [2] = new int[3];

        /*
        _ _
        _
        _ _ _
         */

        System.out.println("Our first array ");
        outputArray(myarray1);
        System.out.println("Our second array ");
        outputArray(myarray2);
        //System.out.print("Our third array");
        //outputArray(myarray3);
    }

    public static void outputArray (int [][] myArray) {

        for (int row=0; row<myArray.length; row++){

            for (int column=0; column<myArray[row].length; column++){

                System.out.printf("%d ", myArray[row][column]);

            }
        }
    }
}
