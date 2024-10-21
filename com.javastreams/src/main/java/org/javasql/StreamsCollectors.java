package org.javasql;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsCollectors {
    public static void show(){

        System.out.println("Stream collectors");
        List<Movie> movies = List.of(
                new Movie("a", 1),
                new Movie("b", 2),
                new Movie("c", 3)
        );

        var result = movies.stream()
                .filter(m->m.getLikes() <3)
                .collect(Collectors.toMap(m->m.getTitle(), m-> m.getLikes()));
                //.collect(Collectors.toList());

        System.out.println(result);

        var result2 = movies.stream()
                .filter(m->m.getLikes() <3)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity() ));
                //.collect(Collectors.toMap(Movie::getTitle,m->m ));
        System.out.println(result2);

        var result3 = movies.stream()
                .filter(m->m.getLikes() <3)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println(result3);

        var result4 = movies.stream()
                .filter(m->m.getLikes() <3)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(result4);

    }
}
