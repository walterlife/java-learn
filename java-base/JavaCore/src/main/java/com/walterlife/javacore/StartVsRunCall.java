package com.walterlife.javacore;

import java.lang.Thread;

/**
 * Hello world!
 *
 */
public class StartVsRunCall {
    public static void main( String[] args ) {
        Thread startThread = new Thread(new Task("start"), "startThread"); 
        Thread runThread = new Thread(new Task("run"), "runThread"); 

        startThread.start();
        runThread.run();
    }

    private static class Task implements Runnable {
        private String caller;

        public Task(String caller) {
            this.caller = caller;
        } 

        public void run() {
            System.out.println("caller: " + this.caller + " and code exectue in thread " + Thread.currentThread().getName());
        } 
    } 
}
