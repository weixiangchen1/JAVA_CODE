package cn.incast.chapter05.Example;
/*
 *  Runtime���ʹ��
 */
public class Example13 {
    public static void main(String[] args) {
        // public static Runtime getRuntime() �����뵱ǰJavaӦ�ó������������ʱ����
        Runtime rt = Runtime.getRuntime();

        // public int availableProcessors()���ؿ�����Java������Ĵ�����������
        System.out.println("������Java������Ĵ���������:" + rt.availableProcessors());

        // public long freeMemory()����Java������еĿ����ڴ�����
        System.out.println("Java������еĿ����ڴ���:" + rt.freeMemory()/1024/1024 + "MB");

        // public long maxMemory()����Java�����������ʹ�õ�����ڴ�����
        System.out.println("Java�����������ʹ�õ�����ڴ���:" + rt.maxMemory()/1024/1024 + "MB");
    }
}
