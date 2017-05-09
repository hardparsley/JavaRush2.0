package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args)  {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        /*Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        Hen hen4 = HenFactory.getHen(Country.MOLDOVA);*/
        hen.getCountOfEggsPerMonth();
       /* System.out.println(hen.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
        System.out.println(hen4.getDescription());*/

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            }
            else if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            }
            else if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            }
            else if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();


            }

            return hen;
        }
    }
}
