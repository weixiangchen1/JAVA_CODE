package cn.incast.chapter05.Example;
/*
 *  记录一个子串在整串中出现的次数
 */
public class Example09 {
    public static void main(String[] args) {
        String str = "abcdjjfkdkfjabcjfkdjabckjkfjabcabc";
        String key = "abc";
        int count = getKeyStringCount(str,key);
        System.out.println("count = " + count);
    }

    public static int getKeyStringCount(String str, String key)
    {
        int count = 0;
        if(!str.contains(key)) {
            return count;
        }

        int index = 0;
        while((index = str.indexOf(key)) != -1){
            count++;
            str = str.substring(index + key.length());
        }

        return count;
    }
}
