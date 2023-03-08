package org.example;

public class CounterIncrementer {

    private int count = 0;


    public void increment(){
        ++this.count;
    }

    public int getCounter (){
        return this.count;
    }


}
