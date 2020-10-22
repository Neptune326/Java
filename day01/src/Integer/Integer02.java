package Integer;
/*
自动装箱与自动拆箱：
    JDK1.5之后，基本类型的数据和包装类之间可以自动的相互转换
 */
public class Integer02 {
    public static void main(String[] args) {

    /*
    自动装箱：直接把int类型的整数赋值给包装类
    Integer in = 1; 相当于 Integer in = new Integer(1);
     */
        Integer in = 1;
    /*
    自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本类型的数据，在参与计算
    in + 2; 相当于in.intValue() + 2 = 3;
    in = in + 2;相当于in = new Integer(3);
     */
        in = in + 3;
    }
}
