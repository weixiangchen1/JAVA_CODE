package cn.incast.chapter05.Example;
/*
 * Random�����ͬ
 * public int nextInt(int bound) ����α����ģ����ȷֲ�intֵ����0��������ָ��ֵ�������������Ӹ�����������������л��ơ�
 */
import java.util.Random;

public class Example16 {
    public static void main(String[] args) {
        Random r = new Random();
        // �������10��0-100֮�����
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
