package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {


        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date start = new Date();
        Date indate = new Date(date);

        start.setHours(0);
        start.setMinutes(0);
        start.setSeconds(0);
        start.setDate(1);
        start.setMonth(0);
        start.setYear(indate.getYear());
        long razn = indate.getTime()-start.getTime();
        long msDay=24*60*60*1000;
        int day = (int) (razn/msDay);
        System.out.println(day);
        if(day%2==0) return false;
        else return true;
    }
}
