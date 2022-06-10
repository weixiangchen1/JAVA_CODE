package cn.incast.chapter05.Example;

/*
 * System类的方法
 *      public static Properties getProperties()
 *          获取当前系统的全部属性，返回一个Properties类型的容器
 *          其中封装了系统的所有属性，形式“属性名=属性值”
 *      public static String getProperty(String key)
 *          获取指定属性名对应的属性值
 */
import java.util.Properties;
import java.util.Set;

public class Example10 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);

        Set<String> propertyNames = properties.stringPropertyNames();
        for (String key : propertyNames) {
            String value = System.getProperty(key);
            System.out.println(key + "---->" + value);
        }
    }
}
