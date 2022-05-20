package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

      @Test
    void getTitle() {
        Book deez = new Book("Deez nuts",69,420);

        String expected = "Deez nuts";
        String actual = deez.getTitle();

        assertEquals(expected, actual);

    }

    @Test
    void getPages() {
        Book deez = new Book("Deez nuts",69,420);

        int expected = 69;
        int actual = deez.getPages();

        assertEquals(expected, actual);
    }

    @Test
    void getPublicationYear() {
        Book deez = new Book("Deez nuts",69,420);

        int expected = 420;
        int actual = deez.getPublicationYear();

        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        Book deez = new Book("Deez nuts",69,420);

        String expected = "Deez nuts, 69, 420";
        String actual = deez.toString();

        assertEquals(expected, actual);
    }

    @Test
    void setTitle() {
        Book deez = new Book("Deez nuts",69,420);

        deez.setTitle("lol");

        String expected = "lol";
        String actual = deez.getTitle();

        assertEquals(expected, actual);
    }

    @Test
    void setPages() {
        Book deez = new Book("Deez nuts",69,420);

        deez.setPages(420);

        int expected = 420;
        int actual = deez.getPages();

        assertEquals(expected, actual);
    }

    @Test
    void setPublicationYear() {
        Book deez = new Book("Deez nuts",69,420);

        deez.setPublicationYear(69);

        int expected = 69;
        int actual = deez.getPublicationYear();

        assertEquals(expected, actual);
    }
}