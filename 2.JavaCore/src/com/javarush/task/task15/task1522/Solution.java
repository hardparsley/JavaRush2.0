package com.javarush.task.task15.task1522;

import sun.awt.image.BufferedImageDevice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }
    static{
        readKeyFromConsoleAndInitPlanet();
    }


    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (line.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }
        else if (line.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        }
        else if (line.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        }

        else thePlanet = null;

    }

}
