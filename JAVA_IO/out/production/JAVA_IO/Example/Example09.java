package Example;

import java.io.*;

/*
 * �ļ��ĸ���
 */
public class Example09 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("des.txt"));
        String line = null;
        while( (line = in.readLine()) != null) {
            out.write(line);
            out.newLine();
            out.flush();
        }
        in.close();
        out.close();
    }
}
