package ru.alfabank.homework14.movie_14_1;

import java.util.ArrayList;
import java.util.List;

public class App {

    static void main() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Интерстеллар", 8.7));
        movies.add(new Movie("Шрек", 8.1));
        movies.add(new Movie("Начало", 8.8));
        movies.add(new Movie("Веном", 6.6));

        System.out.println("Список фильмов до сортировки: ");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nСписок фильмов до сортировки: ");
        movies.sort(new MovieRatingComparator());
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

}
