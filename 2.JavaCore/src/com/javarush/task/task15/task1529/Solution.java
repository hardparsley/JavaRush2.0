package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();

    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        int i_param=0;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (line.equals("helicopter")){
            result = new Helicopter();
        }
        else if (line.equals("plane")){
            try {
                String param = reader.readLine();
                i_param = Integer.parseInt(param);
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = new Plane(i_param);
        }
    }
}
