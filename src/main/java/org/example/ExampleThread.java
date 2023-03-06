package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class ExampleThread implements Runnable {
//    static String[] listOfString;
    static AtomicReferenceArray<String> listOfString;

    @Override
    public void run() {
        final int numberOfAdditions = 100;
        listOfString = new AtomicReferenceArray<>(numberOfAdditions);
//        listOfString = new String[numberOfAdditions];
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfAdditions);

            for (int i = 0; i < numberOfAdditions; i++) {
                int finalI = i;
                executorService.execute(() -> {

//                    listOfString[finalI] = "Java Squad 14";
                    listOfString.set(finalI, "Java Squad 14");
                });

        }
        executorService.shutdown();
        System.out.println("this is the size of my listOfStrings ----> "+ listOfString.length());
//        System.out.println("this is the size of my listOfStrings ----> "+ listOfString.length);
    }
}
