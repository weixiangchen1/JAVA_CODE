package cn.incast.chapter05.Example;

public class Example04 {
    public static void main(String[] args) {
        // String����滻��ȥ���ո����
        // public String replace(String oldStr, String newStr)
        // ��ԭ���ַ���oldStr�ַ���������newStr�ַ������棬����һ���µ��ַ���
        String s = "itcase";
        String s1 = " i t c a s e";
        System.out.println("��it�滻��cn.it֮��Ľ����" + s.replace("it", "cn.it"));

        // public String trim() ����һ�����ַ�����ȥ����ԭ���ַ��������˿ո�
        System.out.println("ȥ���������߿ո��Ľ����" + s1.trim());

        System.out.println("ȥ��ȫ���ո��Ľ����" + s1.replace(" ", ""));
    }
}
