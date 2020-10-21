package StrringBuilder;

/*
java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
成员方法：
    public StringBuilder append(...):添加任意类型数据的字符串形式，并返回对象自身
 */
public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder();
        /*StringBuilder b2 = b1.append("abc");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);*/
        /*
        使用append方法无需返回值
        b1.append("abc");
        b1.append("123");
        b1.append("中");
        b1.append("9.9");
        System.out.println(b1);*/

        /*
        链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        b1.append("abc").append("123").append("中").append("9.9");
        System.out.println(b1);
    }
}
