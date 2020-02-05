package com.milan.mvcreversestring.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSentenceServiceTest {

    private ReverseSentenceService service;

    @BeforeEach
    void setUp() {
        service = new ReverseSentenceService();
    }

    @Test
    void reverseSentence() {
        String input = "Good Morning!";
        String expected = "Morning! Good";
        String actual = service.reverseSentence(input);
        assertEquals(expected, actual);
    }
}