package org.javasql;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoGroup {
    public static void show(){

        System.out.println("Stream Grouping Elements");

        List<MovieG> movies = List.of(
                new MovieG("a", 1, Genre.ACTION),
                new MovieG("b", 2 , Genre.COMEDY) ,
                new MovieG("c", 3, Genre.THRILLER)
        );

        var result = movies.stream()
                .collect(Collectors.groupingBy(MovieG::getGenre));

        System.out.println(result);

        var result2 = movies.stream()
                .collect(Collectors.groupingBy(MovieG::getGenre,
                        Collectors.counting()));

        System.out.println(result2);

    }
}
