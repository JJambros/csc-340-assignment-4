package com.csc340.jpademo.student;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Nonnull
    private String name;

    @Nonnull
    private String platform;

    @Nonnull
    private int release_year;

    @Nonnull
    private String genre;

    @Nonnull
    private String publisher;

    private String developer;

    private String rating;

    public Game() {
    }

    public Game(String name, String platform, int release_year, String genre, String publisher, String developer, String rating) {
        this.name = name;
        this.platform = platform;
        this.release_year = release_year;
        this.genre = genre;
        this.publisher = publisher;
        this.developer = developer;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

}