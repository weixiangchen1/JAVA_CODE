package cn.incast.chapter05.Example;
/*
 *  String类的初始化操作
 */
public class Example01 {
    public static void main(String[] args) {
        // 字符串常量直接赋值
        String str1 = "abc";
        // String() 空参数构造方法 创建一个String类对象，内容为空
        String str2 = new String();
        // String(String s) 创建一个String类对象，指定内容
        String str3 = new String("hello java");
        // String(char[] arr) 创建一个String类对象，指定字符数组作为内容
        char[] charArray = new char[]{'a','b','c'};
        String str4 = new String(charArray);

        System.out.println(str1);
        System.out.println("a"+str2+"b");
        System.out.println(str3);
        System.out.println(str4);
    }
}
