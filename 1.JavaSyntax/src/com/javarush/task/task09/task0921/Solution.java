package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args)  {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            while(true){
                Integer s = Integer.parseInt(reader.readLine());
                if (s instanceof Integer) {
                    list.add(s);
                }
                else break;
            }

        }
        catch (NumberFormatException e){
            for(Integer x : list){
                System.out.println(x);
            }
        }
        catch (IOException e){

        }
    }
}
