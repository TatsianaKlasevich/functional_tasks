package com.klasevich.homework.functional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.klasevich.homework.functional.Task3.commonRequestHandler;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    private static final String REQUEST_DATA = "<type>payment</type><sum>100000</sum>" +
            "<order_id>e94dc619-6172-4ffe-aae8-63112c551570</order><desc>We'd like to buy an elephant</desc>";
    private static final String RESULT_DATA = "<request><transaction><type>payment</type><sum>100000</sum>" +
            "<order_id>e94dc619-6172-4ffe-aae8-63112c551570</order><desc>We'd like to buy an elephant</desc>" +
            "</transaction><digest>CZVMYTgc3iiOdJjFP+6dhQ==</digest></request>";
    Task3.Request notCompletedRequest;

    @BeforeEach
    void setUp() {
        notCompletedRequest = new Task3.Request(REQUEST_DATA);
    }

    @Test
    void requestHandlerTest() {
        String actual = commonRequestHandler.handle(notCompletedRequest).getData();
        assertEquals(actual, RESULT_DATA);
    }
}