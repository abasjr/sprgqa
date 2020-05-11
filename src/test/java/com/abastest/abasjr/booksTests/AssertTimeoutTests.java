package com.abastest.abasjr.booksTests;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofMillis;


public class AssertTimeoutTests {
    @Test
    void timeoutNotExceeded(){
        assertTimeout(ofMinutes(2), () -> 
        {
            // Disini harusnya dimasukan task yang tidak melebihi 2 menit
        } );
    }
    
    @Test
    void timeoutExceeded(){
        assertTimeout(ofMillis(110), () ->
        {
            Thread.sleep(100);        // bentuk lambda expression
        });
    }

        // atau bisa juga
    @Test
    void timeoutExceededSimple(){
        assertTimeout(ofMillis(110), () -> Thread.sleep(100)); // bentuk lambda expression
    }

}