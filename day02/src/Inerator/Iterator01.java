package Inerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器（对集合进行遍历）
有两个常用方法：
    boolean hasNext()   如果有元素可以迭代，返回true
        判断集合中还有没下一个元素，有就返回true，没有就返回false
    E next()    返回迭代的下一个元素
        取出集合中的下一个元素
Iterator迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
Collection接口中有一个返回，叫iterator（），这个返回的返回就是迭代器的实现类对象
    Iterator<E> iterator()  返回在此collection的元素上进行迭代的迭代器

迭代器的使用步骤：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        注意：
            Iterator<E>接口也是有泛型的，集合是什么泛型，迭代器就是什么泛型
    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
    3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Iterator01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("================");

        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            System.out.println(it2.next());
        }
    }
}
