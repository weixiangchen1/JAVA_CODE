package Example;

import java.io.*;

/*
 * �ļ��Ŀ�����ʹ�û����������ļ���
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
