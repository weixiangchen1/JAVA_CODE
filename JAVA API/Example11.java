package cn.incast.chapter05.Example;
/*
 * public static long currentTimeMillis()
 *      ��������һ����1970��1��1��0��0��0��֮���ʱ������Ϊlong����λ����
 */
public class Example11 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("�������е�ʱ��" + (endTime - startTime));
    }
}
