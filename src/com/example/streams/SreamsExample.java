package com.example.streams;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SreamsExample {
    public static void main(String[] args) {
        // count, min , max
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        System.out.println(stream.count());

        Integer minValue = Stream.of(1,2,3,4,5,6,7,8).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minValue);

        Integer maxValue = Stream.of(1,2,3,4,5,6,7,8).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxValue);
    }
}
