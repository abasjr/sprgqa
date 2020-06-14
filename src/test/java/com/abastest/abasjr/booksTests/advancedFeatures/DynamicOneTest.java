package com.abastest.abasjr.booksTests.advancedFeatures;

import org.junit.jupiter.api.Test;

public class DynamicOneTest {

    @Test
    public void test(){
        String[] input = {"A", "B", "C"};
        for (String s : input) {
            exercise(s);
        }
    }

    private void exercise(String s) {
        System.out.println(s);
    }

    // A
    // B
    // C
    
}