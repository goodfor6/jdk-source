import org.junit.Assert;
import org.junit.Test;

/**
 * @Author llh
 * @create 2023/4/26
 */
public class TestString {

    @Test
    public void toUpperCase(){
        String str = "hello";
        String upperStr = str.toUpperCase();
        Assert.assertTrue("HELLO".equals(upperStr));
    }

}
