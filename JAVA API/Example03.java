package cn.incast.chapter05.Example;

import java.util.Locale;

public class Example03 {
    public static void main(String[] args) {
        // public char[] toChatArray() ���ַ���ת�����ַ�����
        String str = "hello world";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i == charArray.length-1){
                System.out.println(charArray[i] + "!");
            } else {
                System.out.printf(charArray[i] + " ");
            }
        }

        // public static String valueOf(int n) ��ָ��int����ת��ΪString����
        System.out.println("��intֵת��ΪString���ͺ�Ľ����" + String.valueOf(123456));

        // public String toUpperCase() ���ַ����е��ַ�ȫ��ת���ɴ�д��ĸ
        System.out.println("���ַ���ת���ɴ�д��ĸ��Ľ����" + str.toUpperCase());



    }
}
