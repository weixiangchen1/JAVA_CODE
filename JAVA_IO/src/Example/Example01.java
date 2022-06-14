package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节流对文件数据的读取
 */
public class Example01 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("test.txt");
        // 定义一个int类型变量b，记住每次读取的一个字节
        int b = 0;
        while(true){
            b = in.read();
            if(b == -1){
                break;
            }

            System.out.println(b);
        }
        // 关闭，释放系统资源
        in.close();
    }
}
