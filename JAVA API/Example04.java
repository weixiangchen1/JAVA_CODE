package cn.incast.chapter05.Example;

public class Example04 {
    public static void main(String[] args) {
        // String类的替换与去除空格操作
        // public String replace(String oldStr, String newStr)
        // 将原有字符串oldStr字符串内容用newStr字符串代替，返回一个新的字符串
        String s = "itcase";
        String s1 = " i t c a s e";
        System.out.println("将it替换成cn.it之后的结果：" + s.replace("it", "cn.it"));

        // public String trim() 返回一个新字符串，去除了原有字符串的两端空格
        System.out.println("去除左右两边空格后的结果：" + s1.trim());

        System.out.println("去除全部空格后的结果：" + s1.replace(" ", ""));
    }
}
