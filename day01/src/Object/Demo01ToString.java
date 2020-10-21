package Object;

/*
java.lang.Object类
Objcet类是每个类的超（父）类。
所有对象（包括数组）都实现这个类的方法
 */
public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        String str = p.toString();
        System.out.println(str);
        System.out.println("=======================");

        //直接打印对象名字等同于调用toString方法，p = p.toString
        System.out.println(p);
    }
}
