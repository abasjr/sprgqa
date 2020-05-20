package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("simple")
public class TagTest {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}

