package cn.incast.chapter05.Example;
/*
 * String类的基本操作
 */
public class Example02 {
    public static void main(String[] args) {
        // public int length() 获取字符串长度
        String s = "hello world";
        System.out.println("获取字符串的长度：" + s.length());

        // public char charAt(int index) 获取字符串指定位置的字符
        System.out.println("获取字符串第一个字符：" + s.charAt(0));

        // public int indexOf(char ch) 获取字符在字符串第一次出现的位置
        System.out.println("获取字符w第一次出现的位置：" + s.indexOf('w'));

        // public int lastIndexOf(char ch) 获取字符在字符串最后一次出现的位置
        System.out.println("获取字符l最后一次出现的位置：" + s.lastIndexOf('l'));

        // public int indexOf(String str) 获取字符串在字符串第一次出现的位置
        System.out.println("获取子串ll第一次出现的位置：" + s.indexOf("ll"));


    }
}
