package cn.incast.chapter05.Example;

public class Example08 {
    public static void main(String[] args) {
        // StringBuffer�ĳ��÷���
        // public StringBuffer append(String str) ���ַ���������ĩβ��������ݣ����ص�ǰStringBuffer����
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.append("123");
        System.out.println(sb);

        // public StringBuffer insert(int index, String str) ���ַ���������ָ��λ���ϲ���ָ��������
        sb.insert(2, "!!");
        System.out.println(sb);

        // public StringBuffer delete(int start, int end) ɾ��ָ����Χ������
        sb.delete(2,4);
        System.out.println(sb);

        // public StringBuffer deleteCharAt(int index) ɾ��ָ��λ�õ�����
        sb.deleteCharAt(0);
        System.out.println(sb);

        // public int length() ��ȡ�ַ����������ĳ���
        sb.delete(0,sb.length());
        System.out.println(sb);

        // public StringBuffer replace(int start, int end, String str) �滻ָ����Χ������
        StringBuffer sb1 = new StringBuffer("hello world");
        sb1.replace(6,11,"java");
        System.out.println(sb1);

        // public StringBuffer setCharAt(int index, char ch) �滻ָ��λ�õ�����
        sb1.setCharAt(5,',');
        System.out.println(sb1);

        // public StringBuffer reverse() �ַ�����������ת
        System.out.println(sb1.reverse());
    }
}
