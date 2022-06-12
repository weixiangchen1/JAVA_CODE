package cn.incast.chapter05.Example;

public class Example15 {
    public static void main(String[] args) {
        // static int abs(int a) 返回值为 int绝对值
        System.out.println(Math.abs(-445));

        // static double ceil(double a) 返回大于或等于参数的最小（最接近负无穷大） double值
        System.out.println(Math.ceil(5.6));

        // static double floor(double a) 返回小于或等于参数的最大（最接近正无穷大） double值，等于一个数学整数。
        System.out.println(Math.floor(-5.6));

        // static double max(double a, double b) 返回两个 double值中的较大值。
        System.out.println(Math.max(6.1, 6.7));

        // static double min(double a, double b) 返回两个 double的较小值。
        System.out.println(Math.min(2.1, 2.6));

        // static double random() 返回值为 double值为正号，大于等于 0.0 ，小于 1.0 。
        System.out.println(Math.random());
    }
}
