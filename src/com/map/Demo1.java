package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String str = "aaaabbbcccccccccc";
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            if (!map.containsKey(c)) {
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            Character key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key+"所出现的次数"+value);
        }
    }
}
