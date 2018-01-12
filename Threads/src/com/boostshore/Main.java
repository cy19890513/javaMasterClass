package com.boostshore;

import static com.boostshore.ThreadColor.ANSI_GREEN;
import static com.boostshore.ThreadColor.ANSI_PURPLE;
import static com.boostshore.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
	// write your code here

        final Thread aThread = new AnotherThread();
        aThread.setName("====AThread====");
        aThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main Thread.");

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());

        Thread myRunnableThread2 = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"Hello from anonymous class implementation run()");
                try{
                    aThread.join(2000);
                    System.out.println(ANSI_RED+"Another Thread terminated, or timed out, so i am running again");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED+"I couldn't wait after all. i was interrupted");
                }
            }
        });
        myRunnableThread2.start();
        aThread.interrupt();
    }
}
