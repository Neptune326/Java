package Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }

    /*
    Date类的成员方法
    long getTime() 把日期转换成毫秒（相当于System.currentTimeMillis()）
    返回自1970年 1月 1日 00:00:00 GMT 以来此Date对象表示的毫秒值
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
        Date类的带参数构造方法：
            Date(long date):传递毫秒值，把毫秒转换成Date日期
     */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);

        Date date1 = new Date(124243235251L);
        System.out.println(date1);
    }

    /*
    Date类的空参数构造方法：
        Date()获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
