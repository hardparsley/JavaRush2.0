package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> list = new ArrayList<Human>();
        ArrayList<Human> listC = new ArrayList<Human>();
        ArrayList<Human> list2 = new ArrayList<Human>();
        ArrayList<Human> list3 = new ArrayList<Human>();
        ArrayList<Human> listGp = new ArrayList<Human>();

        Human ch1 = new Human("ben", true, 7, list);
        Human ch2 = new Human("gom", true, 4, list);
        Human ch3 = new Human("Olya", false, 10, list);
        listC.add(ch1);
        listC.add(ch2);
        listC.add(ch3);
        Human pap = new Human("pap", true, 24, listC);
        Human mam = new Human("mam", false, 20, listC);
        list2.add(pap);
        list3.add(mam);

        Human ded1 = new Human("ded1", true, 64, list2);
        Human bab1 = new Human("bab1", false, 50, list2);
        Human ded2 = new Human("ded2", true, 63, list3);
        Human bab2 = new Human("bab2", false, 55, list3);
        listGp.add(ded1);
        listGp.add(ded2);
        listGp.add(bab1);
        listGp.add(bab2);


        for (Human hu: listC){
            System.out.println(hu);
        }
        for (Human hu: list2){
            System.out.println(hu);
        }
        for (Human hu: list3){
            System.out.println(hu);
        }
        for (Human hu: listGp){
            System.out.println(hu);
        }



    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex,int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
