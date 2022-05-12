package org.example;

public class Main {
    public static void main(String[] args) {
        AnimalList.printList();
        TvShowList.printList();
        BookList.list.add(new Book("fake name1", 1, 1000));
        BookList.list.add(new Book("fake name2", 1, 1000));
        BookList.list.add(new Book("fake name3", 1, 1000));
        BookList.printList();


        var counter = new Counter();
        counter.decrease();
        counter.decrease(1);
        counter.increase();
        counter.increase(1);
        counter.setCounter(1);
    }
}



