package Example;

import java.io.File;

public class Example11 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        // ��ȡ�ļ�����
        System.out.println("�ļ����ƣ�" + file.getName());
        // ��ȡ�ļ�·��
        System.out.println("�ļ�·����" + file.getPath());
        // ��ȡ�ļ��ľ���·��
        System.out.println("�ļ��ľ���·����" + file.getAbsolutePath());
        // ��ȡ�ļ��ĸ�·��
        System.out.println("�ļ��ĸ�·����" + file.getParent());
        // �ж��ļ��Ƿ�ɶ���д
        System.out.println( file.canRead() ? "�ļ��ɶ�" : "�ļ����ɶ�");
        System.out.println( file.canWrite() ? "�ļ���д" : "�ļ�����д");
        // �ж��Ƿ���һ���ļ�
        System.out.println( file.isFile() ? "��һ���ļ�" : "����һ���ļ�");
        // �ж��Ƿ���һ��Ŀ¼
        System.out.println( file.isDirectory() ? "��һ��Ŀ¼" : "����һ��Ŀ¼");
        // ��ȡ�ļ�������޸�ʱ��
        System.out.println( "����޸�ʱ�䣺" + file.lastModified());
        // ��ȡ�ļ��Ĵ�С
        System.out.println("�Ƿ�ɹ�ɾ���ļ���" + file.delete());
    }
}
