package DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat:是日期/时间格式化之类的抽象类
作用：
    格式化（日期-->文本）、解析（文本-->日期）
成员方法：
    String format(Date date) 按照指定的模式，把Date日期格式化为符合模式的字符串
    Date parse(String source) 把符合模式的字符串解析为Date日期
DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

java.text.SimpleDateFormat
构造方法：
SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
模式：区分大小写
    y   年
    M   月
    d   日
    H   时
    m   分
    s   秒
例如："yyyy-MM-dd HH:mm:ss"
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }

    /*
    使用DateFormat类中的方法parse，把文本解析为日期
    使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        2.调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
    注意：
        public Date parse(String source) throws ParseException
        parse方法声明一个异常 ParseException解析异常
        如果字符串和构造方法中的模式不一样，就会抛出异常
        调用一个抛出异常的方法，必须处理这个异常，要么throws，要try...catch
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-10-21 13:57:25");
        System.out.println(date);

    }

    /*
    使用DateFormat类的format，把日期格式化为文本
    String format(Date date)    按照指定的模式，把Date日期，格式化为符合模式的字符串
    使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把日期格式化成符合模式的字符串

     */
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String str = sdf.format(date);
        System.out.println(str);    //2020-10-21 13:57:25
        System.out.println(date);   //Wed Oct 21 13:57:25 CST 2020
    }
}
