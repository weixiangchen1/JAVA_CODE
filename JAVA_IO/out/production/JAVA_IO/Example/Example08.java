package Example;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ��FileWriter���ַ�д���ļ�
 */
public class Example08 {
    public static void main(String[] args) throws IOException {
        // ����һ��FileWriter�����������ļ���д������
        FileWriter writer = new FileWriter("writer.txt");
        String str = "hello world";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
