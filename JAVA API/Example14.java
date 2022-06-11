package cn.incast.chapter05.Example;

import java.io.IOException;

/*
 * 打开记事本在3秒后关闭
 */
public class Example14 {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        Thread.sleep(3000); // 程序休眠3秒
        process.destroy();  // 杀掉进程
    }
}

