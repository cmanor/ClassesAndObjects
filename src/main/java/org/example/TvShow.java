package org.example;

public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public TvShow (String name, int episodes, String genre) {
        this.setName(name);
        this.setEpisodes(episodes);
        this.setGenre(genre);
    }public TvShow (String name) {
        this.setName(name);
    }public TvShow (String name, int episodes) {
        this.setName(name);
        this.setEpisodes(episodes);
    }public TvShow (String name, String genre) {
        this.setName(name);
        this.setGenre(genre);
    }


    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString(){
        return "The name of the show is " + getName() + " with " + getEpisodes() + " episodes. The genre is " + getGenre() + ".";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
