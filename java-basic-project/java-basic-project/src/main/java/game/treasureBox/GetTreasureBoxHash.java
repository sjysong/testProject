package game.treasureBox;

/**
 * @auther:90611
 * @date:2020/12/31
 */
public class GetTreasureBoxHash {
    /**
     * 获取神秘宝箱的Hash值
     * @param boxSerialNum
     * @param lastHash
     * @param mysteriousNum
     * @return
     */
    public String getBoxHash(String boxSerialNum, String lastHash, String mysteriousNum) {
        if("1".equals(boxSerialNum)){
            lastHash = "0";
        }
        String hashStr = boxSerialNum + lastHash + mysteriousNum;
        GetHashOfSHA256 getHashOfSHA256 = new GetHashOfSHA256();
        return getHashOfSHA256.getHashOfSHA256(hashStr);
    }

}
