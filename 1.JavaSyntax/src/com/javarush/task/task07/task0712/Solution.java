package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        int min_index = 0;

        for(int i = 1;i < 10;i++){
            if (list.get(i).length() < min){
                min = list.get(i).length();
                min_index = i;
            }

        }
        int max = list.get(0).length();
        int max_index = 0;

        for(int i = 1;i < 10;i++){
            if (list.get(i).length() > max){
                max = list.get(i).length();
                max_index = i;
            }

        }

        if (min_index < max_index) System.out.println(list.get(min_index));
        else if (max_index < min_index) System.out.println(list.get(max_index));


    }
}
