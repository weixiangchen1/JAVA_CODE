package cn.incast.chapter05.Example;
/*
 *      public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 *      src - Դ���顣
 *      srcPos - Դ�����е���ʼλ�á�
 *      dest - Ŀ�����顣
 *      destPos - Ŀ�ĵ������е���ʼλ�á�
 *      length - Ҫ���Ƶ�����Ԫ�ص�������
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
