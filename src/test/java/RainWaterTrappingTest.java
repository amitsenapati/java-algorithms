import org.junit.Assert;
import org.junit.Test;

public class RainWaterTrappingTest {

    @Test
    public void testCapacity(){
        Assert.assertEquals(10, RainWaterTrapping.getCapacity(new int[]{3, 0, 0, 2, 0, 4}));
        Assert.assertEquals(6, RainWaterTrapping.getCapacity(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        Assert.assertEquals(2, RainWaterTrapping.getCapacity(new int[]{2, 0, 2}));
    }
}
