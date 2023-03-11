package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MultithreadedCounterTest {

    @Test
    public void testCounter() throws InterruptedException {
        CounterIncrementer counterIncrementer = new CounterIncrementer();
        Thread thread =  new Thread(new Runnable(){
            @Override
            public void run() {
                counterIncrementer.increment();
            }
        });
        Thread thread1 =  new Thread(()->{
            counterIncrementer.increment();
        });

        thread.start();
//        thread.join();
        thread1.start();
//        thread1.join();


        Assert.assertEquals(2, counterIncrementer.getCounter());
    }
}
