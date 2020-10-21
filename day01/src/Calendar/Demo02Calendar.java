package Calendar;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的成员方法：
    public int get(int field)   返回给定日历字段的值
    public void set(int field,int value)    将给定的日历字段设置为定值
    public abstract void add(int field,int amount)  根据日历的规则，为给定的日历字段添加或减去指定的时间量
    public Date getTime()   返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
成员方法的参数：
    int field:日历类的字段，可以使用Calendar类的静态成员变量获取
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }

    //public Date getTime()
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /* public abstract void add(int field,int amount)
        amount: 正数：增加，负数：减少
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,3);
        c.add(Calendar.MONTH,-4);

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
    }

    // public void set(int field,int value)
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,5);
        c.set(Calendar.DATE,23);

        //可以同时设置年月日，使用set的重载方法
        c.set(8888,3,14);
    }

    //public int get(int field)
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);  //西方的月份：0-11 东方：1-12

        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }
}
