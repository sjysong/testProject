package game.treasureBox;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

/**
 * @auther:90611
 * @date:2020/12/31
 */
public class GetHashOfSHA256Test extends TestCase {
    public void test_verify_can_get_the_hash_value(){
        GetHashOfSHA256 getHashOfSHA256=new GetHashOfSHA256();
        String testStr="1202012310555";
        String result=getHashOfSHA256.getHashOfSHA256(testStr);
        String expected="s";

        assertEquals(expected,result);
    }
}