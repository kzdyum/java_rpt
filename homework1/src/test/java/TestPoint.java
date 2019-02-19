import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
@Test
  public void testPoint(){
    Point p1=new Point(6,7);
    Point p2=new Point(12,18);
    Assert.assertEquals(p2.distanceFormat(p1), 12.53);
  }
}
