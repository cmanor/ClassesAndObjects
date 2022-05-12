package org.example;

public class TvShow {
    private String name;
    private String episodes;
    private String genre;

    public TvShow (String name, String episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public String getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString(){
        return "The name of the show is " + getName() + " with " + getEpisodes() + " episodes. The genre is " + getGenre() + ".";
    }
}
