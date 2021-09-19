package com.klasevich.homework.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @ParameterizedTest
    @MethodSource("getArgumentsForDisjunctAllPredicates")
    void disjunctAllPredicatesTest(List<IntPredicate> predicates, Boolean expected) {
        Boolean actual = Task2.disjunctAll(predicates).test(2);
        assertEquals(actual, expected);
    }

    static Stream<Arguments> getArgumentsForDisjunctAllPredicates() {

        IntPredicate predicate1 = value -> false;
        IntPredicate predicate2 = value -> false;
        IntPredicate predicate3 = value -> false;
        IntPredicate predicate4 = value -> true;

        return Stream.of(
                Arguments.of(List.of(), false),
                Arguments.of(List.of(predicate1, predicate2), false),
                Arguments.of(List.of(predicate3, predicate4), true));
    }
}