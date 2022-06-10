package cn.incast.chapter05.Example;
/*
 * public static long currentTimeMillis()
 *      方法返回一个与1970年1月1号0点0分0秒之间的时间差，类型为long，单位毫秒
 */
public class Example11 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("程序运行的时间" + (endTime - startTime));
    }
}
