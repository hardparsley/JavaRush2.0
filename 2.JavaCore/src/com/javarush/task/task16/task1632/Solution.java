package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static{
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
        threads.get(4).start();
    }


    public static class Thread1 extends Thread{
        public void run(){
            while (true){

            }
        }

    }
    public static class Thread2 extends Thread{
        public void run(){
            try{
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }
    public static class Thread3 extends Thread{
        public void run(){

            try {
               while(true) {
                   System.out.println("Ура");
                   Thread.currentThread().sleep(500);
               }
            } catch (InterruptedException e) {

            }
        }

    }
    public static class Thread4 extends Thread implements Message{
        public void showWarning(){
            this.interrupt();
        }

        public void run(){
            if(Thread.currentThread().isAlive()){
                showWarning();
            }
        }

    }
    public static class Thread5 extends Thread{
        public void run(){
            try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int summ=0;
                while(true){
                    String x = reader.readLine();
                    if(!x.equals("N")) {
                        summ+=Integer.parseInt(x);}
                    else{
                        System.out.println(summ);
                        break;
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}