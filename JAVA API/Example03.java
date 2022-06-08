package cn.incast.chapter05.Example;

import java.util.Locale;

public class Example03 {
    public static void main(String[] args) {
        // public char[] toChatArray() 将字符串转化成字符数组
        String str = "hello world";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i == charArray.length-1){
                System.out.println(charArray[i] + "!");
            } else {
                System.out.printf(charArray[i] + " ");
            }
        }

        // public static String valueOf(int n) 将指定int类型转化为String类型
        System.out.println("将int值转换为String类型后的结果：" + String.valueOf(123456));

        // public String toUpperCase() 将字符串中的字符全部转换成大写字母
        System.out.println("将字符串转换成大写字母后的结果：" + str.toUpperCase());



    }
}
