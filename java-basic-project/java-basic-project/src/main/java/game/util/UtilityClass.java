package game.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 *
 * @auther:90611
 * @date:2020/12/31
 */
public class UtilityClass {
    /**
     * 获取当前系统时间的字符串
     *
     * @param date
     * @return
     */
    public String getDateForStr(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(date);
    }

    /**
     * 获取随机数字
     * @param start
     * @param end
     * @return
     */
    public String getRandomNum(int start, int end) {
        int num = (int) (start + Math.random() * (end - start + start));
        return Integer.toString(num);
    }
}
