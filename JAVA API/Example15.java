package cn.incast.chapter05.Example;

public class Example15 {
    public static void main(String[] args) {
        // static int abs(int a) ����ֵΪ int����ֵ
        System.out.println(Math.abs(-445));

        // static double ceil(double a) ���ش��ڻ���ڲ�������С����ӽ�������� doubleֵ
        System.out.println(Math.ceil(5.6));

        // static double floor(double a) ����С�ڻ���ڲ����������ӽ�������� doubleֵ������һ����ѧ������
        System.out.println(Math.floor(-5.6));

        // static double max(double a, double b) �������� doubleֵ�еĽϴ�ֵ��
        System.out.println(Math.max(6.1, 6.7));

        // static double min(double a, double b) �������� double�Ľ�Сֵ��
        System.out.println(Math.min(2.1, 2.6));

        // static double random() ����ֵΪ doubleֵΪ���ţ����ڵ��� 0.0 ��С�� 1.0 ��
        System.out.println(Math.random());
    }
}
