package Integer;
/*
装箱：把基本类型的数据，包装到包装类中（基本数据类型-->包装类）
    构造方法：
        Integer(int value) 构造一个新分配Integer对象，它表示指定的int值
        Integer(String s) 构造一个新分配的Integer对戏，它表示String参数所指示的int值
            传递的字符串，必须是基本数据类型的字符串，否则抛出异常，“100”正确，“a”抛异常
    静态方法：
        static Integer valueOf(int i) 返回一个表示指定的int值的Integer对象
        static Integer valueOf(String s) 返回保存指定的String的值的Integer对象
拆箱：在包装类中去除基本数据类型的数据（包装类-->基本类型的数据）
    成员方法：int intValue() 以int类型返回该Integer的值
 */
public class Integer01 {
    public static void main(String[] args) {
        //装箱
        Integer i1 = new Integer(1);
        System.out.println(i1);

        Integer i2 = new Integer("1");
        System.out.println(i2);

        Integer i3 = Integer.valueOf(1);
        System.out.println(i3);

        //Integer b = Integer.valueOf("a"); NumberFormatException 数字格式化异常
        Integer i4 = Integer.valueOf("1");
        System.out.println(i4);

        //拆箱
        int i = i1.intValue();
        System.out.println(i);
    }
}
