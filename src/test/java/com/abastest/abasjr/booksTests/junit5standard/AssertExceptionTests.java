package com.abastest.abasjr.booksTests.junit5standard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AssertExceptionTests {
    
    @Test
    void exceptionTest(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
        {
            throw new IllegalArgumentException("Pesaann"); 
        } );

        assertEquals("Pesaann", exception.getMessage());
    }
    // () -> lambda / anonymous class (java 8) 
}