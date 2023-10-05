package com.example.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        // create a stream of array
        Stream<String> stream = Stream.of("abc" , "def" , "ghi");
        stream.forEach(System.out::println);

        // create a stream from collection source
        Collection<String> collectionStream = Arrays.asList("mani", "sai", "deepak");
        Stream<String> stream2 = collectionStream.stream();
        stream2.forEach(System.out::println);

        // create a stream from list source
        List<String> list = Arrays.asList("hello" , "hi" ,"all");
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::println);

        // create a stream from set source
        Set<String> set = new HashSet<>(list);
        Stream<String> setStream = set.stream();
        setStream.forEach(System.out::println);

        String[] strArray = {"ma", "n", "i"};
        Stream<String> streamArray = Arrays.stream(strArray);
        streamArray.forEach(System.out::println);
    }
}
