package com.demo.mvcreversestring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    
    @Test
    void reverseSentenceWithInvalidInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	service.reverseSentence(null);
        });
    }
}