package game.treasureBox;

import game.util.UtilityClass;
import junit.framework.TestCase;

import java.util.Date;

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
        String expected="9d19eb765a5b4b4ab75eb8e92703dc80b65f12262112e5ecc1e4366af0b5e717";

        assertEquals(expected,result);
    }

    public void test_verify_can_get_the_treasure_box_hash_value(){
        String openTime=new UtilityClass().getDateForStr(new Date());
        String boxSerialNum="1";
        String lastHash="0";
        String mysteriousNum="1801415402";
        GetTreasureBoxHash getTreasureBoxHash=new GetTreasureBoxHash();
        String result=getTreasureBoxHash.getBoxHash(boxSerialNum,lastHash,mysteriousNum);
        String expected="3d396c2b66d43a7d5e6d52ba7a61f73220921f5070a78df5fcf377ac198b9991";
        assertEquals(expected,result);
    }

    public void test_get_mysterious_number(){
        MysteriousNumber mysteriousNumber=new MysteriousNumber();
        String result=mysteriousNumber.mysteriousNumOfBox("1","0");
        String expected="88";

        assertEquals(expected,result);
    }
}