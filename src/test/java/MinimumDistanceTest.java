import org.junit.Assert;
import org.junit.Test;

public class MinimumDistanceTest {

    @Test
    public void testMinimumDistance(){
        Assert.assertEquals(4, MinimumDistance.getMinimumDistance(new int[]{3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, 3, 6));
        Assert.assertEquals(1, MinimumDistance.getMinimumDistance(new int[]{2, 5, 3, 5, 4, 4, 2, 3},3, 2));
        Assert.assertEquals(2, MinimumDistance.getMinimumDistance(new int[]{3,4,5}, 3,5));
    }
}
