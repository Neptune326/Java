package Object;

public class Demo02Equals {
    public static void main(String[] args) {
        /*boolean equals(Object obj) 指其它某个对象是否与此对象“相等”
        Object类equals方法的源码：
            public boolean equals(Object obj){
                return(this == obj)
            }

            ==:
                基本数据类型：比较的是值
                引用数据类型：比较的是两个对象的地址值

            this --> zs
            obj  --> ls

            this == obj --> zs == ls
         */
        Person zs = new Person("zs", 18);
        Person ls = new Person("ls", 20);

        boolean a = zs.equals(ls);
        System.out.println(a);  //false
    }
}
