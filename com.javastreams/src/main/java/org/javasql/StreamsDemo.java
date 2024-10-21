package org.javasql;

import java.util.List;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a", 1),
                new Movie("b", 2),
                new Movie("c", 3)
        );

        int count = 0;

        for (var m: movies){
            if(m.getLikes()<3){
                count++;
            }
        }
        System.out.println(count);

        // Using Streams

        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() < 3)
                .count();







    };
}
