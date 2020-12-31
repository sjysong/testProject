package cn.com.ioFlow;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * @auther:90611
 * @date:2020/12/29
 */
public class TxtFlow {

    public void readFile() {
        String pathname = "data.txt";
        int index=0;
        Map<Integer,String>map=new HashMap<>(16);
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                map.put(index,line);
                index++;
                // 一次读入一行数据
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map.size());
    }

    public void writeFile() {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileWriter writer = new FileWriter(file, true);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write("写入文件1\r\n"); // \r\n即为换行
                out.write("写入文件2\r\n");
                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
