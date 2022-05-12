package org.example;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book (String title, int pages, int publicationYear) {
        this.setTitle(title);
        this.setPages(pages);
        this.setPublicationYear(publicationYear);
    }public Book (String title) {
        this.setTitle(title);
    }public Book (String title, int pages) {
        this.setTitle(title);
        this.setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public String toString(){
        return getTitle() + ", " + getPages() + ", " + getPublicationYear();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}