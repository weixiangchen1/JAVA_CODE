package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ֽ������ļ����ݵĶ�ȡ
 */
public class Example01 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("test.txt");
        // ����һ��int���ͱ���b����סÿ�ζ�ȡ��һ���ֽ�
        int b = 0;
        while(true){
            b = in.read();
            if(b == -1){
                break;
            }

            System.out.println(b);
        }
        // �رգ��ͷ�ϵͳ��Դ
        in.close();
    }
}
