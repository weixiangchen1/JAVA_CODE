package cn.incast.chapter05.Example;

public class Example05 {
    public static void main(String[] args) {
        // String类的判断操作
        // public boolean startsWith(String str) 判断字符串是否以给定字符开头
        String s = "String";
        System.out.println("判断字符串是否以Str开头：" + s.startsWith("Str"));

        // public boolean endsWith(String str) 判断字符串是否以给定字符结束
        System.out.println("判断字符串是否以ing结尾：" + s.endsWith("ing"));

        // public boolean contains(string str) 判断字符串是否包含给定字符串
        System.out.println("判断字符串是否包含tr：" + s.contains("tr"));

        // public boolean isEmpty() 判断字符串是否为空
        System.out.println("判断当前字符串是否为空：" + s.isEmpty());

        // public boolean equals(String str) 判断字符串与给定字符串str的内容是否相同
        System.out.println("判断字符串是否相同：" + s.equals("String"));
    }
}
