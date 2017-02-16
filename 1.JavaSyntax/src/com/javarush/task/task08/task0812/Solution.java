package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list_counters = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        int counter=1;
        int save_count=1;

        for (int i = 0; i < list.size()-1;i++){

            if (list.get(i).equals(list.get(i+1))){

               counter++;

                if (save_count < counter) save_count = counter;

            }

            else counter = 1;

        }


        System.out.println(save_count);

    }
}