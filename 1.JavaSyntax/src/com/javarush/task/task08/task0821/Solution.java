package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();


        map.put("Иванов", "Игорь");
        map.put("Петров", "Сергей");
        map.put("Сидоров", "Алексей");
        map.put("Слонов", "Игорь");
        map.put("Бегемотов", "Игорь");
        map.put("Котов", "Алексей");
        map.put("Песов", "Алексей");
        map.put("Котов", "Петр");
        map.put("Слонов", "Петр");
        map.put("Мяу", "Петр");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
