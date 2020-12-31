package game.treasureBox;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import game.constant.gameConstant;

/**
 * 获取Hash值
 *
 * @auther:90611
 * @date:2020/12/31
 */
public class GetHashOfSHA256 {
    /**
     * 获取字符串的Hash值
     * @param str
     * @return
     */
    public String getHashOfSHA256(String str) {
        String strResult = null;
        if (str == null && str.length() == 0) {
            return strResult;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(gameConstant.ENCODING_SHA256);
            messageDigest.update(str.getBytes());
            byte byteBuffer[] = messageDigest.digest();
            StringBuffer strHexString = new StringBuffer();
            for (int i = 0; i < byteBuffer.length; i++) {
                String hex = Integer.toHexString(0xff & byteBuffer[i]);
                if (hex.length() == 1) {
                    strHexString.append('0');
                }
                strHexString.append(hex);
            }
            strResult = strHexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return strResult;
    }
}
