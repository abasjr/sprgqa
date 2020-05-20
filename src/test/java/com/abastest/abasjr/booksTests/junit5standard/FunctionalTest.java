package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("functional")
public class FunctionalTest {
    @Test
    void testOne() {
        System.out.println("Functional Test 1");
    }

    @Test
    void testTwo() {
        System.out.println("Functional Test 2");
    }
}