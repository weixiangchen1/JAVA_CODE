package Example;

import java.io.*;

/*
 * 文件的拷贝（使用缓冲区拷贝文件）
 */
public class Example05 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("source\\example.txt");
        OutputStream out = new FileOutputStream("source\\example.txt");
        byte[] buff = new byte[1024];
        int len;
        while( (len = in.read(buff)) != -1){
            out.write(buff,0,len);
        }

        in.close();
        out.close();
    }
}
