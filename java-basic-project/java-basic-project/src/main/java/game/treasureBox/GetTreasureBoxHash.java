package game.treasureBox;

/**
 * @auther:90611
 * @date:2020/12/31
 */
public class GetTreasureBoxHash {
    public String getBoxHash(String boxSerialNum, String openTime, String lastHash, String mysteriousNum) {
        String hashStr = boxSerialNum + openTime + lastHash + mysteriousNum;
        GetHashOfSHA256 getHashOfSHA256 = new GetHashOfSHA256();
        return getHashOfSHA256.getHashOfSHA256(hashStr);
    }
}
