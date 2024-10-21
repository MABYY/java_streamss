package org.javasql;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamsDemo {
    public static void show(){

        // From arrays
        System.out.println("Stream from array");

        int[] numbers = { 1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));


        // From objects
        System.out.println("Stream from objects");
        var streamObj = Stream.of(1,2,3);
        streamObj.forEach(n -> System.out.println(n));

        // From function
        System.out.println("Stream from function");
        var streamF = Stream.generate(()->Math.random()); // Lazy evaluation
        streamF.limit(3)
                .forEach(el-> System.out.println(el));

        // From Iterate method
        System.out.println("Stream from iterate method");
        var streamIM = Stream.iterate(1, n->n + 1); // Lazy evaluation
        streamIM.limit(3)
                .forEach(el-> System.out.println(el));

    }
}
