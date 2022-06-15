package Example;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用FileWriter将字符写入文件
 */
public class Example08 {
    public static void main(String[] args) throws IOException {
        // 创建一个FileWriter对象，用于向文件中写入数据
        FileWriter writer = new FileWriter("writer.txt");
        String str = "hello world";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
