package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class TvShowList {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList list = new ArrayList<TvShow>();

    public static void printList() {
        System.out.println("Entering nothing will stop the loop");
        String name = "placeholder";
        String episodes;
        String genre;


        while (true) {
            System.out.println("Name of the show: ");
            name = scanner.nextLine();
            System.out.println("How many episodes? ");
            episodes = scanner.nextLine();
            System.out.println("What is the genre?");
            genre = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            list.add(new TvShow(name, episodes, genre));
        }
        System.out.println(list);

    }
}