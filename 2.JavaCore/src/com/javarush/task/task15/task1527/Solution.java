package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
try {
    String s = null;
    String[] list2;
    String[] list;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        s = reader.readLine();
        reader.close();
        if(s.isEmpty()) throw new Exception();



    s = s.substring(s.indexOf("?") + 1);
    list = s.split("&");


    for (String x : list) {

        if (x.contains("=")) {
            list2 = x.split("=");

            System.out.print(list2[0] + " ");
        } else System.out.print(x + " ");
    }
    System.out.println();
    for (String x : list) {
        if (x.contains("obj")) {
            list2 = x.split("=");
            try {
                alert(Double.parseDouble(list2[1]));
            } catch (Exception e) {
                alert(list2[1]);
            }
        }
    }

}
catch(Exception e){

}
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }
    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
