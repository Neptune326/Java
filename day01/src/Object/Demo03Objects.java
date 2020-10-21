package Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";

       /* boolean a = s1.equals(s2);  //NullPointerException,null是不能调用方法的，会抛出空指针异常
        System.out.println(a);*/

        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
    }
}
