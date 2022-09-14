package com.map;

import java.util.HashMap;
import java.util.Map;

public class Loop {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

       for (Map.Entry<String, Integer> en:map.entrySet()){
           System.out.printf(en.getKey()+"..."+en.getValue());
       }
    }
}
