package cn.incast.chapter05.Example;
/*
 * String��Ļ�������
 */
public class Example02 {
    public static void main(String[] args) {
        // public int length() ��ȡ�ַ�������
        String s = "hello world";
        System.out.println("��ȡ�ַ����ĳ��ȣ�" + s.length());

        // public char charAt(int index) ��ȡ�ַ���ָ��λ�õ��ַ�
        System.out.println("��ȡ�ַ�����һ���ַ���" + s.charAt(0));

        // public int indexOf(char ch) ��ȡ�ַ����ַ�����һ�γ��ֵ�λ��
        System.out.println("��ȡ�ַ�w��һ�γ��ֵ�λ�ã�" + s.indexOf('w'));

        // public int lastIndexOf(char ch) ��ȡ�ַ����ַ������һ�γ��ֵ�λ��
        System.out.println("��ȡ�ַ�l���һ�γ��ֵ�λ�ã�" + s.lastIndexOf('l'));

        // public int indexOf(String str) ��ȡ�ַ������ַ�����һ�γ��ֵ�λ��
        System.out.println("��ȡ�Ӵ�ll��һ�γ��ֵ�λ�ã�" + s.indexOf("ll"));


    }
}
