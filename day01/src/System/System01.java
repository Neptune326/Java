package System;

import java.util.Arrays;

/*
System类的方法：
     public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
     public static long currentTimeMillis()
 */
public class System01 {
    public static void main(String[] args) {
        demo02();
    }

    /*
    public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length):
    将数组中指定的数据拷贝到另一个数组中
    参数：
        src:原数组
        srcPos:原数组的起始位置
        dest:目标数组
        destPos:目标数组的起始位置
        length:要复制的数组元素的数量
    练习：
        将src数组中的3个元素，复制到dest数组的前三个位置上
        复制元素前：src数组：{1,2,3,4,5}，dest数组：{6,7,8,9,10}
        复制元素后：src数组：{1,2,3,4,5}，dest数组：{1,2,3,9,10}
     */
    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};

        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));

    }

    /*
    public static long currentTimeMillis():返回以毫秒值为单位的当前时间
    用来测试程序的效率
     */
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序运行一共消耗" + (e - s) + "毫秒");
    }
}
