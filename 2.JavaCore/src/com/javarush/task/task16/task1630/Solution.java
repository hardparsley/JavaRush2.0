package com.javarush.task.task16.task1630;

import java.io.*;


public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);

        //add your code here - добавьте код тут
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String filename;
        String result="";


        @Override
        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        @Override
        public String getFileContent() {
            return result;
        }
        public void run(){

            try {
                File file = new File(filename);

                //создаем объект FileReader для объекта File
                FileReader fr = new FileReader(file);
                //создаем BufferedReader с существующего FileReader для построчного считывания
                BufferedReader reader = new BufferedReader(fr);
                // считаем с строку

                while(reader.ready()){
                    result += reader.readLine() + " ";
                }
                reader.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
