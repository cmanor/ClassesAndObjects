package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
        static Scanner scanner = new Scanner(System.in);
        static ArrayList<Animal> list = new ArrayList<>();

        public static void printList() {
                System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        String name = "placeholder";
        String isDog = "true";
        while (true) {
            System.out.println("Please enter a name: ");
            name = scanner.nextLine();
            System.out.println("It is a dog, true or false: ");
            isDog = scanner.nextLine();
            if (name.equals("") && isDog.equals("")) {
                break;
            }
            list.add(new Animal(name, Boolean.parseBoolean(isDog)));
        }
            System.out.println(list);

    }
}