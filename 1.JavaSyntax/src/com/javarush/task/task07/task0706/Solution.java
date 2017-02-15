package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[15];
        int sum1=0;
        int sum2=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arr.length;i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < arr.length;i++){
            if (i%2==0) sum1+=arr[i];
            else sum2+=arr[i];

        }

        /*System.out.println("сумма четных "  +sum1);
        System.out.println("сумма нечетных "  +sum2);*/
        if (sum2 > sum1) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else if (sum1 > sum2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
