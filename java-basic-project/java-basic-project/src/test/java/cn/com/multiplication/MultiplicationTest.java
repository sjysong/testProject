package cn.com.multiplication;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @auther:90611
 * @date:2020/12/29
 */
public class MultiplicationTest extends TestCase {
    public void test_int_multiplication_int() {
        Multiplication multiplication = new Multiplication();
        int mulResult = multiplication.intMultiplication(10, 10);
        int expected = 100;

        Assert.assertEquals(expected, mulResult);
    }
}