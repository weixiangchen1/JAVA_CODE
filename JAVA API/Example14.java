package cn.incast.chapter05.Example;

import java.io.IOException;

/*
 * �򿪼��±���3���ر�
 */
public class Example14 {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        Thread.sleep(3000); // ��������3��
        process.destroy();  // ɱ������
    }
}

