package DateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：
    使用日期时间相关的API，计算一个人已经出生了多少天
分析：
    1.使用Scanner类的next方法，获取出生日期
    2.使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
    3.把Date格式的日期转换成毫秒值
    4.获取当前日期，转换成毫秒值
    5.计算天数
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期（格式：xxxx年xx月xx日）：");
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = sdf.parse(str);
        long before = date1.getTime();

        Date date2 = new Date();
        long now = date2.getTime();

        long day = (now - before) / (24 * 60 * 60 * 1000);

        System.out.println("您出生了" + day + "天");

    }
}
