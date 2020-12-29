package cn.com.subtracter;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @auther:90611
 * @date:2020/12/29
 */
public class SubtractionTest extends TestCase {
    @Test
    public void test_int_sub_int(){
        Subtraction subtraction=new Subtraction();
        int subResult=subtraction.intSubtraction(10,2);
        int expected=8;
        Assert.assertEquals(expected,subResult);
    }

}