package HW_02_2;

import org.junit.Assert;
import org.junit.Test;

public class MainAppTest {
    @Test
    public void pullback() throws Exception {
        //Prepare test data
        ObjectQueue queue = new ObjectQueue(3);
        String p1 = "String 1";
        String p2 = "String 2";
        String p3 = "String 3";
        String p4 = "String 4";

        queue.push(p1);
        queue.push(p2);
        queue.push(p3);
        queue.push(p4);

        //Execute code to test with test data
        Integer t = queue.size();
        String t1 = (String)queue.pullback();
        String t2 = (String)queue.pullback();
        String t3 = (String)queue.pullback();
        Integer t4 = (Integer) queue.pullback();
        Integer t5 = queue.size();
        //Check the result
        Assert.assertEquals(t,(Integer) 3);
        Assert.assertEquals(t1,p4);
        Assert.assertEquals(t2,p3);
        Assert.assertEquals(t3,p2);
        Assert.assertEquals(t4,null);
        Assert.assertEquals(t5,(Integer) 0);
    }
    @Test
    public void pullback2() throws Exception {
        //Prepare test data
        ObjectQueue queue = new ObjectQueue(-3);
        String p1 = "String 1";
        String p2 = "String 2";
        String p3 = "String 3";
        String p4 = "String 4";

        queue.push(p1);
        queue.push(p2);
        queue.push(p3);
        queue.push(p4);

        //Execute code to test with test data
        Integer t = queue.size();
        String t1 = (String)queue.pullback();
        String t2 = (String)queue.pullback();
        String t3 = (String)queue.pullback();
        String t4 = (String) queue.pullback();
        Integer t5 = queue.size();
        //Check the result
        Assert.assertEquals(t,(Integer) 4);
        Assert.assertEquals(t1,p4);
        Assert.assertEquals(t2,p3);
        Assert.assertEquals(t3,p2);
        Assert.assertEquals(t4,p1);
        Assert.assertEquals(t5,(Integer) 0);
    }
}