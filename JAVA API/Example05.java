package cn.incast.chapter05.Example;

public class Example05 {
    public static void main(String[] args) {
        // String����жϲ���
        // public boolean startsWith(String str) �ж��ַ����Ƿ��Ը����ַ���ͷ
        String s = "String";
        System.out.println("�ж��ַ����Ƿ���Str��ͷ��" + s.startsWith("Str"));

        // public boolean endsWith(String str) �ж��ַ����Ƿ��Ը����ַ�����
        System.out.println("�ж��ַ����Ƿ���ing��β��" + s.endsWith("ing"));

        // public boolean contains(string str) �ж��ַ����Ƿ���������ַ���
        System.out.println("�ж��ַ����Ƿ����tr��" + s.contains("tr"));

        // public boolean isEmpty() �ж��ַ����Ƿ�Ϊ��
        System.out.println("�жϵ�ǰ�ַ����Ƿ�Ϊ�գ�" + s.isEmpty());

        // public boolean equals(String str) �ж��ַ���������ַ���str�������Ƿ���ͬ
        System.out.println("�ж��ַ����Ƿ���ͬ��" + s.equals("String"));
    }
}
