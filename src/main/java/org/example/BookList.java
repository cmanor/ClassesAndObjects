package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Book> list = new ArrayList<>();


    public static void printList() {
        System.out.println("Entering nothing will stop the loop");
        String name = "placeholder";
        int publicationYear;
        int pages;


        while (true) {
            System.out.println("Name of the book: ");
            name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("How many pages? ");
            pages = Integer.parseInt(scanner.nextLine());
            System.out.println("What year was is published?");
            publicationYear = Integer.parseInt(scanner.nextLine());

            list.add(new Book(name, pages, publicationYear));
        }
        System.out.println("What should I print? (type \"everything\" or \"name\")" );
        String input = scanner.nextLine();
        if (input.equals("everything")){
            for (Book book : list) System.out.println(book.toString());
        } else {
            for (Book book : list) System.out.println(book.getTitle());
        }
    }
}