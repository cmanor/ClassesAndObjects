package org.example;

public class Counter {
    private int counter;

    public Counter (int startValue) {
        setCounter(startValue);
    }
    public Counter () {
        setCounter(0);
    }

    public int value() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public void increase (){
        counter += 1;
    }
    public void increase (int increaseBy){
        if(increaseBy<=0)
            return;
        counter += increaseBy;
    }public void decrease (int decreaseBy){
        if(decreaseBy<=0)
            return;
        counter += decreaseBy;
    }

    public void decrease(){
        counter -=1;
    }

}
