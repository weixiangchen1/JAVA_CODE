package cn.incast.chapter05.Example;

public class Example06 {
    public static void main(String[] args) {
        // String类的截取和分割操作
        // public String substring(int start) 返回一个新字符串，从原有字符串指定位置开始截取，到末尾结束
        // public String substring(int start, int end) 返回一个新字符串，从原有字符串指定位置开始截取，到指定位置结束
        String s = "hello world!";
        System.out.println("从第6个字符开始截取到末尾的结果：" + s.substring(6));
        System.out.println("从第6个字符开始截取到第11个字符：" + s.substring(6,11));

        // public String[] split(String regex) 按照指定的字符串进行分割返回一个字符串数组
        System.out.println("打印分割后的每个字符串内容");
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i] + " ");
        }
    }
}
