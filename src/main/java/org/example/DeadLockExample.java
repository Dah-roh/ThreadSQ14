package org.example;

public class DeadLockExample{

    public static void main(String[] args) throws InterruptedException {

        final String lock1 = "LOCK ONE";
        final String lock2 = "LOCK TWO";
        Thread thread1 = new Thread() {
            public void run() {
                //first synchroni
                synchronized (lock1) {
                    System.out.println("Thread 1: is using the first lock");
                    try{
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException exception){
                    }
                    //waiting for thread 2 to release lock2...
                    synchronized (lock2){
                        System.out.println("Thread 1: is using the second lock");

                    }
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread 2: is using the second lock");
                    try{
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException exception){
                    }
                    synchronized (lock1){
                        System.out.println("Thread 2: is using the first lock");
                    }
                }
            }
        };

        thread1.start();
        thread1.join();
        thread2.start();

    }
}
