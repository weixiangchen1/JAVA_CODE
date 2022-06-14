package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example02 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节文件输出流
        FileOutputStream out = new FileOutputStream("example.txt");
        String str = "hello";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }

        out.close();
    }
}
