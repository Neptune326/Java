package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection接口
    所有单列集合的最顶层接口，定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法
共性的方法：
    public boolean add(E e)  把给定的对象添加到当前集合中 。
    public void clear() 清空集合中所有的元素。
    public boolean remove(E e) 把给定的对象在当前集合中删除。
    public boolean contains(E e) 判断当前集合中是否包含给定的对象。
    public boolean isEmpty() 判断当前集合是否为空。
    public int size() 返回集合中元素的个数。
    public Object[] toArray() 把集合中的元素，存储到数组中。
 */
public class Collection01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        System.out.println("========================");

        //public boolean add(E e)
        boolean a1 = coll.add("张三");
        System.out.println("a1:" + a1);//a1:true
        System.out.println(coll);//[张三]

        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);//[张三, 李四, 王五, 赵六, 田七]
        System.out.println("========================");

        //public boolean remove(E e)
        boolean b1 = coll.remove("王五");
        System.out.println("b1:" + b1);//b1:true

        boolean b2 = coll.remove("王二");
        System.out.println("b2:" + b2);//b2:false
        System.out.println(coll);//[张三, 李四, 赵六, 田七]
        System.out.println("========================");

        //public boolean contains(E e)
        boolean c1 = coll.contains("李四");
        System.out.println("c1:" + c1);//c1:true

        boolean c2 = coll.contains("李五");
        System.out.println("c2:" + c2);//c2:false
        System.out.println("========================");

        //public boolean isEmpty()
        boolean d = coll.isEmpty();
        System.out.println("isEmpty?" + d);//isEmpty?false
        System.out.println("========================");

        //public int size()
        int size = coll.size();
        System.out.println("size:" + size);//size:4
        System.out.println("========================");

        //public Object[] toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========================");

        //public void clear()
        coll.clear();
        System.out.println(coll);//[]
        System.out.println("isEmpty?" + coll.isEmpty());//isEmpty?true
    }
}
