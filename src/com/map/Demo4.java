package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<String> poker = new ArrayList<>();
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] num =  { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        for (String s : color) {
            for (String s1 : num) {
                poker.add(s+s1);
            }
        }

        poker.add("大王");
        poker.add("小王");

        Collections.shuffle(poker);

        List<Object> player1 = new ArrayList<>();
        List<Object> player2 = new ArrayList<>();
        List<Object> player3 = new ArrayList<>();
        List<Object> other = new ArrayList<>();

        for (int i = 0;i < poker.size(); i++) {
            if (i<3){
                other.add(poker.get(i));
            }else {
                if (i % 3 == 0){
                    player1.add(poker.get(i));
                } else if (i % 3 == 1) {
                    player2.add(poker.get(i));
                }else {
                    player3.add(poker.get(i));
                }
            }
        }
        System.out.println("player1:" + player1);
        System.out.println("player2:" + player2);
        System.out.println("player3:" + player3);
        System.out.println("other:" + other);
    }
}
