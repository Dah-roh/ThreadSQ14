package org.example;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Timer timer =  new Timer();
        ScheduledTaskExample scheduledTaskExample =  new ScheduledTaskExample();
        timer.schedule(scheduledTaskExample, 5000, 1000);







        ExampleThread exampleThread =  new ExampleThread();
        Thread thread1 = new Thread(exampleThread, "thread 1");
        Thread thread2 = new Thread(exampleThread, "thread 2");
        thread1.start();
        thread2.start();
    }
}
