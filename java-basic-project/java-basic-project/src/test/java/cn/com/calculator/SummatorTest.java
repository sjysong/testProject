package cn.com.calculator;

import cn.com.subtracter.Subtraction;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @auther:90611
 * @date:2020/12/28
 */
public class SummatorTest extends TestCase {

    @Test
    public void test_int_sum_int() {
        Summator summator = new Summator();
        int sumResult = summator.intSummator(10, 10);
        int expected = 20;

        Assert.assertEquals(expected, sumResult);
    }
}