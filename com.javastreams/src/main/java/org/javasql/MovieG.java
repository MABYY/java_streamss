package org.javasql;

public class MovieG {
    private String title;
    private int likes;
    private Genre genre;


    public MovieG(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }


    public Genre getGenre() {
        return genre;
    }
}
