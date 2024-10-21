package org.javasql;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapStreams {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a", 1),
                new Movie("b", 2),
                new Movie("c", 3)
        );

        System.out.println("Mapping Elements");

        movies.stream()
                .map(m->m.getTitle())
                .forEach(name-> System.out.println(name));

        System.out.println("Mapping Elements");
        var streamMap = Stream.of(List.of(1,2,3), List.of(4,5,6));
        streamMap.forEach(l -> System.out.println(l));

        var streamMap2 = Stream.of(List.of(1,2,3), List.of(4,5,6));
        streamMap2.flatMap(l -> l.stream())
                .forEach(el-> System.out.println(el));

        System.out.println("Filter Streams");
        Predicate<Movie> isNOTPop = movie -> movie.getLikes() < 3;
        movies.stream()
                .filter(isNOTPop)
                .forEach(m-> System.out.println(m.getTitle()));
//        movies.stream()
//                .filter(m->m.getLikes()<3)
//                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("Sort Streams");

        List<Movie> moviesBis = List.of(
                new Movie("e", 1),
                new Movie("c", 2),
                new Movie("w", 3)
        );

        // 1 - Implement Comparable IF in Movie class: only works for one parameter
        // 2 - check...

//        moviesBis.stream()
//                .sorted((a,b)-> a.getTitle().compareTo(b.getTitle()))
//                .forEach(a-> System.out.println(a.getTitle()));
//        moviesBis.stream()
//                .sorted(Comparator.comparing(m->m.getTitle()))
//                .forEach(a-> System.out.println(a.getTitle()));
        moviesBis.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(a-> System.out.println(a.getTitle()));
    }

}
