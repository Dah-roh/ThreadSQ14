package org.example;

public class Main {
    public static void main(String[] args) {

        ExampleThread exampleThread =  new ExampleThread();
        Thread thread1 = new Thread(exampleThread, "thread 1");
        Thread thread2 = new Thread(exampleThread, "thread 2");
        thread1.start();
        thread2.start();
    }
}
