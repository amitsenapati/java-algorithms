import org.junit.Assert;
import org.junit.Test;

public class LatticePointsTest {

    @Test
    public void testgetLatticePointCount(){
        Assert.assertEquals(12, LatticePoints.getLatticePointCount(5));
    }
}
