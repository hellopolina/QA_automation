package ru.alfabank.homework14.movie_14_1;

public class Movie {
    private String name;
    private double rating;

    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
