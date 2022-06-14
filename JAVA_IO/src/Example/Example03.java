package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 使用FileOutPutStream将数据追加到文件末尾
 */
public class Example03 {
    public static void main(String[] args) throws IOException {
         OutputStream out = null;
        try {
            out = new FileOutputStream("example.txt", true);
            String str = " world";
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                out.write(b[i]);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            out.close();
        }
    }
}
