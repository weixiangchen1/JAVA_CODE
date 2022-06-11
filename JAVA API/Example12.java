package cn.incast.chapter05.Example;
/*
 *      public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 *      src - 源数组。
 *      srcPos - 源数组中的起始位置。
 *      dest - 目标数组。
 *      destPos - 目的地数据中的起始位置。
 *      length - 要复制的数组元素的数量。
 */
public class Example12 {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] destArray = {10, 20, 30, 40, 50, 60};

        System.arraycopy(srcArray, 2, destArray, 2, 4);
        for(int x : destArray){
            System.out.printf(String.valueOf(x) + " ");
        }
    }
}
