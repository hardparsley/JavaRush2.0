package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {
    public static Cat cat;

    static{
        cat = new Cat();
        cat.name = "cat";
        System.out.println(cat.name);
    }

    static class Cat{
        public String name;


    }

    public static void main(String[] args) {

    }
}
