package Example;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * ʹ���ַ�������FileReader���ļ��е��ַ�
 */
public class Example07 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("test.txt");
        int ch;
        while( (ch = reader.read()) != -1) {
            System.out.println((char)ch);
        }

        reader.close();
    }
}
