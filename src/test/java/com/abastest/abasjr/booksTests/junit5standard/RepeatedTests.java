package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTests {
   
    @RepeatedTest(3)
    void repTest(){
        System.out.println("Repeat Test");
    }

    // Repeat Test
    // Repeat Test
    // Repeat Test
}