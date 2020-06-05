package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class RepeatedAdvTests {
    
    @RepeatedTest(value = 2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!")
    void customeDisplayName(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
        // Repeat! 1/2
        // Repeat! 2/2
    }

    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Test using long display name")
    void customDisplayNameWithLongPattern(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        // Test using long display name :: repetition 1 of 2
        // Test using long display name :: repetition 2 of 2
    }

    @RepeatedTest(value = 2, name = RepeatedTest.SHORT_DISPLAY_NAME)
    @DisplayName("Test using short display name")
    void customDisplayNameWithShortPattern(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        // repetition 1 of 2
        // repetition 2 of 2
    }
}