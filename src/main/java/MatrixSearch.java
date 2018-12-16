/**
 * https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 */
public class MatrixSearch {

    public static void main(String[] args){
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int x = 29;
        System.out.println(searchElement(matrix, x));
    }
    static String searchElement(int[][] matrix, int x){
        int i = 0, j = matrix.length -1;
        while(i < matrix.length && j >= 0){
            int e = matrix[i][j];
            if(e == x)
                return "(" + i + "," + j + ")";
            else if(e < x)
                i++;
            else j--;
        }
        return "Not Found";
    }
}
