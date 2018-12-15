import org.junit.Assert;
import org.junit.Test;

public class MaxStockProfitTest {

    @Test
    public void testMaxProfit(){
        Assert.assertEquals(87, MaxStockProfit.maxProfit(new int[]{10, 22, 5, 75, 65, 80}, 2));
        Assert.assertEquals(12, MaxStockProfit.maxProfit(new int[]{12, 14, 17, 10, 14, 13, 12, 15}, 3));
        Assert.assertEquals(72, MaxStockProfit.maxProfit(new int[]{100, 30, 15, 10, 8, 25, 80}, 3));
        Assert.assertEquals(0, MaxStockProfit.maxProfit(new int[]{90, 80, 70, 60, 50}, 1));
    }
}
