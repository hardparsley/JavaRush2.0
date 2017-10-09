package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            int a = countSeconds;
            while(!this.isInterrupted()){

                    try {
                        System.out.println(countSeconds);
                        Thread.sleep(1000);
                        if(countSeconds < 2) {
                            throw new InterruptedException();
                        }
                        else {
                            countSeconds--;

                        }
                    }
                    catch (InterruptedException e) {
                        if (a==3){
                            System.out.println("Марш!");
                        }
                        else if(a==4){
                            System.out.println("Прервано!");
                        }

                        return;
                    }


            }
        }
    }
}
