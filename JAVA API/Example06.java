package cn.incast.chapter05.Example;

public class Example06 {
    public static void main(String[] args) {
        // String��Ľ�ȡ�ͷָ����
        // public String substring(int start) ����һ�����ַ�������ԭ���ַ���ָ��λ�ÿ�ʼ��ȡ����ĩβ����
        // public String substring(int start, int end) ����һ�����ַ�������ԭ���ַ���ָ��λ�ÿ�ʼ��ȡ����ָ��λ�ý���
        String s = "hello world!";
        System.out.println("�ӵ�6���ַ���ʼ��ȡ��ĩβ�Ľ����" + s.substring(6));
        System.out.println("�ӵ�6���ַ���ʼ��ȡ����11���ַ���" + s.substring(6,11));

        // public String[] split(String regex) ����ָ�����ַ������зָ��һ���ַ�������
        System.out.println("��ӡ�ָ���ÿ���ַ�������");
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i] + " ");
        }
    }
}
