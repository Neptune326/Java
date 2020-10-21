package StrringBuilder;

/*
java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
成员方法：
  toString
String和StringBuilder可以相互转换：
String-->StringBuilder：可以使用StringBuilder的构造方法
    StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容
StringBuilder-->String：可以使用StringBuilder中的toString方法
    public String toString():将当前StringBuilder对象转换为String对象
 */
public class StringBuilder03 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        //向StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:" + bu);

        //StringBuilder-->String
        String s = bu.toString();
        System.out.println(s);
    }
}
