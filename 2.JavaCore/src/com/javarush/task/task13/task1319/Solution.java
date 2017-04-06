package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String x;
        while(true){
            x = reader.readLine();
            writer.write(x);
            writer.newLine();
            if (x.equals("exit")) break;

        }


        reader.close();
        writer.close();



    }
}
