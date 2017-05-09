package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static{
        try{
            //Statics st = new Statics();
            BufferedReader reader = new BufferedReader(new FileReader(new File(Statics.FILE_NAME)));

            while (reader.ready()){
                String s = reader.readLine();
                if(s.equals(null)) break;
                lines.add(s);
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        System.out.println(lines);
    }
}
