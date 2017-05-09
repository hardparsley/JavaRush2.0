package com.javarush.task.task14.task1421;

/**
 * Created by mi on 25.04.2017.
 */
public class Singleton {

    private static Singleton instance;

    private  Singleton(){
        //System.out.println("hi");
    }



    public static  Singleton getInstance(){

        return instance;

    }



}
