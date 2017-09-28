package com.hadihariri.demos.kotlin.clean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsJava {

    public static List<Integer> elements() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
    public static void main(String[] args) {

        // equivalent of generateSequence ...... Stream.generate()
        IntStream numbers = IntStream.range(1, 100);



        // elements().stream().filter()

    }
}
