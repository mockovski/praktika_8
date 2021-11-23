package com.company;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();//хэш-таблица
        hashMap.put("Cat", new Cat("Kate"));
        hashMap.put("Dog", new Dog("Yara"));
        hashMap.put("Owl", new Owl("Splusha"));

        Set<Map.Entry<String, Pet>> set = hashMap.entrySet();

        for (Map.Entry<String, Pet> me : set) {
            System.out.print(me.getKey() + " name is ");
            System.out.println(me.getValue());
        }
    }
}
