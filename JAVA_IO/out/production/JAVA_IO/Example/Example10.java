package Example;

import java.io.*;

/*
 * 将字节流转换为字符流
 */
public class Example10 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream out = new FileOutputStream("des.txt");
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = null;
        while( (line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
