package cn.incast.chapter05.Example;
/*
 *  String��ĳ�ʼ������
 */
public class Example01 {
    public static void main(String[] args) {
        // �ַ�������ֱ�Ӹ�ֵ
        String str1 = "abc";
        // String() �ղ������췽�� ����һ��String���������Ϊ��
        String str2 = new String();
        // String(String s) ����һ��String�����ָ������
        String str3 = new String("hello java");
        // String(char[] arr) ����һ��String�����ָ���ַ�������Ϊ����
        char[] charArray = new char[]{'a','b','c'};
        String str4 = new String(charArray);

        System.out.println(str1);
        System.out.println("a"+str2+"b");
        System.out.println(str3);
        System.out.println(str4);
    }
}
