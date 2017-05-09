package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);


            if((n1 <= 0) || (n2 <= 0)){
                throw new Exception();
            }
        // Алгоритм Евклида
        while(n1!=0 && n2!=0){
            if(n1>n2) n1=n1%n2;
            else n2=n2%n1;
        }
        System.out.println(n1+n2);

        /*
        List<Integer> list = new ArrayList();
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Integer> list3 = new ArrayList();



        Collections.addAll(list, 2, 3, 5, 7, 11, 13, 17, 19);
        int div = n1;
        int dov = n2;
        for(int i = 0; i < list.size();i++){

                while(div % list.get(i)==0){
                    div = div / list.get(i);
                    list1.add(list.get(i));

                }

                while(dov % list.get(i)==0){
                dov = dov / list.get(i);
                list2.add(list.get(i));

                }
        }
        int mp=1;
        if (list1.size() <= list2.size()){

            for(int i = 0; i < list1.size();i++){
                if (list1.get(i).equals(list2.get(i))){
                   list3.add(list1.get(i));
                }
            }
        }
        else if (list1.size() > list2.size()){

            for(int i = 0; i < list2.size();i++){
                if (list1.get(i).equals(list2.get(i))){
                    list3.add(list2.get(i));
                }
            }
        }

        for(Integer x : list1) System.out.print(x);
        System.out.println();
        for(Integer x : list2) System.out.print(x);
        System.out.println();
        for(Integer x : list3) System.out.print(x);
        System.out.println();
        for(int i =0;i < list3.size();i++) {
            mp=mp*list3.get(i);
        }
        System.out.println(mp);
*/
    }
}
