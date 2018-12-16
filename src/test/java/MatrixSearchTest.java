import org.junit.Assert;
import org.junit.Test;

public class MatrixSearchTest {

    @Test
    public void testMatrixSearch(){
        int[][] matrix = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        Assert.assertEquals("(2,1)", MatrixSearch.searchElement(matrix, 29));
    }

    @Test
    public void testMatrixSearch2(){
        int[][] matrix = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        Assert.assertEquals("Not Found", MatrixSearch.searchElement(matrix, 100));
    }
}
