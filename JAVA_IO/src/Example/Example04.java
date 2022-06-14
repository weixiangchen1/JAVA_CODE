package Example;

import java.io.*;
import java.util.InputMismatchException;

/*
 * 文件的拷贝
 */
public class Example04 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节输入流，用于读取当前目录
        InputStream in = new FileInputStream("source\\example.txt");
        // 创建一个字节输出流，用于将读取的文件写入目录
        OutputStream out = new FileOutputStream("target\\example.txt");
        // 读数据
        int len;
        while((len = in.read()) != -1){
            out.write(len);        // 写数据到文件中
        }
        // 关闭流
        in.close();
        out.close();
    }
}
