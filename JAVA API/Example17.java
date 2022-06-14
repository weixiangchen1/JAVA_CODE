package cn.incast.chapter05.Example;

import java.util.Random;

public class Example17 {
    public static void main(String[] args) {
        Random r = new Random(13);
        // 随机产生10个0-100之间的数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
