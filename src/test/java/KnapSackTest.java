import org.junit.Assert;
import org.junit.Test;

public class KnapSackTest {

    @Test
    public void testMaxValue(){
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int W = 50;
        Assert.assertEquals(220, KnapSack.maxValue(val, wt, W));
    }

    @Test
    public void testMaxValue2(){
        int[] val = {40, 100, 50, 60};
        int[] wt = {20, 10, 40, 30};
        int W = 60;
        Assert.assertEquals(200, KnapSack.maxValue(val, wt, W));
    }
}
