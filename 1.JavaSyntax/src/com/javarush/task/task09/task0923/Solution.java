package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Character> list = new ArrayList<Character>();

        ArrayList<Character> list_vowel = new ArrayList<Character>();

        String s = reader.readLine();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length;i++){
            list.add(arr[i]);
        }

        for (int i = 0; i < arr.length;i++){
            for(int j = 0; j < vowels.length;j++ ){
                if (arr[i]== vowels[j]) {
                    list_vowel.add(arr[i]);
                    list.remove(list.indexOf(arr[i]));

                }

            }

        }

        for (int i = 0; i <  arr.length;i++){
            if(arr[i] == ' '){
                list.remove(list.indexOf(arr[i]));
            }
        }

        for (Character x : list_vowel) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (Character x : list) {
            System.out.print(x + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}