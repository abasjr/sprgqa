package com.abastest.abasjr.booksTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.*;

import org.junit.jupiter.api.Test;

public class TimeoutWithResult {

    @Test
    void testExceededWithResult(){
        String actualResult = assertTimeout(ofMinutes(1), () -> {
            return "hi abas";
        });

        assertEquals("hi abas", actualResult);
    }
    
    @Test
    void testExceededWithMethod(){
        String actualGreeting = assertTimeout(ofMinutes(1), TimeoutWithResult::greeting); //tanda :: adalah untuk method static

        assertEquals("hello abas!", actualGreeting);
    }

    private static String greeting(){
        return "hello abas!";
    }

}