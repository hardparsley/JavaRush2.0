package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while(true){
            String s = reader.readLine();
            if (!s.equals("user") && !s.equals("loser") && !s.equals("coder") && !s.equals("proger")){
                break;
            }


            else if (s.equals("user")){
            //создаем объект, пункт 2
            person = new Person.User();
            }
            else if (s.equals("loser")){
                //создаем объект, пункт 2
                person = new Person.Loser();
            }
            else if (s.equals("coder")){
                person = new Person.Coder();
            }
            else if (s.equals("proger")){
                person = new Person.Proger();
            }
            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof  Person.User){
            Person.User person1 = (Person.User)person;
            person1.live();
        }
        else if (person instanceof  Person.Loser){
            Person.Loser person1 = (Person.Loser)person;
            person1.doNothing();
        }
        else if (person instanceof  Person.Coder){
            Person.Coder person1 = (Person.Coder)person;
            person1.coding();
        }
        else if (person instanceof  Person.Proger){
            Person.Proger person1 = (Person.Proger)person;
            person1.enjoy();
        }
    }
}
