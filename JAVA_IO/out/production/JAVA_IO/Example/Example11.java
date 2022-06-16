package Example;

import java.io.File;

public class Example11 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        // 获取文件名称
        System.out.println("文件名称：" + file.getName());
        // 获取文件路径
        System.out.println("文件路径：" + file.getPath());
        // 获取文件的绝对路径
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        // 获取文件的父路径
        System.out.println("文件的父路径：" + file.getParent());
        // 判读文件是否可读可写
        System.out.println( file.canRead() ? "文件可读" : "文件不可读");
        System.out.println( file.canWrite() ? "文件可写" : "文件不可写");
        // 判断是否是一个文件
        System.out.println( file.isFile() ? "是一个文件" : "不是一个文件");
        // 判断是否是一个目录
        System.out.println( file.isDirectory() ? "是一个目录" : "不是一个目录");
        // 获取文件的最后修改时间
        System.out.println( "最后修改时间：" + file.lastModified());
        // 获取文件的大小
        System.out.println("是否成功删除文件：" + file.delete());
    }
}
