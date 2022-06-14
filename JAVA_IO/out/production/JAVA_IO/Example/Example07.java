package Example;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 使用字符输入流FileReader读文件中的字符
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
