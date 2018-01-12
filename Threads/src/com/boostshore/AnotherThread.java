package com.boostshore;

import static com.boostshore.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from another Thread " + currentThread().getName());
        try{
            Thread.sleep(5000);
            //Thread.sleep();
        } catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }


        System.out.println(ANSI_BLUE+"Three secounds have passed and I'm awake");
    }
}
