import org.junit.Assert;
import org.junit.Test;

public class StealHouseTest {

    @Test
    public void testSteelHouse(){
        Assert.assertEquals(19, StealHouse.getMaxStealValue(new int[]{6, 7, 1, 3, 8, 2, 4}));
        Assert.assertEquals(16, StealHouse.getMaxStealValue(new int[]{5, 3, 4, 11, 2}));
    }
}
