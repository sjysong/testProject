package game.util;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
     * @return
     */
    public String getRandomNum() {
        Random random = new Random();
        return Integer.toString(random.nextInt());
    }

    /**
     * 记录数据
     */
    public void writeFile(String textStr,String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileWriter writer = new FileWriter(file, true);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write(("\r\n"));
                out.write(textStr);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取上一个宝箱的什么数字
     * @return
     */
    public String readFile() {
        String str="0";
        int index=0;
        try (FileReader reader = new FileReader("data.txt");
             BufferedReader br = new BufferedReader(reader)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                index++;
                str=line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       return str;
    }
}
