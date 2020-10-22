package Generic;
/*

 */
public class GenericClass02 {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj);

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(2);
        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("张三");
        String name1 = gc3.getName();
        System.out.println(name1);

    }
}
