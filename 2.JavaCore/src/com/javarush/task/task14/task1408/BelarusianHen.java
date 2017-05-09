package com.javarush.task.task14.task1408;

/**
 * Created by Игорь on 09.04.2017.
 */
public  class BelarusianHen extends Hen{
    public  int getCountOfEggsPerMonth(){
        return 6;
    }

    public String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
