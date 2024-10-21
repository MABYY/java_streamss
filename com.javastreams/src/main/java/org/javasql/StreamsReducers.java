package org.javasql;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsReducers {
    public static void show(){
        System.out.println("Stream reducers");

        List<Movie> movies = List.of(
                new Movie("a", 1),
                new Movie("b", 2),
                new Movie("c", 3)
        );

//        var result = movies.stream()
//                .anyMatch(a-> a.getLikes() ==3);
//        var result = movies.stream()
//                .allMatch(a-> a.getLikes() ==3);

//        var result = movies.stream().findFirst().get();

        var result = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();

        System.out.println(result.getTitle());

        Optional<Integer> totalLikes = movies.stream()
                .map(Movie::getLikes)
                .reduce((a,b)-> a+b);


        System.out.println("totalLikes: " + totalLikes.orElse(0));

        var totalLikesBis = movies.stream()
                .map(Movie::getLikes)
                .reduce(0,Integer::sum);


        System.out.println("totalLikesBis: " + totalLikesBis);




    }
}
