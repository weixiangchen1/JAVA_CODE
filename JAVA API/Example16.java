package cn.incast.chapter05.Example;
/*
 * Random类的视同
 * public int nextInt(int bound) 返回伪随机的，均匀分布int值介于0（含）和指定值（不包括），从该随机数生成器的序列绘制。
 */
import java.util.Random;

public class Example16 {
    public static void main(String[] args) {
        Random r = new Random();
        // 随机产生10个0-100之间的数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
