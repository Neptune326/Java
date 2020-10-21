package StrringBuilder;

/*
java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
构造方法：
    public StringBuilder():构造一个空的StringBuilder容器
    public StringBuilder(String str):构造一个StringBuilder容器，并将字符串添加进去
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder();
        System.out.println("b1:" + b1);

        StringBuilder b2 = new StringBuilder("abc");
        System.out.println("b2:" + b2);
    }
}
