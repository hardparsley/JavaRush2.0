package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();

        reader.close();

        InputStream inStream = new FileInputStream(x);

        while (inStream.available() > 0)
        {
            System.out.print((char)inStream.read()); ; //читаем один байт из потока для чтения

        }

        inStream.close();
        System.out.println();

    }
}