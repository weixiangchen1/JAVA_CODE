package Example;

import java.io.*;
import java.util.InputMismatchException;

/*
 * �ļ��Ŀ���
 */
public class Example04 {
    public static void main(String[] args) throws Exception {
        // ����һ���ֽ������������ڶ�ȡ��ǰĿ¼
        InputStream in = new FileInputStream("source\\example.txt");
        // ����һ���ֽ�����������ڽ���ȡ���ļ�д��Ŀ¼
        OutputStream out = new FileOutputStream("target\\example.txt");
        // ������
        int len;
        while((len = in.read()) != -1){
            out.write(len);        // д���ݵ��ļ���
        }
        // �ر���
        in.close();
        out.close();
    }
}
