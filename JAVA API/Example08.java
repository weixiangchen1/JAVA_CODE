package cn.incast.chapter05.Example;

public class Example08 {
    public static void main(String[] args) {
        // StringBuffer的常用方法
        // public StringBuffer append(String str) 向字符串缓冲区末尾添加新数据，返回当前StringBuffer本身
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.append("123");
        System.out.println(sb);

        // public StringBuffer insert(int index, String str) 向字符串缓冲区指定位置上插入指定的数据
        sb.insert(2, "!!");
        System.out.println(sb);

        // public StringBuffer delete(int start, int end) 删除指定范围的数据
        sb.delete(2,4);
        System.out.println(sb);

        // public StringBuffer deleteCharAt(int index) 删除指定位置的数据
        sb.deleteCharAt(0);
        System.out.println(sb);

        // public int length() 获取字符串缓冲区的长度
        sb.delete(0,sb.length());
        System.out.println(sb);

        // public StringBuffer replace(int start, int end, String str) 替换指定范围的数据
        StringBuffer sb1 = new StringBuffer("hello world");
        sb1.replace(6,11,"java");
        System.out.println(sb1);

        // public StringBuffer setCharAt(int index, char ch) 替换指定位置的数据
        sb1.setCharAt(5,',');
        System.out.println(sb1);

        // public StringBuffer reverse() 字符串缓冲区翻转
        System.out.println(sb1.reverse());
    }
}
