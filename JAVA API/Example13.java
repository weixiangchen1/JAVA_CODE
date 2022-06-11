package cn.incast.chapter05.Example;
/*
 *  Runtime类的使用
 */
public class Example13 {
    public static void main(String[] args) {
        // public static Runtime getRuntime() 返回与当前Java应用程序关联的运行时对象。
        Runtime rt = Runtime.getRuntime();

        // public int availableProcessors()返回可用于Java虚拟机的处理器数量。
        System.out.println("可用于Java虚拟机的处理器数量:" + rt.availableProcessors());

        // public long freeMemory()返回Java虚拟机中的可用内存量。
        System.out.println("Java虚拟机中的可用内存量:" + rt.freeMemory()/1024/1024 + "MB");

        // public long maxMemory()返回Java虚拟机将尝试使用的最大内存量。
        System.out.println("Java虚拟机将尝试使用的最大内存量:" + rt.maxMemory()/1024/1024 + "MB");
    }
}
