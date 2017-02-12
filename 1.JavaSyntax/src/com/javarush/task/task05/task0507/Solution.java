package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            String s = reader.readLine();
            int k = Integer.parseInt(s);

            if (s.equals("-1")){
                break;
            }
            list.add(k);
        }
        int sum = 0;
        for (Integer i : list){
            sum += i;
        }
        System.out.println((double)sum/list.size());
    }
}

