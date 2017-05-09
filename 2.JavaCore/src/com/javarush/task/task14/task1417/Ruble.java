package com.javarush.task.task14.task1417;

/**
 * Created by mi on 24.04.2017.
 */
public class Ruble extends Money {

    public Ruble(double amount){
        super(amount);
    }

    public String getCurrencyName(){
        return "RUB";
    }
}
