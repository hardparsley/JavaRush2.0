package com.javarush.task.task14.task1408;

/**
 * Created by Игорь on 09.04.2017.
 */
public  class MoldovanHen extends Hen{
    public  int getCountOfEggsPerMonth(){
        return 1;
    }

    public String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
