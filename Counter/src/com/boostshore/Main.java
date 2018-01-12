package com.boostshore;

import static java.lang.Thread.currentThread;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}


class CountDown{
    public void doCountDown(){
        String color;

        switch (currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_CYAN;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;

        }

        for(int i=10;i>0;i--){
            System.out.println(color+ currentThread().getName() = ": i ="+i);
        }
    }
}

class CountDownThread extends Thread{
    private CountDown threadCountDown;

    public CountDownThread(CountDown countDown){
        threadCountDown = countDown;
    }

    public void run(){
        
    }
}