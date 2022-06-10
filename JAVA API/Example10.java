package cn.incast.chapter05.Example;

/*
 * System��ķ���
 *      public static Properties getProperties()
 *          ��ȡ��ǰϵͳ��ȫ�����ԣ�����һ��Properties���͵�����
 *          ���з�װ��ϵͳ���������ԣ���ʽ��������=����ֵ��
 *      public static String getProperty(String key)
 *          ��ȡָ����������Ӧ������ֵ
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
