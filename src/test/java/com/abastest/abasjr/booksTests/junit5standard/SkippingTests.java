package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("All test in this class will be skipped")
public class SkippingTests {
    @Test
    void skippedTestOne(){

    }

    @Test
    void skippedTestTwo(){

    }
}