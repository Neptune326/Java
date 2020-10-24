package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符：
    ?:代表任意的数据类型
使用方式：
    不能创建对象使用
    只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(55);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");

        printArray(list1);
        printArray(list2);

    }
    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    我们不知道ArrayList集合使用什么数据类型，可以用泛型的通配符？来接收数据类型
    注意：
        泛型没有继承的概念
     */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            //it.next()方法，取出的元素是Object，可以接收任意的数据类型
            Object o = it.next();
            System.out.println(o);
        }
    }
}
