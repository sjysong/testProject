package game.treasureBox;

import game.util.UtilityClass;

/**
 * @auther:90611
 * @date:2020/12/31
 */
public class GetTreasureBoxHash {
    /**
     * 获取神秘宝箱的Hash值
     * @param boxSerialNum
     * @param mysteriousNum
     * @return
     */
    public String getBoxHash(String boxSerialNum, String mysteriousNum) {

        //获取上一个宝箱的Hash
        String lastHash =new UtilityClass().readFile();
        String hashStr = boxSerialNum + lastHash + mysteriousNum;
        GetHashOfSHA256 getHashOfSHA256 = new GetHashOfSHA256();
        return getHashOfSHA256.getHashOfSHA256(hashStr);
    }

}
