package com.theater.theater_project.models;
import java.util.List;

public class Play {

    private Long id;
    private String title;
    private Artist author;
    private String genre;
    private int durationMinutes;
    private String synopsis;
    private List<Artist> cast;

    public Play(Long id, String title, Artist author, String genre, int durationMinutes, String synopsis, List<Artist> cast) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
        this.synopsis = synopsis;
        this.cast = cast;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Artist getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public List<Artist> getCast() {
        return cast;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Artist author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setCast(List<Artist> cast) {
        this.cast = cast;
    }
}