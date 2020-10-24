package Test;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例：
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个ArrayList集合存储54张牌，泛型为String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，分别存储花色和序号
        String[] colors = {"黑桃", "红心", "黑梅", "红方"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //先把大小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装剩下的牌
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }
        /* System.out.println(poker);*/

        /*
        2.洗牌
        使用集合的工具类Collections中的方法
        static void shuffle(List<?> list)   使用默认随机源对指定列表进行置换
         */
        Collections.shuffle(poker);
        /* System.out.println(poker);*/

        /*
        3.发牌
        定义4个集合，存储3个玩家的牌和底牌
         */
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /*
        遍历poker集合，获取每一张牌
        使用poker集合的索引%3  给3个玩家发牌
        最后三张牌作为底牌
         */
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51) {
                diPai.add(s);
            } else if (i % 3 == 0) {
                play1.add(s);
            } else if (i % 3 == 1) {
                play2.add(s);
            } else {
                play3.add(s);
            }
        }

        //4.看牌
        System.out.println("张三：" + play1);
        System.out.println("李四：" + play2);
        System.out.println("王五：" + play3);
        System.out.println("底牌：" + diPai);

    }
}
