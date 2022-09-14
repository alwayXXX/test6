package com.map;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Student, String> hm1 = new HashMap<>();
        hm1.put(new Student("张三",20),"江苏");
        hm1.put(new Student("李四",21),"上海");
        hm1.put(new Student("王五",20),"广州");

        HashMap<Student, String> hm2 = new HashMap<>();
        hm2.put(new Student("顶真",26),"西藏");
        hm2.put(new Student("搔宝",27),"美国");
        hm2.put(new Student("黄硕",28),"越南");

        HashMap<HashMap<Student,String>,String> hm = new HashMap<>();
        hm.put(hm1,"88");
        hm.put(hm2,"99");

        for (HashMap<Student, String> h : hm.keySet()) {
            String value = hm.get(h);
            System.out.println("value = "+value);
            for (Student key : h.keySet()) {
                String value2 = h.get(key);
                System.out.println(key.getName() + " = " + value2 + " = " + value);
            }
        }
    }
}