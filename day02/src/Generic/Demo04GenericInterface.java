package Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterface对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

        //创建GenericInterfaceImpl对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);


    }
}
