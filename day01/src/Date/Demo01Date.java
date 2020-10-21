package Date;
/*
java.util.Date:表示日期和时间的类
类 Date 表示特点的瞬间，精确到毫秒
1000毫秒=1秒

把日期转换成毫秒：
时间原点：1970年1月1日00:00:00（英国格林威治）
注意：中国属于东八区，会把时间加上八个小时

把毫秒转换成日期：
1天= 24 * 60 * 60 = 86400 毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前时间到1970年1月1日00:00:00一共过了多少毫秒

    }
}
