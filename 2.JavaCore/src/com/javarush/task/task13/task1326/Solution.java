package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedReader readerB = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        while(readerB.ready()){
            int data = Integer.parseInt(readerB.readLine()) ;
            if (data % 2 == 0) list.add(data);
        }

        Collections.sort(list);
        for (Integer x : list) System.out.println(x);
        readerB.close();
    }


}
