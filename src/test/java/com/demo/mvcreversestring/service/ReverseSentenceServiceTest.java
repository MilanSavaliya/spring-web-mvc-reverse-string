package com.demo.mvcreversestring.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.mvcreversestring.service.ReverseSentenceService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;

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