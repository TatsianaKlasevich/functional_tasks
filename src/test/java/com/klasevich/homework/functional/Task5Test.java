package com.klasevich.homework.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @ParameterizedTest
    @MethodSource("getArgumentsForCreatingPalindromeOrNoMap")
    void createPalindromeOrNoMapTest(String[] words, Map<Boolean, List<String>> expected) {
        Map<Boolean, List<String>> actual = Task5.createPalindromeOrNoMap(words);
        assertEquals(actual, expected);
    }

    static Stream<Arguments> getArgumentsForCreatingPalindromeOrNoMap() {
        Map<Boolean, List<String>> map1 = new HashMap<>();
        map1.put(true, List.of("aaaa", "aaa", "a", "aa"));

        Map<Boolean, List<String>> map2 = new HashMap<>();
        map2.put(true, List.of("level"));
        map2.put(false, List.of("bbaa", "ac"));

        return Stream.of(
                Arguments.of(new String[]{"aaaa", "aaa", "a", "aa"}, map1),
                Arguments.of(new String[]{"level", "bbaa", "ac"}, map2)
        );
    }
}